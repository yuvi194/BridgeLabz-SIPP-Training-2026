import java.util.*;
public class MeanHeightFootballTeam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] heights = new double[11];
        double sum = 0;
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height of player "+ (i + 1) + ": ");
            heights[i] = sc.nextDouble();
            if (heights[i] <= 0) {
                System.out.println("Invalid Height");
                return;
            }
            sum += heights[i];
        }
        double meanHeight = sum / heights.length;
        System.out.println("Mean Height = "+ meanHeight);
        sc.close();
    }
}