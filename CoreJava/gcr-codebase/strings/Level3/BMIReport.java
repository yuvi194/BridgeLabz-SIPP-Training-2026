import java.util.*;
public class BMIReport {
    public static String[][] calculateBMI(double[][] personData) {
        String[][] result = new String[personData.length][4];
        for (int i = 0; i < personData.length; i++) {
            double weight = personData[i][0];
            double heightCm = personData[i][1];
            double heightMeter = heightCm / 100.0;
            double bmi = weight / (heightMeter * heightMeter);
            String status;
            if (bmi <= 18.4) {
                status = "Underweight";
            } else if (bmi <= 24.9) {
                status = "Normal";
            } else if (bmi <= 39.9) {
                status = "Overweight";
            } else {
                status = "Obese";
            }
            result[i][0] = String.valueOf(heightCm);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }
        return result;
    }
    public static void displayReport(String[][] report) {
        System.out.println("\n---------------------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Height", "Weight", "BMI", "Status");
        System.out.println("---------------------------------------------------------------");
        for (int i = 0; i < report.length; i++) {
            System.out.printf("%-10s %-10s %-10s %-15s%n",report[i][0],report[i][1],report[i][2],report[i][3]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int persons = 10;
        double[][] personData = new double[persons][2];
        for (int i = 0; i < persons; i++) {
            System.out.println("\nPerson " + (i + 1));
            do {
                System.out.print("Enter Weight (kg): ");
                personData[i][0] = sc.nextDouble();
                if (personData[i][0] <= 0) {
                    System.out.println("Invalid Weight!");
                }
            } while (personData[i][0] <= 0);
            do {
                System.out.print("Enter Height (cm): ");
                personData[i][1] = sc.nextDouble();
                if (personData[i][1] <= 0) {
                    System.out.println("Invalid Height!");
                }
            } while (personData[i][1] <= 0);
        }
        String[][] report = calculateBMI(personData);
        displayReport(report);
        sc.close();
    }
}