import java.util.*;
public class BMIArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Persons: ");
        int n = sc.nextInt();
        double[] heights = new double[n];
        double[] weights = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Weight (kg): ");
            weights[i] = sc.nextDouble();
            System.out.print("Height (cm): ");
            heights[i] = sc.nextDouble();
            double heightMeter = heights[i] / 100;
            bmi[i] =weights[i] /(heightMeter * heightMeter);
            if (bmi[i] < 18.5)
                status[i] = "Underweight";
            else if (bmi[i] < 25)
                status[i] = "Normal";
            else if (bmi[i] < 30)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }
        for (int i = 0; i < n; i++) {
            System.out.println(heights[i] + " cm "+ weights[i] + " kg "+ bmi[i] + " "+ status[i]);
        }
        sc.close();
    }
}