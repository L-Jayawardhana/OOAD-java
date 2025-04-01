public class Car_S {
    String brand;
    String model;
    int year;
    String color;

    Car_S(String brand, String model, int year, String color) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    //create a toString to return the string
    @Override
    public String toString() {
        return this.brand + " " + this.model + " " + this.year + " " + this.color;
    }
}
