import java.util.Random;

public class randomizer {
    public static void main(String[] args){
        Random random = new Random();

        //print random integers between 1 to 6 (6 not included)
        int num = random.nextInt(1,6);
        System.out.println(num);

        //print random doubles between 1 to 5 (5 not included)
        double num1 = random.nextDouble(1,5);
        System.out.println(num1);

        //print random boolean values
        boolean isHead = random.nextBoolean();
        System.out.println(isHead);

        if (isHead){
            System.out.println("HEAD");
        } else {
            System.out.println("TAIL");
        }
    }
}
