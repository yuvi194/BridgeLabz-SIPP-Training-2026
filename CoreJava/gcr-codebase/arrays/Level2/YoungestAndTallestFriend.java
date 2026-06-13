import java.util.*;
public class YoungestAndTallestFriend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[names.length];
        double[] heights = new double[names.length];
        for (int i = 0; i < names.length; i++) {
            while (true) {
                System.out.print("Enter age of " + names[i] + ": ");
                if (sc.hasNextInt()) {
                    ages[i] = sc.nextInt();
                    if (ages[i] > 0) {
                        break;
                    } else {
                        System.out.println("Age must be greater than 0.");
                    }
                } else {
                    System.out.println("Invalid age.");
                    sc.next();
                }
            }
            while (true) {
                System.out.print("Enter height of " + names[i] + " (in cm): ");
                if (sc.hasNextDouble()) {
                    heights[i] = sc.nextDouble();
                    if (heights[i] > 0) {
                        break;
                    } else {
                        System.out.println("Height must be greater than 0.");
                    }
                } else {
                    System.out.println("Invalid height.");
                    sc.next();
                }
            }
        }
        int youngest = 0;
        int tallest = 0;
        for (int i = 1; i < names.length; i++) {
            if (ages[i] < ages[youngest]) {
                youngest = i;
            }
            if (heights[i] > heights[tallest]) {
                tallest = i;
            }
        }
        System.out.println("\nYoungest Friend: " + names[youngest]);
        System.out.println("Tallest Friend : " + names[tallest]);
        sc.close();
    }
}