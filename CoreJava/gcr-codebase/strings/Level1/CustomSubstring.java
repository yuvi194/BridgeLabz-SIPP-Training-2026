import java.util.*;
public class CustomSubstring {
    public static String createSubstring(
            String str,
            int start,
            int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += str.charAt(i);
        }
        return result;
    }
    public static boolean compareStrings(
            String str1,
            String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Text: ");
        String str = sc.next();
        System.out.print("Enter Start Index: ");
        int left = sc.nextInt();
        System.out.print("Enter End Index: ");
        int right= sc.nextInt();
        if (left < 0 ||right > str.length() ||left > right) {
            System.out.println("Invalid Index");
            return;
        }
        String customSubstring =createSubstring(str, left, right);
        String builtInSubstring =str.substring(left, right);
        boolean isSame =compareStrings(customSubstring,builtInSubstring);
        System.out.println("Custom Substring: " + customSubstring);
        System.out.println("Built-in Substring: "+ builtInSubstring);
        System.out.println("Are Equal: "+ isSame);
        sc.close();
    }
}