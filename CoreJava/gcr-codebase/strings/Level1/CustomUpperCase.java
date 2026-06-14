import java.util.*;
public class CustomUpperCase {
    public static String convertToUpperCase(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
            }
            result += ch;
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
        System.out.print("Enter str: ");
        String str = sc.nextLine();
        String customUpper =convertToUpperCase(str);
        String builtInUpper =str.toUpperCase();
        boolean result =compareStrings(customUpper,builtInUpper);
        System.out.println("Custom Uppercase : "+ customUpper);
        System.out.println("Built-in Uppercase : "+ builtInUpper);
        System.out.println("Result Match : "+ result);
        sc.close();
    }
}