import java.util.Scanner;

public class Grades{
    private static int noOfStudents ;
    private static int noOfSubjects = 3;

    private static int[][] marks ;
    private static String[][] grades;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of the student: ");
        noOfStudents = scanner.nextInt();

        marks = new int[noOfStudents][noOfSubjects];
        grades = new String[noOfStudents][noOfSubjects];

        int choice;
        do {
            System.out.println("\nMain menu: ");
            System.out.println("1. Enter marks of the student");
            System.out.println("2. Average for the subject");
            System.out.println("3. Average for the student");
            System.out.println("4. Total marks for the student");
            System.out.println("5. Grades for student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            if (choice < 1 || choice > 6) {
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
                    gradesForStudent();
                    break;
                case 6:
                    System.out.println("Exiting the program");
                    break;
            }
        } while (choice != 6);
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
        System.out.print("\n");
        for (int i = 0 ; i < noOfStudents ; i++){
            int sum = 0 ;
            for (int j = 0 ; j < noOfSubjects ; j++){
                sum += marks[i][j];
            }
            System.out.printf("Total marks for student %d : %d\n",i+1,sum);
        }
    }
    public static void averageForStudent(){
        System.out.print("\n");
        for (int i = 0 ; i < noOfStudents ; i++){
            double sum = 0 ;
            for (int j = 0 ; j < noOfSubjects ; j++){
                sum += marks[i][j];
            }
            System.out.printf("Average for student %d : %.2f\n", i+1, sum/noOfSubjects);
        }
    }
    public static void gradesForStudent(){
        //store grades to grades array according to marks
        for (int i = 0 ; i < noOfStudents ; i++){
            for (int j = 0 ; j < noOfSubjects ; j++){
                if (marks[i][j] >= 90){
                    grades[i][j] = "Grade A";
                } else if (marks[i][j] >= 80) {
                    grades[i][j] = "Grade B";
                } else if (marks[i][j] >= 70) {
                    grades[i][j] = "Grade C";
                } else if (marks[i][j] >= 60) {
                    grades[i][j] = "Grade D";
                } else {
                    grades[i][j] = "Fail";
                }
            }
        }
        //print grades
        System.out.printf("\n%12s %10s %10s %10s\n" , "Grades" , "Maths" , "Physics" , "Chemistry");
        System.out.printf("--------------------------------------------------------\n");
        for (int k = 0 ; k < noOfStudents ; k++){
            System.out.printf("%10s %d" , "Student" , k+1);
            for (int l = 0 ; l < noOfSubjects ; l++){
                System.out.printf("%10s ", grades[k][l]);
            }
            System.out.printf("\n");
        }
    }

}

