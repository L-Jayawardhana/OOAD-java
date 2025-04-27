import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class SimpleCountDownTimer {
    public static void main(String[] args) {

        // Count Down Timer to  HAPPY NEW YEAR!
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the count for count down timer: ");
        int count = sc.nextInt();

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {

            int countDown = count;
            @Override
            public void run() {
                if (countDown > 0) {
                    System.out.println(countDown);
                    countDown--;
                } else if (countDown <= 0) {
                    System.out.println("HAPPY NEW YEAR!");
                    timer.cancel(); // Stop the timer
                }

            }
        };

        timer.scheduleAtFixedRate(task, 0, 1000);
    }
}
