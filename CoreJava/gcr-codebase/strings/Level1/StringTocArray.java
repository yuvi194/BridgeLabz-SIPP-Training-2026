import java.util.*;
public class StringTocArray {
    public static char[] getcs(String str) {
        char[] cs =new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            cs[i] = str.charAt(i);
        }
        return cs;
    }
    public static boolean compareArrays(
            char[] array1,
            char[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter str: ");
        String str = sc.next();
        char[] customArray =getcs(str);
        char[] builtInArray =str.toCharArray();
        boolean result =compareArrays(customArray,builtInArray);
        System.out.println("Custom Character Array:");
        for (char c : customArray) {
            System.out.print(c + " ");
        }
        System.out.println();
        System.out.println("Matches Built-in Method: "+ result);

        sc.close();
    }
}