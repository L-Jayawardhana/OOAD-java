public class Car2 {
    private final String model; // add final to add a extra layer (then it can't be modify)
    private String color;
    private int price;

    Car2(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    //getters
    String getModel() {
        return model;
    }
    String getColor() {
        return color;
    }
    int getPrice() {
        return price;
    }

    //setters
    void setColor(String color) {
        this.color = color;
    }
    void setPrice(int price) {
        this.price = price;
    }

}

