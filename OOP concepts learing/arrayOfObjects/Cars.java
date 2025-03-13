public class Cars {
    String model;
    String color;

    Cars(String model , String color){
        this.model = model;
        this.color = color;
    }

    void Print(){
        System.out.println("your " + this.model + " is " + this.color);
    }
}
