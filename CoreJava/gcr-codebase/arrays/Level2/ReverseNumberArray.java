import java.util.*;
public class ReverseNumberArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int number = sc.nextInt();
        if (number < 0) {
            System.out.println("Invalid Input");
            return;
        }
        int temp = number;
        int digitCount = 0;
        while (temp != 0) {
            digitCount++;
            temp /= 10;
        }
        int[] digits = new int[digitCount];
        temp = number;
        for (int i = 0; i < digitCount; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        System.out.print("Reverse Number = ");
        for (int digit : digits) {
            System.out.print(digit);
        }
        sc.close();
    }
}