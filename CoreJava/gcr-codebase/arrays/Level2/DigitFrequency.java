import java.util.*;
public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        long number = sc.nextLong();
        if (number < 0) {
            System.out.println("Invalid Input");
            return;
        }
        int[] frequency = new int[10];
        while (number != 0) {
            int digit = (int)(number % 10);
            frequency[digit]++;
            number /= 10;
        }
        System.out.println("Digit Frequencies:");
        for (int digit = 0;digit < frequency.length;digit++) {
            if (frequency[digit] > 0) {
                System.out.println(digit + " = "+ frequency[digit]);
            }
        }
        sc.close();
    }
}