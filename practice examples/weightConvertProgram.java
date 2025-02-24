import java.util.Scanner;

public class weightConvertProgram {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("1 - Kilograms to Pounds");
        System.out.println("2 - Pounds to Kilograms");
        System.out.print("Enter your choice : ");
        int choice = scanner.nextInt();

        if (choice < 1 || choice > 2){
            System.out.println("Invalid choice");
        } else {
            if (choice == 1){
                System.out.print("Enter Kilograms to convert Pounds : ");
                double KG = scanner.nextDouble();
                double LB = KG * 2.20462262;
                System.out.printf("%.2f lbs" , LB);
            } else{
                System.out.print("Enter Pounds to convert Kilograms : ");
                double LB = scanner.nextDouble();
                double KG = LB * 0.45359237;
                System.out.printf("%.2f kg" , KG);
            }
        }
    }
}
