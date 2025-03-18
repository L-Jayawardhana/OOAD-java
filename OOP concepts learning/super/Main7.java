public class Main7 {
    public static void main(String[] args){

        // super - Refers to the parent class (subclass <- superclass)
        //      - used o constructors and methods overriding
        //      - calls the parent constructors to initialize attributes

        
        Person person = new Person("Kamal" , "Perera");
        Std std = new Std("Amal" , "Rathnayake" , 3.8);
        Employee employee = new Employee("Vimal" , "Perera" , 23000);

        person.showName();
        std.showGpa();

        System.out.println();
        employee.showName(); //inherits from Person
        employee.showSalary();
    }
}
