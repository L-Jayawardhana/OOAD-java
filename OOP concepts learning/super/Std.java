public class Std extends Person{
    double gpa;

    Std(String first, String last ,double gpa){
        super(first , last);
        this.gpa = gpa;
    }
    void showGpa(){
        System.out.println(this.first + " " + this.last + "'s gpas is " + this.gpa);
    }

}
