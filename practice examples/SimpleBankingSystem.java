import java.util.Scanner;

public class SimpleBankingSystem {

    static Scanner scanner = new Scanner(System.in);
    static double balance = 0 ;

    public static void main(String[] args){
        Boolean flag = Boolean.TRUE;
        while (flag == Boolean.TRUE){
            System.out.println("\n1 - Check Balance");
            System.out.println("2 - Deposit");
            System.out.println("3 - Withdraw");
            System.out.println("4 - Exit");

            System.out.printf("Enter your choice : ");
            int choice = scanner.nextInt();
            if (choice == 4){
                flag = Boolean.FALSE;
            }
            switch (choice){
                case 1 -> checkBalance();
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw();
                default -> System.out.println("invalid choice");
            }
        }
    }
    static void checkBalance(){
        System.out.printf("Balance is Rs %.2f\n" ,balance);
    }
    static double deposit(){
        System.out.print("Enter amount to deposit : Rs ");
        double amount = scanner.nextDouble();
        return amount;
    }
    static double withdraw(){
        System.out.print("Enter amount to withdraw : Rs ");
        double amount = scanner.nextDouble();

        if (amount > balance){
            System.out.println("Not enough funds in the account");
            return 0;
        }else{
            return amount;
        }
    }
}
