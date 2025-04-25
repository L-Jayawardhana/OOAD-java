public class Car3 {
    String model;
    int year;
    Engine engine;

    Car3(String model1, int year, String enginetype) {
        this.model = model1;
        this.year = year;
        this.engine = new Engine(enginetype);
    }
    void start(){
        this.engine.start();
        System.out.println("The " + model + " is running.");
    }
}
