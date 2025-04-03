public class Main12 {
    public static void main(String[] args) {

        // POLYMORPHISM = "POLY" = "MANY"
        //                "MORPH" = "SHAPE"
        //                Objects can identify as other objects.
        //                Objects can be treated as objects of a common superclass.


        Car_1 car_1 = new Car_1();
        Bike bike = new Bike();
        Boat boat = new Boat();

        // if i want to create a array
        // Car_1[] cars = {car_1 , bike , boat}
        // Bike[] bikes = {car_1 , bike , boat}
        // Boat[] boats = {car_1 , bike , boat}
        // does not create an array
        // because boat bike and car_1 are different objects from different classes

        // but Vehicles_s class is common for all three (for car_1 , bike and boat)
        // there for bike , boat , car_1 can identify as Vehicle_s object
        Vehicle_s[] vehicles = {car_1, bike, boat};

        for (Vehicle_s vehicle : vehicles) {
            vehicle.go();
        }

    }
}
