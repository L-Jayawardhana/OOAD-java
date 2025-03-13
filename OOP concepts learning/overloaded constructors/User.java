public class User {
    String name ;
    int age ;
    double salary;

    User (String username){
        this.name = username;
        this.age = 24;
        this.salary = 35000.90;
    }
    User (String username , int age){
        this.name = username;
        this.age = age;
        this.salary = 35000.90;
    }
    User (String username , int age , double salary){
        this.name = username;
        this.age = age;
        this.salary = salary;
    }
    User (){
        this.name = "Namal";
        this.age = 34;
        this.salary = 41000;
    }
}
