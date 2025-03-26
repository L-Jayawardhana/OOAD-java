public class Main8 {
    //method overriding = when a subclass provides its own implementation
    //                 of a method that is already defined.Allows for code
    //                 reusability and give specific implementations.
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Fish fish = new Fish();

        dog.move();
        cat.move();
        fish.move();
    }
}
