import java.util.Scanner;

public class scanner{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first name : ");
        String first_name = scanner.nextLine();

        System.out.print("Enter your last name : ");
        String last_name = scanner.nextLine();
        
        System.out.print("Hi " + first_name + " " + last_name + " welcome to JAVA.");
    }
}