import java.util.Scanner;
public class loops{
    public static void main(String[] args){
        //practise loops
        //for loop
        //print even numbers 1 to 20
        for (int i = 1 ; i <= 20 ; i++){
            if(i % 2 == 0){
                System.out.printf("%d " , i);
            }
        }

        System.out.println("\n");

        //while loop
        //print even numbers 1 to 20
        int j = 1;
        while(j <= 20){
            if (j % 2 == 0){
                System.out.printf("%d ",j);
            }
            j++;
        }

        System.out.println("\n");
        //do-while loop
        //print even numbers 1 to 10
        //difference between while and do-while loop is while always running after checking the logic
        //but do-while loop always run one time and check the logic after one time
        int k = 1;
        do{
            if (k % 2 == 0){
                System.out.printf("%d ",k);
            }
            k++;
        }while(k <= 20);
    }
}
