import java.util.*;
public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number Of Students: ");
        int students = sc.nextInt();
        double[] physics = new double[students];
        double[] chemistry = new double[students];
        double[] maths = new double[students];
        double[] percentage = new double[students];
        String[] grade = new String[students];
        for (int i = 0; i < students; i++) {
            System.out.print("Physics: ");
            physics[i] = sc.nextDouble();
            System.out.print("Chemistry: ");
            chemistry[i] = sc.nextDouble();
            System.out.print("Maths: ");
            maths[i] = sc.nextDouble();
            percentage[i] =(physics[i]+ chemistry[i]+ maths[i]) / 3;
            if (percentage[i] >= 80)
                grade[i] = "A";
            else if (percentage[i] >= 60)
                grade[i] = "B";
            else if (percentage[i] >= 40)
                grade[i] = "C";
            else
                grade[i] = "F";
        }
        for (int i = 0; i < students; i++) {
            System.out.println("Percentage = "+ percentage[i]+ " Grade = "+ grade[i]);
        }
        sc.close();
    }
}