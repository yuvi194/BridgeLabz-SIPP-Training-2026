import java.util.*;
public class StudentVotingEligibility {
    public static int[] generateAges(int n) {
        int[] ages = new int[n];
        for (int i = 0; i < ages.length; i++) {
            ages[i] = (int) (Math.random() * 90);
        }
        return ages;
    }
    public static String[][] votingStatus(int[] ages) {
        String[][] result =new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] =String.valueOf(ages[i]);
            if (ages[i] >= 18) {
                result[i][1] = "Can Vote";
            } else {
                result[i][1] = "Cannot Vote";
            }
        }
        return result;
    }
    public static void display(String[][] result) {
        System.out.println("\nAge\tStatus");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0]+ "\t"+ result[i][1]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[] ages = generateAges(n);
        String[][] result = votingStatus(ages);
        display(result);
        sc.close();
    }
}