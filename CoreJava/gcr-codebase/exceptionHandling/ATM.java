class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String msg) {
        super(msg);
    }
}

public class ATM {
    public static void main(String[] args) {

        int balance = 5000;
        int withdraw = 8000;

        try {
            if (withdraw > balance) {
                throw new InsufficientBalanceException(
                        "Balance = ₹5000, Requested = ₹8000");
            }

            balance -= withdraw;
            System.out.println("Withdrawal Successful");

        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}