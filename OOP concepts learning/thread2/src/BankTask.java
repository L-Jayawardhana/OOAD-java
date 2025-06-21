import java.util.Random;

public class BankTask implements Runnable {
    private Account account;
    private static final Random rand = new Random();

    public BankTask(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        // Simulate 5 transactions per thread
        for (int i = 0; i < 5; i++) {
            double amount = rand.nextInt(5000) + 1; // Random amount between 1 and 5000
            boolean deposit = rand.nextBoolean();

            try {
                if (deposit) {
                    account.deposit(amount);
                } else {
                    account.withdraw(amount);
                }
            } catch (InsufficientBalanceException e) {
                System.out.println(Thread.currentThread().getName() + ": " + e.getMessage());
            }

            // Optional: sleep to simulate delay
            try {
                Thread.sleep(rand.nextInt(1000));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
