--  Create Indexes on Frequently Searched Columns

CREATE INDEX idx_country_date
ON covid_cases(country_id, date);

CREATE INDEX idx_date
ON covid_cases(date);


--  Optimize Top 10 High Infection Rate Queries

CREATE INDEX idx_infection_rate
ON covid_cases(infection_rate);

SELECT country_id, infection_rate
FROM covid_cases
ORDER BY infection_rate DESC
LIMIT 10;


-- Analyze Query Execution Plans

EXPLAIN
SELECT c.country_name, cc.confirmed_cases, d.death_count
FROM covid_cases cc
INNER JOIN countries c
ON cc.country_id = c.country_id
INNER JOIN covid_deaths d
ON cc.country_id = d.country_id
WHERE cc.date = '2026-01-01';


-- Problem 29: Implement ACID Transaction for Vaccine Data

START TRANSACTION;

INSERT INTO covid_vaccines
(country_id, date, vaccine_doses)
VALUES (1, '2026-01-01', 10000);

INSERT INTO covid_vaccines
(country_id, date, vaccine_doses)
VALUES (2, '2026-01-01', 15000);

-- If all queries are successful
COMMIT;

-- If any query fails
-- ROLLBACK;


-- Problem 30: Demonstrate Isolation Levels

-- Transaction 1
SET TRANSACTION ISOLATION LEVEL READ COMMITTED;

START TRANSACTION;

SELECT *
FROM covid_cases
WHERE country_id = 1;

COMMIT;


-- Transaction 2
SET TRANSACTION ISOLATION LEVEL SERIALIZABLE;

START TRANSACTION;

SELECT *
FROM covid_cases
WHERE country_id = 1;

COMMIT;


-- Prevent Dirty Reads
SET TRANSACTION ISOLATION LEVEL READ COMMITTED;


-- Prevent Non-Repeatable Reads
SET TRANSACTION ISOLATION LEVEL REPEATABLE READ;


-- Prevent Phantom Reads
SET TRANSACTION ISOLATION LEVEL SERIALIZABLE;