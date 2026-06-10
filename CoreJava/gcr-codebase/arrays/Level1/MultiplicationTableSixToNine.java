import java.util.*;
public class MultiplicationTableSixToNine{ 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int[] result = new int[4];
        for (int i = 0; i < result.length; i++) {
            result[i] = num * (i + 6);
        }
        for (int i = 0; i <result.length; i++) {
            System.out.println(num + " * "+ (i + 6) + " = "+ result[i]);
        }
        sc.close();
    }
}