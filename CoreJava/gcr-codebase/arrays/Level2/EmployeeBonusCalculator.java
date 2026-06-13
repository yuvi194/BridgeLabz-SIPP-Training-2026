import java.util.*;
public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        double[] salaries = new double[n];
        double[] Service = new double[n];
        double[] bonus = new double[n];
        double[] newSalaries = new double[n];
        double totalBonus = 0;
        double oldSalary = 0;
        double newSalary = 0;
        System.out.println("Enter Details of " + n + " Employees");
        for (int i = 0; i < salaries.length; i++) {
            while (true) {
                System.out.print("Enter Salary of Employee " + (i + 1) + ": ");
                if (sc.hasNextDouble()) {
                    salaries[i] = sc.nextDouble();
                    if (salaries[i] > 0) {
                        break;
                    } else {
                        System.out.println("Error: Salary must be greater than 0.");
                    }
                } else {
                    System.out.println("Error: Invalid salary input.");
                    sc.next();
                }
            }
            while (true) {
                System.out.print("Enter Years of Service of Employee " + (i + 1) + ": ");
                if (sc.hasNextDouble()) {
                    Service[i] = sc.nextDouble();
                    if (Service[i] >= 0) {
                        break;
                    } else {
                        System.out.println("Error: Years of service cannot be negative.");
                    }
                } else {
                    System.out.println("Error: Invalid years of service input.");
                    sc.next();
                }
            }
        }
        for (int i = 0; i < salaries.length; i++) {
            if (Service[i] > 5) {
                bonus[i] = salaries[i] * 0.05;
            } else {
                bonus[i] = salaries[i] * 0.02;
            }
            newSalaries[i] =salaries[i] + bonus[i];
            totalBonus += bonus[i];
            oldSalary += salaries[i];
            newSalary += newSalaries[i];
        }
        System.out.println("\nEmployee Salary Report");
        System.out.println("------------------------------------------------------------");
        System.out.printf("%-10s %-12s %-12s %-12s %-12s%n","Employee", "Old Salary", "Service", "Bonus", "New Salary");
        System.out.println("------------------------------------------------------------");
        for (int i = 0; i < salaries.length; i++) {
            System.out.printf("%-10d %-12.2f %-12.2f %-12.2f %-12.2f%n",(i + 1),salaries[i],Service[i],bonus[i],newSalaries[i]);
        }
        System.out.println("------------------------------------------------------------");
        System.out.printf("Total Old Salary : %.2f%n", oldSalary);
        System.out.printf("Total Bonus      : %.2f%n", totalBonus);
        System.out.printf("Total New Salary : %.2f%n", newSalary);
        sc.close();
    }
}