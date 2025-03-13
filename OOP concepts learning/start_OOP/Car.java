public class Car {
    String brand = "Ford";
    String model = "Mustang";
    int year = 2025;
    double price = 35000.00;
    boolean isRunning = false;

    void Start(){
        System.out.println("car is running..");
    }
    void Stop(){
        System.out.println("car is not running..");
    }
    void Drive(){
        System.out.println("your "+ model+ " is running\n");
    }
}
