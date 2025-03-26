public class Fish extends Animal {

    // animal is running is inappropriate for fish
    // there for add override method for update method for fish class
    @Override
    void move(){
        System.out.println("Fish is swimming");
    }
}
