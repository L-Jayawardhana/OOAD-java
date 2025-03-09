import java.util.Scanner;

public class JavaQuizGame {
    public static void main(String[] args){
        //Ask 4 questions and give 4 answers for each question.
        //In the end score will be printed

        String[] questions = {"A . What is the correct way to declare a variable in Java?",
                                "B . Which keyword is used to define a class in Java?",
                                "C . What will System.out.println(5 + \"5\"); print?",
                                "D . Which of the following is NOT a Java access modifier?"};

        String[][] options = {
                {"1 . int number = 10;" , "2 . variable number = 10;" ,"3 . num int = 10;" ,"4 . integer number = 10;"},
                {"1 . Class","2 . define" ,"3 . class" , "4 . struct"},
                {"1 . 10" , "2 . 55" ,"3 . 5+5" ,"4 . Error"},
                {"1 . private" , "2 . protected" , "3 . public", "4 . secured"}
                            };

        int[] answers = {1,3,2,4};
        int choice ;
        int score = 0;

        System.out.println("Java Quiz game");
        System.out.println("----------------");

        for (int j = 0 ; j < questions.length ; j++){
            System.out.println(questions[j]);

            for (String option : options[j]){
                System.out.println(option);
            }

            System.out.print("enter your answer : ");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();

            if (answers[j] == choice){
                System.out.println("correct..!\n");
                score++;
            }else{
                System.out.println("incorrect..!\n");            }
        }
        System.out.println("your score is " + score);




    }
}
