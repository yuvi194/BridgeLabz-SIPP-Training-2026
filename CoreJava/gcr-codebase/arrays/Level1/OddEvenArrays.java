import java.util.*;
public class OddEvenArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int num = sc.nextInt();
        if (num <= 0) {
            System.out.println("Invalid Input");
            return;
        }
        int[] oddNumbers = new int[num / 2 + 1];
        int[] evenNumbers = new int[num / 2 + 1];
        int oddIndex = 0;
        int evenIndex = 0;
        for (int current = 1;
             current <= num;
             current++) {
            if (current % 2 == 0) {
                evenNumbers[evenIndex++] = current;
            } else {
                oddNumbers[oddIndex++] = current;
            }
        }
        System.out.println("\nOdd Numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println("\n\nEven Numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        sc.close();
    }
}