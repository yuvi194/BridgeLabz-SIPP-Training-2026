import java.util.*;
public class Splitstr {
    public static String[] splitstr(String str) {
        int words = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                words++;
            }
        }
        String[] result = new String[words];
        String word = "";
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                word += str.charAt(i);
            } else {
                result[index++] = word;
                word = "";
            }
        }
        result[index] = word;
        return result;
    }
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length)
            return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i]))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter str: ");
        String str = sc.nextLine();
        String[] userSplit = splitstr(str);
        String[] builtInSplit = str.split(" ");
        System.out.println("Arrays Equal = "+ compareArrays(userSplit, builtInSplit));
        sc.close();
    }
}