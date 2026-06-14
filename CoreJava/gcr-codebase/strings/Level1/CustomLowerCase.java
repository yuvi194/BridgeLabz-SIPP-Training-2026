import java.util.*;
public class CustomLowerCase {
    public static String convertToLowerCase(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
            }
            result += ch;
        }
        return result;
    }
    public static boolean compareStrings(String str1,String str2) {
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
        String customLower =convertToLowerCase(str);
        String builtInLower =str.toLowerCase();
        boolean result =compareStrings(customLower,builtInLower);
        System.out.println("Custom Lowercase : "+ customLower);
        System.out.println("Built-in Lowercase : "+ builtInLower);
        System.out.println("Result Match : "+ result);
        sc.close();
    }
}