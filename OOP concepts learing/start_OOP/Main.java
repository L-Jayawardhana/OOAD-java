public class Main {
    public static void main(String[] args){

        //object = An entity that holds data (attributes)
        //          and can perform actions (methods)
        //          It is a reference data type

        // car has Car attributes
        Car car = new Car();

        System.out.println(car.brand);
        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.price);
        System.out.println(car.isRunning);

        // we can also call a function in the car class
        car.Start();
        car.Stop();

        car.Drive();
    }
}
