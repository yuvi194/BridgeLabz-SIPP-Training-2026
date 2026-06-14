import java.util.*;
public class StringIndexOutOfBoundsDemo {
    public static void generateException(String str) {
        System.out.println(str.charAt(str.length()));
    }
    public static void handleException(String str) {
        try {
            System.out.println(str.charAt(str.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException Handled");
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