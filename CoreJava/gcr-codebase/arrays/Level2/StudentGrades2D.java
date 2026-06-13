import java.util.*;
public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number Of Students: ");
        int students = sc.nextInt();
        double[][] marks =new double[students][3];
        double[] percentage =new double[students];
        String[] grades =new String[students];
        for (int i = 0; i < students; i++) {
            System.out.print("Physics: ");
            marks[i][0] = sc.nextDouble();
            System.out.print("Chemistry: ");
            marks[i][1] = sc.nextDouble();
            System.out.print("Maths: ");
            marks[i][2] = sc.nextDouble();
            percentage[i] =(marks[i][0]+ marks[i][1]+ marks[i][2]) / 3;
            if (percentage[i] >= 80)
                grades[i] = "A";
            else if (percentage[i] >= 60)
                grades[i] = "B";
            else if (percentage[i] >= 40)
                grades[i] = "C";
            else
                grades[i] = "F";
        }
        for (int i = 0; i < students; i++) {
            System.out.println( "Percentage = "+ percentage[i]+ " Grade = "+ grades[i]);
        }
        sc.close();
    }
}