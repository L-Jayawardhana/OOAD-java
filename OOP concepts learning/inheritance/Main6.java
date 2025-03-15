public class Main6 {
    public static void main(String[] args){

        // Inheritance = One class inherits the attributes and methods
        //               from another class.
        //               Child <- Parent <- Grandparent

    Apple apple = new Apple();
    Orange orange = new Orange();
    Fruits fruits = new Fruits();
    Vegetables vegetables = new Vegetables();

        fruits.advantage();
        System.out.println(fruits.isHealthy); // inheritance from Foods

        System.out.println();

        System.out.println(vegetables.isHealthy); // inheritance from Foods
        System.out.println(vegetables.canCook);

        System.out.println();
        System.out.println(apple.isHealthy); // inheritance from Foods
        System.out.println(orange.isHealthy); // inheritance from Foods

        System.out.println();

        System.out.println(apple.hasVitamin); // inheritance from Fruits
        System.out.println(orange.hasVitamin); // inheritance from Fruits
    }

}
