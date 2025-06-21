public class Account {
    private double balance;
    private int accountNumber;

    public Account(double balance, int accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public synchronized void deposit(double amount) {
        System.out.println(Thread.currentThread().getName() + " depositing $" + amount);
        balance += amount;
        System.out.println("New Balance after deposit: $" + balance);
    }

    public synchronized void withdraw(double amount) throws InsufficientBalanceException {
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw $" + amount);
        if (amount > balance) {
            throw new InsufficientBalanceException();
        }
        balance -= amount;
        System.out.println("New Balance after withdrawal: $" + balance);
    }

    public synchronized double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public synchronized void displayBalance() {
        System.out.println("Account Number: " + accountNumber + ", Balance: $" + balance);
    }
}
