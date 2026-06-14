import java.util.*;
public class WordLengthTable {
    public static String[] splitWords(String text) {
        return text.split(" ");
    }
    public static String[][] createTable(String[] words) {
        String[][] table = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(words[i].length());
        }
        return table;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        String[] words = splitWords(text);
        String[][] table = createTable(words);
        System.out.println("\nWord\tLength");
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t" + table[i][1]);
        }
        sc.close();
    }
}