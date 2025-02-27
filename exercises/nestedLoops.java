public class nestedLoops {
    public static void main(String[] args){
        //nested loops are loops inside loops

        //print 1 to 5 star patter
        /*  *
            **
            ***
            ****
            *****
         */

        for (int i = 1 ; i <= 5 ; i++){
            for (int j = 1 ; j <= i ; j++){
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }
}
