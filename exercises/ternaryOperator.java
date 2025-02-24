import java.util.Scanner;
public class ternaryOperator {
    public static void main(String[] args){
        //ternary operator ? = Return 1 of 2 values if a condition is true

        //variable = (condition) ? ifTrue : ifFalse;

        int marks = 13;
        String PassOrFail = (marks > 60) ? "pass" : "Fail";
        System.out.println(PassOrFail);


        int number = 7;
        String EvenOrOdd = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println(EvenOrOdd);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your salary : ");
        int salary = scanner.nextInt();
        double taxrate = (salary > 75000) ? 0.1 : 0.05;
        System.out.printf("Your tax fee is %.2f" , salary * taxrate);
    }
}
