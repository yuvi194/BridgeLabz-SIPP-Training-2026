import java.util.*;
public class PalindromeCheck {
    public static boolean method1(String text) {
        int start = 0;
        int end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static boolean method2(String text, int start, int end) {
        if (start >= end)
            return true;
        if (text.charAt(start) != text.charAt(end))
            return false;
        return method2(text, start + 1, end - 1);
    }
    public static boolean method3(String text) {
        char[] original = text.toCharArray();
        char[] reverse = new char[original.length];
        int index = 0;
        for (int i = original.length - 1; i >= 0; i--) {
            reverse[index++] = original[i];
        }
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        System.out.println("Method 1: " + method1(text));
        System.out.println("Method 2: " + method2(text, 0, text.length() - 1));
        System.out.println("Method 3: " + method3(text));
        sc.close();
    }
}