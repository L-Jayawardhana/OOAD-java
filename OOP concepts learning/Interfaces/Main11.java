public class Main11 {
    public static void main(String[] args) {

        // Interfaces = A blueprint for a class that specifies a set of abstract methods
        //              that implementing classes MUST define
        //              Supports multiple inheritance-like behaviour

        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish1 fish1 = new Fish1();

        rabbit.flee();
        hawk.hunt();
        System.out.println();
        fish1.flee();
        fish1.hunt();

    }
}
