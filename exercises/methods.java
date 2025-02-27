import java.util.Scanner;
public class methods {
    public static void main(String[] args){
        //in this example we practise how to use functions for better coding
        //get the cubic value of user input
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter the value for get the cubic value : ");
        double value = scanner.nextDouble();

        //call the function
        cubicValue(value);

        System.out.println("\n");

        //get the velocity by calculating u + at
        System.out.printf("Enter the initial velocity: ");
        double u = scanner.nextDouble();
        System.out.printf("Enter the acceleration: ");
        double a = scanner.nextDouble();
        System.out.printf("Enter the time: ");
        double t =  scanner.nextDouble();

        double velocity = calcVelocity(u , a , t);
        System.out.printf("Velocity at the time %.1fs is %.2f m/s", t , velocity);

    }
    static void cubicValue(double value){
        System.out.printf("Cubic value is %.2f ", Math.pow(value , 3));
    }
    static double calcVelocity(double u , double a , double t){
        double v = u + a * t;
        return v;
    }

}
