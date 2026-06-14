import java.util.*;
public class UniqueCharacters {
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }
    public static char[] findUniqueCharacters(String text) {
        int length = findLength(text);
        char[] unique = new char[length];
        int index = 0;
        for (int i = 0; i < length; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (current == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                unique[index++] = current;
            }
        }
        char[] result = new char[index];
        for (int i = 0; i < index; i++) {
            result[i] = unique[i];
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Text: ");
        String text = sc.nextLine();
        char[] uniqueChars = findUniqueCharacters(text);
        System.out.println("\nUnique Characters:");
        for (int i = 0; i < uniqueChars.length; i++) {
            System.out.print(uniqueChars[i] + " ");
        }
        sc.close();
    }
}