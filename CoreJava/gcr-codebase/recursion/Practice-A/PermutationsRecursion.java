public class PermutationsRecursion {

    static void permutations(String str, String ans) {

        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            char current = str.charAt(i);

            String left = str.substring(0, i);
            String right = str.substring(i + 1);

            String remaining = left + right;

            permutations(remaining, ans + current);
        }
    }

    public static void main(String[] args) {

        String str = "ABC";

        permutations(str, "");
    }
}