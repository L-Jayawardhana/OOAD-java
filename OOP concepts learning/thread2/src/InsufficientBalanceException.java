public class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(double amount) {
        super("Insufficient balance for withdrawal of: $" + amount);
    }
}
