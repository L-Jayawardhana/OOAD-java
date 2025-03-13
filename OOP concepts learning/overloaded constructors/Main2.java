public class Main2 {
    public static void main(String[] args){
        // pverloaded constructors = Allow a class to have multiple constructors
        //                           with different parameter lists.
        //                          Enable objects to be initialized in various ways.

        User user1 = new User("Kamal");
        User user2 = new User("Nimal" , 28);
        User user3 = new User("Wimal" , 23, 45000);
        User user4 = new User();

        System.out.println(user1.name);
        System.out.println(user1.age);
        System.out.println(user1.salary);

        System.out.println(user2.name);
        System.out.println(user2.age);
        System.out.println(user2.salary);

        System.out.println(user3.name);
        System.out.println(user3.age);
        System.out.println(user3.salary);

        System.out.println(user4.name);
        System.out.println(user4.age);
        System.out.println(user4.salary);
    }
}
