import java.util.Scanner;

public class StudentMarksAnalise {
    public static void main(String[] args){
        int no_of_subjects;
        String name;
        double average;
        int total = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name : ");
        name = scanner.nextLine();

        System.out.print("Enter no of subjects : ");
        no_of_subjects = scanner.nextInt();

        for (int x = 1 ; x <= no_of_subjects ; x++){
            int marks;
            System.out.print("Enter marks for subject " + x + " : ");
            marks = scanner.nextInt();
            while (marks < 0 | marks > 100){
                System.out.print("Invalid marks, plz re enter : ");
                marks = scanner.nextInt();
            }
            total = total + marks;
        }
        average = total / no_of_subjects;

        PrintDetails(name , total, average, no_of_subjects);
        scanner.close();
    }
    public static void PrintDetails(String name, int total , double average , int no_of_subjects){
        StringBuffer details = new StringBuffer();
        details.append("Hello " + name + " your details for " + no_of_subjects + " subjects are below.\n");
        details.append("Total is : " + total).append("\n");
        details.append("Average is : " + average).append("\n");
        details.append("Good Luck!😊");
        System.out.println(details.toString());
    }
}
