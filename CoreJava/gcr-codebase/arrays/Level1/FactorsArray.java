import java.util.*;
public class FactorsArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        if (num <= 0) {
            System.out.println("Invalid Input");
            return;
        }
        int max = 10;
        int[] factors = new int[max];
        int i = 0;
        for (int current = 1;current <= num;current++) {
            if (num % current == 0) {
                if (i == max) {
                    max *= 2;
                    int[] temp = new int[max];
                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }
                    factors = temp;
                }
                factors[i++] = current;
            }
        }
        System.out.println("Factors:");
        for (int j = 0; j < i; j++) {
            System.out.print(factors[j] + " ");
        }
        sc.close();
    }
}