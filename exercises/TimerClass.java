import java.util.Timer;
import java.util.TimerTask;

public class TimerClass {
    public static void main(String[] args) {

        // Timer = Class that schedules tasks at specific times or periodically
        //       = Useful for : sending notifications, scheduling tasks, etc.

        // TimerTask = Represents the task that will be executed by the Timer
        //           = You will extend the TimerTask class to define your task
        //           = Create a subclass of TimerTask and override the run() method

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {

            //scheduled for 5 times of tasks
            int count = 5 ;

            @Override
            public void run() {
                System.out.println("Task executed!");
                count--;
                if (count <= 0) {
                    System.out.println("TASK COMPLETED!");
                    timer.cancel(); // Stop the timer
                }
            }
        };

        // scheduled for 1 seconds of delay after 0 starting time delay
         timer.schedule(task,0,1000);

    }
}
