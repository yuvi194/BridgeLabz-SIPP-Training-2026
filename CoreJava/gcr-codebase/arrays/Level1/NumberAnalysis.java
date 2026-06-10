import java.util.*;
public class NumberAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        for (int i = 0; i< nums.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
        }
        for (int num : nums) {
            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println(num + " is Positive Even");
                } else {
                    System.out.println(num + " is Positive Odd");
                }
            } else if (num < 0) {
                System.out.println(num + " is Negative");
            } else {
                System.out.println(num + " is Zero");
            }
        }
        if (nums[0] > nums[nums.length - 1]) {
            System.out.println("First element is greater");
        } else if (nums[0] < nums[nums.length - 1]) {
            System.out.println("Last element is greater");
        } else {
            System.out.println("Both elements are equal");
        }

        sc.close();
    }
}
