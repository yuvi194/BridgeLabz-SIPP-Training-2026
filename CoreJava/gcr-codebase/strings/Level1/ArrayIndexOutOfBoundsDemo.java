import java.util.Scanner;
public class ArrayIndexOutOfBoundsDemo {
    public static void generateException(String[] names) {
        System.out.println(names[names.length]);
    }
    public static void handleException(String[] names) {
        try {
            System.out.println(names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException Handled");
        } catch (RuntimeException e) {
            System.out.println("Runtime Exception Handled");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 3;
        String[] names = new String[size];
        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter Name " + (i + 1) + ": ");
            names[i] = scanner.next();
        }
        generateException(names);
        handleException(names);
        scanner.close();
    }
}