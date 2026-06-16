import java.util.Scanner;

public class NumberTypes {

    static int sumFactors(int num) {

        int sum = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0)
                sum += i;
        }

        return sum;
    }

    static boolean isPerfect(int num) {
        return sumFactors(num) == num;
    }

    static boolean isAbundant(int num) {
        return sumFactors(num) > num;
    }

    static boolean isDeficient(int num) {
        return sumFactors(num) < num;
    }

    static int factorial(int n) {

        int fact = 1;

        for (int i = 1; i <= n; i++)
            fact *= i;

        return fact;
    }

    static boolean isStrong(int num) {

        int temp = num;
        int sum = 0;

        while (temp > 0) {

            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }

        return sum == num;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        System.out.println("Perfect = " + isPerfect(num));
        System.out.println("Abundant = " + isAbundant(num));
        System.out.println("Deficient = " + isDeficient(num));
        System.out.println("Strong = " + isStrong(num));
    }
}