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
                System.out.println("Not enough balance...!");
                continue;
            }else if (bet <= 0){
                System.out.println("Bet should be more than Rs.0");
                continue;
            }else {
                System.out.println();
                balance -= bet;
                System.out.println("Spinnig row....");
                System.out.println("------------------");

                String[] slotimages = new String[3];

                for (int i = 0 ; i < 3 ; i++){
                    String image = images[random.nextInt(images.length)];
                    System.out.printf("| %s ",image);
                    slotimages[i] = image ;
                }
                System.out.printf("|\n------------------\n");
                if (slotimages[0].equals(slotimages[1]) || slotimages[1].equals(slotimages[2])){
                    switch(slotimages[1]){
                        case "🎈" -> balance += bet*2;
                        case "🍇" -> balance += bet*3;
                        case "🍒" -> balance += bet*4;
                        case "🍓" -> balance += bet*5;
                        case "💵" -> balance += bet*10;
                    }
                }
            }

        }



    }
}
