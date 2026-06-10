import java.util.*;
public class StudentVotingEligibility {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int[] age=new int[10];
        for(int i=0;i<age.length;i++){
            System.out.print("enter age"+(i+1)+":");
            age[i]=sc.nextInt();
        } 
        for(int studentAge:age){
            if(studentAge<0){
                System.out.println("Invalid Age:"+studentAge);
            }
            else if(studentAge>=18){
                System.out.println("Student with age "+studentAge+" can vote.");
            }
            else{
                System.out.println("Student with age "+studentAge+" cannot vote.");
            }
        }
        sc.close();
    }
}
