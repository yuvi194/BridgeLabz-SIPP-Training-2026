import java.util.*;
public class StoreNumbersAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] nums = new double[10];
        double total = 0.0;
        int i = 0;
        while (true) {
            if (i == nums.length) {
                break;
            }
            System.out.print("Enter number: ");
            double num = sc.nextDouble();
            if (num<= 0) {
                break;
            }
            nums[i] = num;
            i++;
        }
        System.out.println("\nNumbers Entered:");
        for (int j = 0; j < i; j++) {
            System.out.println(nums[j]);
            total += nums[j];
        }
        System.out.println("Sum = " + total);
        sc.close();
    }
}