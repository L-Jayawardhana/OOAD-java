import java.util.InputMismatchException;
import java.util.Scanner;

public class Main18 {
    public static void main(String[] args) {

        // Exceptions = An event that interrupts the normal flow of a program
        //              (Dividing by Zero, file not found , mismatch input type)
        //              Surround any dangerous code with a try{} block
        //              try{}, catch{}, finally{}

        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("enter a number: ");
            int number = sc.nextInt();
            System.out.println(number);

            // we can add catch options to various errors handling
        } catch (InputMismatchException e){
            // "InputMismatchException" is the upcoming error code when non integer is entered.
            System.out.println("that is not a number.");
        } catch (Exception e){
            // SAFETY NET
            System.out.println("Something went wrong.");
        }
        finally {
            // this function executes always
            sc.close();
            System.out.println("Goodbye!");
        }

     }
}
