import java.util.*;
public class NumberFormatDemo {
    public static void generateException(String str) {
        int num = Integer.parseInt(str);
        System.out.println(num);
    }
    public static void handleException(String str) {
        try {
            int num = Integer.parseInt(str);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("numFormatException Handled");
        } catch (RuntimeException e) {
            System.out.println("Runtime Exception Handled");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter str: ");
        String str = sc.next();
        generateException(str);
        handleException(str);
        sc.close();
    }
}