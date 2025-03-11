public class Main1 {
    public static void main(String[] args){
        //constructor = A special method to initialize objects
        //              You can pass arguments to a constructor
        //              and set up initial values

        Student student1 = new Student("kamal" , 22, 3.4);
        Student student2 = new Student("Nimal" , 23 ,2.9);

        System.out.println(student1.name);
        System.out.println(student2.age);

        System.out.println();

        student1.study();
        student2.year();
    }
}
