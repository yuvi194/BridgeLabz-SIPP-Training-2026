import java.util.*;
public class BMI2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number Of Persons: ");
        int n = sc.nextInt();
        double[][] personData = new double[n][3];
        String[] weightStatus = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Weight: ");
            personData[i][0] = sc.nextDouble();
            System.out.print("Height: ");
            personData[i][1] = sc.nextDouble();
            double heightMeter =personData[i][1] / 100;
            personData[i][2] =personData[i][0] /(heightMeter * heightMeter);
            if (personData[i][2] < 18.5)
                weightStatus[i] = "Underweight";
            else if (personData[i][2] < 25)
                weightStatus[i] = "Normal";
            else if (personData[i][2] < 30)
                weightStatus[i] = "Overweight";
            else
                weightStatus[i] = "Obese";
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Weight = " + personData[i][0]+ " Height = " + personData[i][1]+ " BMI = " + personData[i][2]+ " Status = " + weightStatus[i]);
        }
        sc.close();
    }
}