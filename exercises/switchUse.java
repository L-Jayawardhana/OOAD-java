
import java.util.Scanner;
public class switchUse {
    public static void main(String[] args){
        //get the operator form the user and do the calculate

        Scanner scanner = new Scanner(System.in);

        int a , b;
        System.out.print("Enter value 1 : ");
        a = scanner.nextInt();
        System.out.print("Enter value 2 : ");
        b = scanner.nextInt();

        System.out.print("Enter your operator (+ - * / % ^):");
        char operator = scanner.next().charAt(0);

        switch (operator){
            case '+' :
                System.out.printf("answer is %d" , a+b);
                break;
            case '-':
                System.out.printf("answer is %d" , a-b);
                break;
            case '*':
                System.out.printf("answer is %d" , a*b);
                break;
            case '/':
                System.out.printf("answer is %.2f" , (double)a / b);
                break;
            case '%':
                System.out.printf("answer is %d" , a%b);
                break;
            case '^':
                System.out.printf("answer is %.2f" ,Math.pow(a , b) );
                break;
            default:
                System.out.printf("not a valid operator");
                break;
        }
    }
}
