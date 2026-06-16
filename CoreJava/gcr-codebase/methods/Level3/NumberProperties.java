import java.util.Scanner;

public class NumberProperties {

    static boolean isPrime(int num) {

        if (num <= 1)
            return false;

        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }

        return true;
    }

    static boolean isNeon(int num) {

        int square = num * num;
        int sum = 0;

        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }

        return sum == num;
    }

    static boolean isSpy(int num) {

        int sum = 0;
        int product = 1;
        int temp = num;

        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }

        return sum == product;
    }

    static boolean isAutomorphic(int num) {

        int square = num * num;

        return String.valueOf(square).endsWith(String.valueOf(num));
    }

    static boolean isBuzz(int num) {

        return num % 7 == 0 || num % 10 == 7;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        System.out.println("Prime = " + isPrime(num));
        System.out.println("Neon = " + isNeon(num));
        System.out.println("Spy = " + isSpy(num));
        System.out.println("Automorphic = " + isAutomorphic(num));
        System.out.println("Buzz = " + isBuzz(num));
    }
}