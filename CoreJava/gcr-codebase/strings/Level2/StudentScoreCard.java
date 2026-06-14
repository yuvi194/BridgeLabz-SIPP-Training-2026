import java.util.*;
public class StudentScoreCard {
    public static int[][] generateScores(int num) {
        int[][] scores = new int[num][3];
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                scores[i][j] = (int)(Math.random() * 90) + 10;
            }
        }
        return scores;
    }
    public static double[][] calculateResults(int[][] scores) {
        double[][] result = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total =scores[i][0] +scores[i][1] +scores[i][2];
            double average = total / 3.0;
            double percentage = average;
            average =Math.round(average * 100.0) / 100.0;
            percentage =Math.round(percentage * 100.0) / 100.0;
            result[i][0] = total;
            result[i][1] = average;
            result[i][2] = percentage;
        }
        return result;
    }
    public static String[] calculateGrades(double[][] result) {
        String[] grades =new String[result.length];
        for (int i = 0; i < result.length; i++) {
            double percentage = result[i][2];
            if (percentage >= 80) {
                grades[i] = "A";
            }
            else if (percentage >= 70) {
                grades[i] = "B";
            }
            else if (percentage >= 60) {
                grades[i] = "C";
            }
            else if (percentage >= 50) {
                grades[i] = "D";
            }
            else if (percentage >= 40) {
                grades[i] = "E";
            }
            else {
                grades[i] = "R";
            }
        }
        return grades;
    }
    public static void displayScoreCard(int[][] scores,double[][] result,String[] grades) {
        System.out.println("--------------------------------------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-12s %-10s%n","Physics","Chemistry","Maths","Total","Average","Percentage","Grade");
        System.out.println("--------------------------------------------------------------------------------");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10d %-10d %-10d %-10.0f %-10.2f %-12.2f %-10s%n",scores[i][0],scores[i][1],scores[i][2],result[i][0],result[i][1],result[i][2],grades[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number Of Students: ");
        int num =sc.nextInt();
        if (num <= 0) {
            System.out.println("Invalid Number Of Students");
            sc.close();
            return;
        }
        int[][] scores =generateScores(num);
        double[][] result =calculateResults(scores);
        String[] grades =calculateGrades(result);
        displayScoreCard(scores,result,grades);
        sc.close();
    }
}