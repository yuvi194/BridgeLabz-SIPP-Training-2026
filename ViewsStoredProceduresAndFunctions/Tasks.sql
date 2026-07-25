-- Problem 21: Create View for Latest COVID Data

CREATE VIEW latest_covid_data AS
SELECT 
    c.country_name,
    cc.confirmed_cases,
    cc.deaths,
    cc.recovered
FROM covid_cases cc
INNER JOIN countries c
ON cc.country_id = c.country_id
WHERE cc.date = (
    SELECT MAX(date)
    FROM covid_cases
);




DELIMITER //

CREATE FUNCTION CalculateMortalityRate(
    p_country_id INT,
    p_date DATE
)
RETURNS DECIMAL(10,2)
DETERMINISTIC
BEGIN
    DECLARE mortality_rate DECIMAL(10,2);

    SELECT (deaths / confirmed_cases) * 100
    INTO mortality_rate
    FROM covid_cases
    WHERE country_id = p_country_id
    AND date = p_date;

    RETURN mortality_rate;
END //

DELIMITER ;




DELIMITER //

CREATE PROCEDURE UpdateCovidStats(
    IN p_country_id INT,
    IN p_date DATE,
    IN p_confirmed_cases INT,
    IN p_deaths INT,
    IN p_recovered INT
)
BEGIN
    UPDATE covid_cases
    SET confirmed_cases = p_confirmed_cases,
        deaths = p_deaths,
        recovered = p_recovered
    WHERE country_id = p_country_id
    AND date = p_date;
END //

DELIMITER ;




DELIMITER //

CREATE FUNCTION CalculateRecoveryRate(
    p_country_id INT
)
RETURNS DECIMAL(10,2)
DETERMINISTIC
BEGIN
    DECLARE recovery_rate DECIMAL(10,2);

    SELECT (recovered / confirmed_cases) * 100
    INTO recovery_rate
    FROM covid_cases
    WHERE country_id = p_country_id
    ORDER BY date DESC
    LIMIT 1;

    RETURN recovery_rate;
END //

DELIMITER ;




CREATE TABLE covid_cases_audit (
    audit_id INT AUTO_INCREMENT PRIMARY KEY,
    country_id INT,
    old_confirmed_cases INT,
    new_confirmed_cases INT,
    old_deaths INT,
    new_deaths INT,
    old_recovered INT,
    new_recovered INT,
    change_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);


DELIMITER //

CREATE TRIGGER audit_covid_cases_update
BEFORE UPDATE ON covid_cases
FOR EACH ROW
BEGIN
    INSERT INTO covid_cases_audit (
        country_id,
        old_confirmed_cases,
        new_confirmed_cases,
        old_deaths,
        new_deaths,
        old_recovered,
        new_recovered
    )
    VALUES (
        OLD.country_id,
        OLD.confirmed_cases,
        NEW.confirmed_cases,
        OLD.deaths,
        NEW.deaths,
        OLD.recovered,
        NEW.recovered
    );
END //

DELIMITER ;