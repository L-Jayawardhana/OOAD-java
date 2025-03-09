import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your choice(rock , paper , scissor) : ");
        String playerchoice = scanner.nextLine().toLowerCase();



        if (playerchoice.equals("rock") || playerchoice.equals("paper") || playerchoice.equals("scissor")) {
            String[] computerChoices = {"rock", "paper", "scissor"};
            String computerchoice = computerChoices[random.nextInt(0, 3)];
            System.out.printf("computer choice is %s\n", computerchoice);

            if (playerchoice.equals(computerchoice)) {
                System.out.println("Game TIED..!");
            } else if (playerchoice.equals("rock") && computerchoice.equals("scissor") ||
                    playerchoice.equals("paper") && computerchoice.equals("rock") ||
                    playerchoice.equals("scissor") && computerchoice.equals("paper")) {
                System.out.println("you WON..!");
            } else {
                System.out.println("you LOSE..!");
            }
        } else {
            System.out.println("invalid input..!");
        }
    }
}