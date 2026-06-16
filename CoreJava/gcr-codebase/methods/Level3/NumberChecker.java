import java.util.Scanner;

public class NumberChecker {

    static int countDigits(int num) {
        int count = 0;

        while (num > 0) {
            count++;
            num /= 10;
        }

        return count;
    }

    static int[] getDigits(int num) {
        int count = countDigits(num);
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }

        return digits;
    }

    static boolean isDuck(int[] digits) {

        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;
            }
        }

        return false;
    }

    static boolean isArmstrong(int num, int[] digits) {

        int sum = 0;
        int power = digits.length;

        for (int digit : digits) {
            sum += (int) Math.pow(digit, power);
        }

        return sum == num;
    }

    static void largestSecondLargest(int[] digits) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int digit : digits) {

            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }

        System.out.println("Largest = " + largest);
        System.out.println("Second Largest = " + secondLargest);
    }

    static void smallestSecondSmallest(int[] digits) {

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int digit : digits) {

            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }

        System.out.println("Smallest = " + smallest);
        System.out.println("Second Smallest = " + secondSmallest);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        int[] digits = getDigits(num);

        System.out.println("Digit Count = " + countDigits(num));
        System.out.println("Duck Number = " + isDuck(digits));
        System.out.println("Armstrong Number = " + isArmstrong(num, digits));

        largestSecondLargest(digits);
        smallestSecondSmallest(digits);
    }
}