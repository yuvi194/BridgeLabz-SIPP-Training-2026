class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String msg) {
        super(msg);
    }
}

public class HospitalBilling {
    public static void main(String[] args) {

        try {
            int bill = 1000;
            int items = 0;
            System.out.println(bill / items);
        } catch (ArithmeticException e) {
            System.out.println("Error: Number of items cannot be zero.");
        }

        try {
            int patients[] = {1, 2, 3};
            System.out.println(patients[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid patient index.");
        }

        try {
            int amount = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number input.");
        }

        try {
            makePayment(500, 1000);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }

    static void makePayment(int balance, int amount)
            throws InsufficientFundsException {

        if (amount > balance) {
            throw new InsufficientFundsException(
                    "Payment Failed: Insufficient Funds");
        }

        System.out.println("Payment Successful");
    }
}