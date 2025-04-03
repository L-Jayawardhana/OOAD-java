public class Main14 {
    public static void main(String[] args) {


        Car2 car = new Car2("Ford", "White", 1000);

        // we cant access model, color and price using
        //car.color , car.price , car.model
        // because they are privet attributes in Car2 class . they cnt be access outside the Car2 class

        //we can access these using getter methods
        System.out.println(car.getModel() + " " + car.getColor() + " " + car.getPrice());

        // and also we can modify these variables using setters
        // in this case model cant be modified because model is not set as a setter
        car.setColor("Blue");
        car.setPrice(2000);
        System.out.println(car.getModel() + " " + car.getColor() + " " + car.getPrice());
    }
}
