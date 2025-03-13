public class Student {
    String name ;
    int age;
    double gpa;

    Student(String Name, int Age , double Gpa){
        this.name = Name;
        this.age = Age;
        this.gpa = Gpa;
    }

    void study(){
        System.out.println(this.name + " is studying");
    }
    void year(){
        System.out.println(this.name + " is "+ this.age + " years old");
    }
}
