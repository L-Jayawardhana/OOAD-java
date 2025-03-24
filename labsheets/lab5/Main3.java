import java.util.Scanner;

public class Main3 {
    private static Scanner scanner = new Scanner(System.in);

    static RoboDog roboDog = new RoboDog("Doggy" , "D1" , 100);
    static RoboCat roboCat = new RoboCat("Kitty" , "C1" , 100);
    static RoboBird roboBird = new RoboBird("Birdy" , "B1" , 100);

    public static void main(String[] args){
        int choice;
        do{
            System.out.println("\nMain Menu");
            System.out.println("1 - Choose a PET");
            System.out.println("2 - Recharge Battery");
            System.out.println("3 - Compete");
            System.out.println("4 - Exit");
            System.out.print("Enter your choice :");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    chooseAPet();
                    break;
                case 2:
                    rechargePet();
                    break;
                case 3:
                    competeWithPet();
                    break;
                case 4:
                    System.out.println("Exiting...!");
                    break;
                default:
                    System.out.println("\nInvalid choice, try again.");
            }
        } while (choice != 4);
    }

    public static void chooseAPet() {
        int pet = getPetChoice();
        switch (pet) {
            case 1:
                System.out.println("\nYou chose Robo Dog");
                roboDog.guard();
                displayPetInfo(roboDog);
                break;
            case 2:
                System.out.println("\nYou chose Robo Cat");
                roboCat.climb();
                displayPetInfo(roboCat);
                break;
            case 3:
                System.out.println("\nYou chose Robo Bird");
                roboBird.fly();
                displayPetInfo(roboBird);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    public static void rechargePet() {
        int pet = getPetChoice();
        switch (pet) {
            case 1:
                roboDog.recharge();
                break;
            case 2:
                roboCat.recharge();
                break;
            case 3:
                roboBird.recharge();
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    public static void competeWithPet() {
        int pet = getPetChoice();
        switch (pet) {
            case 1:
                roboDog.compete();
                break;
            case 2:
                roboCat.compete();
                break;
            case 3:
                roboBird.compete();
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    public static int getPetChoice() {
        int pet;
        do {
            System.out.println("\nChoose a Pet:");
            System.out.println("1 - Robo Dog");
            System.out.println("2 - Robo Cat");
            System.out.println("3 - Robo Bird");
            System.out.print("Enter your choice: ");
            pet = scanner.nextInt();
            if (pet < 1 || pet > 3) {
                System.out.println("\nInvalid choice, try again.");
            }
        } while (pet < 1 || pet > 3);
        return pet;
    }

    public static void displayPetInfo(RoboPet pet) {
        System.out.println("Name: " + pet.getName() +
                " | Model Number: " + pet.getModel_number() +
                " | Battery Level: " + pet.getBattery_level() + "%");
    }
}