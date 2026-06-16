import java.util.Scanner;

public class PalindromeNumber {

    static int[] getDigits(int num) {

        int temp = num;
        int count = 0;

        while (temp > 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }

        return digits;
    }

    static int[] reverseArray(int[] arr) {

        int[] rev = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rev[i] = arr[arr.length - 1 - i];
        }

        return rev;
    }

    static boolean compareArrays(int[] a, int[] b) {

        if (a.length != b.length)
            return false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i])
                return false;
        }

        return true;
    }

    static boolean isPalindrome(int num) {

        int[] original = getDigits(num);
        int[] reverse = reverseArray(original);

        return compareArrays(original, reverse);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        System.out.println("Palindrome = " + isPalindrome(num));
    }
}