public class Main21 {
    public static void main(String[] args) {

        // Anonymous class = a class that doesn't have a name and is not declared
        //                 = it is declared inside a method or a block
        //                 = Add custom behaviour without creating a new class
        //                 = Often used to override methods of a class or interface
        //                 = Often used for one time uses (TimerTask, Runnable, callbacks)

        Birds birds1 = new Birds();
        Birds birds2 = new Birds(){
            @Override
            public void fly() {
                System.out.println("Ostrich can't fly");
            }
        };

        birds1.fly();
        birds2.fly();

    }
}
