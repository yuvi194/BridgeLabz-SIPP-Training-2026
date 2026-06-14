import java.util.*;
public class IllegalArgumentDemo {
    public static void generateException(String str) {
        System.out.println(str.substring(5, 2));
    }
    public static void handleException(String str) {
        try {
            System.out.println(str.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException Handled");
        } catch (RuntimeException e) {
            System.out.println("Runtime Exception Handled");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.next();
        generateException(str);
        handleException(str);
        sc.close();
    }
}