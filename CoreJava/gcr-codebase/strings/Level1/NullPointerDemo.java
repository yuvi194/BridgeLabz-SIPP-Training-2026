public class NullPointerDemo {
    public static void generateException() {
        String str = null;
        System.out.println(str.length());
    }
    public static void handleException() {
        String str = null;
        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException Handled");
        }
    }
    public static void main(String[] args) {
         generateException();
        handleException();
    }
}