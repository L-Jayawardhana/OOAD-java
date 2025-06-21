public class Main {
    public static void main(String[] args) {

        Thread thread = new Thread(new MyRunnable1());
        Thread thread2 = new Thread(new MyRunnable1());

        System.out.println("Lets start");
        thread2.start();
        thread.start();

        try {
            thread.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("main thread interrupted:");
        }


        System.out.println("lets finish");

    }
}