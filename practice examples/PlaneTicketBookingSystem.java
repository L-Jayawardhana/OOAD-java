
import java.util.Scanner;

public class PlaneTicketBookingSystem {
    private static Scanner input = new Scanner(System.in);
    private static int rows = 4;
    private static int[] seats = {18,20,20,18} ;
    private static int[][] planeSeats ;

    public static void main(String[] args) {
        initialiseRows();
        runMenu();
    }
    public static void runMenu() {
        System.out.println("Welcome to Flying Java..!");
        boolean quit = false;
        while (!quit) {
            int option = getOption();
            switch (option){
                case 0: quit = true; break;
                case 1:
                    buyTicket();
                    break;
                case 2:
                    showSeatingArea();
                    break;
                default:System.out.print("\nInvalid option!");
            }
        }
    }
    public static void buyTicket() {
        boolean validRow = false;
        do {
            System.out.print("Enter the ROW number: ");
            int row = input.nextInt();
            if (row > 0 && row <= rows) {
                validRow = true;
                boolean validSeat = false;
                do {
                    System.out.print("Enter the SEAT number: ");
                    int seat = input.nextInt();
                    if (seat > 0 && seat <= seats[row-1]) {
                            if (planeSeats[row-1][seat-1] == 0){
                                planeSeats[row-1][seat-1] = 1;
                                System.out.println("\nPurchase successful !");
                                validSeat = true;
                            } else {
                                System.out.println("\nThis seat is already taken! ,Please choose another seat!");
                            }
                    } else {
                        System.out.println("\nInvalid seat! Please enter a number between 1 and " + seats[row - 1] + ".");
                    }
                } while (!validSeat);
            } else {
                System.out.println("Invalid row number!");
            }
        } while (!validRow);
    }
    public static int getOption() {
        int option;
            System.out.println("\n+---------------------------------------------+");
            System.out.println("|                  MAIN MENU                  |");
            System.out.println("+---------------------------------------------+");
            System.out.println("|  1) Buy a plane ticket                      |");
            System.out.println("|  2) Show seating area and available seats   |");
            System.out.println("|  0) Quit                                    |");
            System.out.println("+---------------------------------------------+");
            System.out.print("Please select an option: ");
            option = input.nextInt();
            return option;
    }
    public static void initialiseRows(){
        planeSeats = new int[rows][];
        for(int i = 0 ; i < rows ; i++){
                planeSeats[i] = new int[seats[i]];
        }
    }
    public static void showSeatingArea(){
        System.out.println();
        System.out.println("===========================================================================================");
        System.out.println("                                        PLANE SEATING MAP                                    ");
        System.out.println("===========================================================================================");
        for (int i = 0; i < rows; i++){
            System.out.print("Row " + (i+1) + "  ");
            for (int j = 0; j < seats[i]; j++){
                if (j == 9){
                    System.out.print(" |  ");
                }
                System.out.print("[" + planeSeats[i][j] + "] ");
            }
            System.out.println();
        }
        System.out.println("===========================================================================================");
        System.out.println("          LEGEND:  [0] = Seat available,   [1] = Seat not available,  | = Aisle            ");
        System.out.println("===========================================================================================");
    }
}