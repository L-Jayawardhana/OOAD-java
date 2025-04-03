public class Fish1 implements Prey , Predator{

    // implemented for both classes Prey and Predator

    @Override
    public void flee() {
        System.out.println("fish is swimming away");
    }

    @Override
    public void hunt() {
        System.out.println("fish is hunting");
    }
}
