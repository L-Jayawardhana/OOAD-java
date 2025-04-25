public class Main15 {
    public static void main(String[] args) {

        // Composition = Represents a "part-of" relationship between objects.
        //               For example, an Engine is "part of" a car
        //               Allows complex objets to be constructed from smaller objects.

        Car3 car = new Car3("Ford" , 2024 , "V6");

        System.out.println(car.model);
        System.out.println(car.year);


        // If deleted the car object, we have no longer access have to the engine.
        System.out.println(car.engine.type);

        car.start();
    }
}
