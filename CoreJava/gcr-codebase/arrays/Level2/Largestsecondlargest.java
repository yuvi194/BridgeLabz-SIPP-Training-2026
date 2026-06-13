import java.util.*;
public class Largestsecondlargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num;
        int max = 10;
        while (true) {
            System.out.print("Enter a positive num: ");

            if (sc.hasNextLong()) {
                num = sc.nextLong();
                if (num > 0) {
                    break;
                } else {
                    System.out.println("Error: num must be greater than 0.");
                }
            } else {
                System.out.println("Error: Invalid input. Enter a valid num.");
                sc.next();
            }
        }
        int[] digits = new int[max];
        int i = 0;
        while (num != 0) {
            digits[i] = (int) (num % 10);
            num = num / 10;
            i++;
            if (i == max) {
                break;
            }
        }
        int largest = -1;
        int secondlargest = -1;
        for (int j = 0; j < i; j++) {
            if (digits[j] > largest) {
                secondlargest = largest;
                largest = digits[j];
            } else if (digits[j] > secondlargest&& digits[j] != largest) {
                secondlargest = digits[j];
            }
        }
        System.out.print("\nDigits Stored: ");
        for (int j = 0; j < i; j++) {
            System.out.print(digits[j] + " ");
        }
        System.out.println("\nLargest Digit        : " + largest);
        if (secondlargest != -1) {
            System.out.println("Second Largest Digit : " + secondlargest);
        } else {
            System.out.println("Second Largest Digit : Not Available");
        }
        sc.close();
    }
}