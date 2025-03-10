import java.util.Random;
import java.util.Scanner;

public class JavaSlotMachine {
    public static void main(String[] args){
        //java slot machine

        //declare variables
        //display welcome message
        //play if balance > 0
        //enter bet amount
        //      verify if bet > balance
        //      verify if bet > 0
        //      subtract bet from balance
        //spin row
        //print row
        //get payout
        //ask to play again
        //display exit msg and balance
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int balance = 100;
        int bet;
        String[] images = {"🎈", "💵" , "🍇" , "🍒" , "🍓"};
        System.out.println("Welcome to Java Slot Game");
        System.out.println("--------------------------");

        while (balance > 0){
            System.out.println();
            System.out.print("Enter your bet : ");
            bet = scanner.nextInt();

            if (bet > balance){
                System.out.printf("Not enough balance.! Your balance is Rs.%d\n",balance);
                continue;
            }else if (bet <= 0){
                System.out.println("Bet should be more than Rs.0");
                continue;
            }else {
                balance -= bet;
                System.out.println("Spinnig row....");
                System.out.println("------------------");

                String[] slotimages = new String[3];

                for (int i = 0 ; i < 3 ; i++){
                    String image = images[random.nextInt(images.length)];
                    System.out.printf("| %s ",image);
                    slotimages[i] = image ;
                }
                System.out.printf("|\n----------------\n");

                int payout = payOut(slotimages , bet);
                if (payout > 0){
                    System.out.printf("You won Rs.%d\n",payout);
                    balance += payout;
                }else{
                    System.out.printf("You lose Rs.%d\n" ,bet);
                }
                System.out.printf("Your balance is Rs.%d\n",balance);
                System.out.printf("\nDo you want play again(Y/N) : ");
                char choice = scanner.next().toUpperCase().charAt(0);

                while(choice != 'Y' && choice != 'N'){
                    System.out.printf("Invalid input Re enter (Y/N) : ");
                    choice = scanner.next().toUpperCase().charAt(0);                }
                if (choice == 'N'){
                    break;
                }
            }
        }
    }
    static int payOut(String[] slotimages , int bet){
        if (slotimages[0].equals(slotimages[1]) || slotimages[1].equals(slotimages[2])){
            return switch(slotimages[1]){
                case "🎈" -> bet*2;
                case "🍇" -> bet*3;
                case "🍒" -> bet*4;
                case "🍓" -> bet*5;
                case "💵" -> bet*7;
                default -> 0;
            };
        }else if(slotimages[0].equals(slotimages[1]) && slotimages[0].equals(slotimages[2])){
            return switch (slotimages[0]){
                case "🎈" -> bet*10;
                case "🍇" -> bet*15;
                case "🍒" -> bet*20;
                case "🍓" -> bet*25;
                case "💵" -> bet*30;
                default -> 0;
            };
        }else{
            return 0;
        }
    }
}
