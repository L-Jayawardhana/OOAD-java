public class MyRunnable1 implements Runnable{
    @Override
    public void run(){
        for (int i = 1 ; i <= 5 ; i++){
            try {
                Thread.sleep(1000);
                System.out.println(i);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted:");
            }
        }
    }

}
