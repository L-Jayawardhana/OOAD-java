import java.util.Scanner;

public class Main13 {
    public static void main(String[] args) {

        // Runtime POLYMORPHISM = When the method that gets executed is decided
        //                        at runtime based on the actual type of the object.

        Scanner scanner = new Scanner(System.in);

        // we cant create a object directly as
        // Animals1 animal = new Animals();
        // because Animals1 is an abstract class

        Animals1 animal ;

        System.out.print("Enter the name of the animal (1 for cat 2 for dog): ");
        int animalType = scanner.nextInt();

        switch (animalType) {
            case 1:
                animal = new Cat1();
                animal.sound();
                break;
            case 2:
                animal = new Dog1();
                animal.sound();
                break;
            default:
                System.out.println("Invalid animal type");
        }
    }
}
