
import java.util.Scanner;
public class switchUse {
    public static void main(String[] args){
        //get the operator form the user and do the calculate

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your operator (+ - * / %):");
        String operetor = scanner.next();

        int a , b;
        System.out.print("Enter value 1 : ");
        a = scanner.nextInt();
        System.out.print("Enter value 2 : ");
        b = scanner.nextInt();

        switch (operetor){
            case "+" :
                System.out.printf("answer is %d" , a+b);
                break;
            case "-":
                System.out.printf("answer is %d" , a-b);
                break;
            case "*":
                System.out.printf("answer is %d" , a*b);
                break;
            case "/":
                System.out.printf("answer is %.2f" , (double)a / b);
                break;
            case "%":
                System.out.printf("answer is %d" , a%b);
                break;

        }
    }
}
