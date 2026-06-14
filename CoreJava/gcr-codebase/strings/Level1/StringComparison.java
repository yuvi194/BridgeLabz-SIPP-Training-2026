import java.util.*;
public class StringComparison {
    public static boolean compareStrings(String str1, String str2) {
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
        System.out.print("Enter First String: ");
        String first = sc.next();
        System.out.print("Enter Second String: ");
        String second = sc.next();
        boolean customResult =compareStrings(first, second);
        boolean builtInResult =first.equals(second);
        System.out.println("Using charAt(): " + customResult);
        System.out.println("Using equals(): " + builtInResult);
        sc.close();
    }
}