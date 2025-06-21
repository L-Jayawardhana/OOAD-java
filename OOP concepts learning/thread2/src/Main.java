public class Main {
    public static void main(String[] args) {
        Account sharedAccount = new Account(15000, 1234);

        Thread user1 = new Thread(new BankTask(sharedAccount), "User-1");
        Thread user2 = new Thread(new BankTask(sharedAccount), "User-2");
        Thread user3 = new Thread(new BankTask(sharedAccount), "User-3");

        user1.start();
        user2.start();
        user3.start();

        try {
            user1.join();
            user2.join();
            user3.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Final balance: $" + sharedAccount.getBalance());
    }
}
