import java.util.*;
public class StringLengthWithoutLength {
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter str: ");
        String str = sc.next();
        int userLength = findLength(str);
        int builtInLength = str.length();
        System.out.println("Use Defined Length = " + userLength);
        System.out.println("Built-in Length = " + builtInLength);
        sc.close();
    }
}