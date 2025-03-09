import java.util.Random;
import java.util.Scanner;

public class DiceRollProgram {
    public static void main(String[] args) {
        //roll a dice for num of times and get the total of dices
        //gets ASCII arts for dice

        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int total = 0;

        System.out.print("How many dice you want to roll? : ");
        int roll = scanner.nextInt();

        if (roll <= 0){
            System.out.println("Invalid dice");
        }else{
            for (int i = 1; i <= roll; i++){
                int dice = rand.nextInt(1,7);
                System.out.printf("dice is %d\n", dice);
                PrintDice(dice);
                total += dice;
            }
            System.out.println("Total of the dice is " + total);
        }
    }
    public static void PrintDice(int dice) {
        //ASCII art for dice
        //using """ for multi-line string
        String dice1 = """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                """;
        String dice2 = """
                    -------
                   | ●     |
                   |       |
                   |     ● |
                    -------
                   """;
        String dice3 = """
                    -------
                   | ●     |
                   |   ●   |
                   |     ● |
                    -------
                   """;
        String dice4 = """
                    -------
                   | ●   ● |
                   |       |
                   | ●   ● |
                    -------
                   """;
        String dice5 = """
                    -------
                   | ●   ● |
                   |   ●   |
                   | ●   ● |
                    -------
                   """;
        String dice6 = """
                    -------
                   | ●   ● |
                   | ●   ● |
                   | ●   ● |
                    -------
                   """;

        switch(dice){
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println("Invalid dice");
        }
    }

}
