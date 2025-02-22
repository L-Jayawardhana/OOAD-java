import java.util.Scanner;

public class Marks{
    private static int noOfStudents ;
    private static int noOfSubjects = 3;

    private static int[][] marks ;
    private static int[] total ;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of the student: ");
        noOfStudents = scanner.nextInt();

        marks = new int[noOfStudents][noOfSubjects];
        total = new int[noOfStudents];

        int choice;
        do {
            System.out.println("\nMain menu: ");
            System.out.println("1. Enter marks of the student");
            System.out.println("2. Average for the subject");
            System.out.println("3. Average for the student");
            System.out.println("4. Toal marks for the student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            if (choice < 1 || choice > 5) {
                System.out.println("Invalid choice");
                continue;
            }
            switch (choice) {
                case 1:
                    enterMarks(scanner);
                    break;
                case 2:
                    averageForSubject();
                    break;
                case 3:
                    averageForStudent();
                    break;
                case 4:
                    totalMarks();
                    break;
                case 5:
                    System.out.println("Exiting the program");
                    break;
            }
        } while (choice != 5);
    }
    public static void enterMarks(Scanner scanner){
        for (int i = 0 ; i < noOfStudents ; i++){
            System.out.printf("Enter the marks of student %d for Maths , Physics , Chemistry : \n",i+1);
            for (int j = 0 ; j < 3 ; j++){
                marks[i][j] = scanner.nextInt();
                while(marks[i][j] < 0 || marks[i][j] > 100){
                    System.out.print("Invalid marks. Please enter again : ");
                    marks[i][j] = scanner.nextInt();
                }
            }
        }
    }
    public static void averageForSubject(){
        double sum = 0;
        //print average for Maths
        for (int i = 0 ; i < noOfStudents ; i++){
            sum += marks [i][0];
        }
        System.out.printf("\nAverage for Maths : %.2f\n",sum/noOfStudents);

        sum = 0;
        for (int i = 0 ; i < noOfStudents ; i++){
            sum += marks [i][1];
        }
        System.out.printf("Average for Physics : %.2f\n",sum/noOfStudents);

        sum = 0;
        for (int i = 0 ; i < noOfStudents ; i++){
            sum += marks [i][2];
        }
        System.out.printf("Average for Chemistry : %.2f\n",sum/noOfStudents);
    }
    public static void totalMarks(){
        for (int i = 0 ; i < noOfStudents ; i++){
            int sum = 0 ;
            for (int j = 0 ; j < noOfSubjects ; j++){
                sum += marks[i][j];
            }
            total[i] = sum;
            System.out.printf("Total marks for student %d : %d\n",i+1,sum);
        }
    }
    public static void averageForStudent(){
        totalMarks();
        System.out.println("\n");
        for (int i = 0 ; i < noOfStudents ; i++){
            double avg = (double)total[i]/noOfSubjects;
            System.out.printf("Average for student %d : %.2f\n",i+1,avg);
        }
    }

}
