import java.util.ArrayList;
import java.util.List;

class Student {
    private int studentID;
    private String name;
    private double GPA;

    public Student(int studentID, String name, double GPA) {
        this.studentID = studentID;
        this.name = name;
        this.GPA = GPA;
    }

    public void displayInfo() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("GPA: " + GPA);
        System.out.println("--------------------------");
    }
}

public class Exercise2 {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student(101, "Kamal", 3.6));
        studentList.add(new Student(102, "Amala", 3.8));
        studentList.add(new Student(103, "Namal", 3.5));

        System.out.println("Student Details:");
        for (Student student : studentList) {
            student.displayInfo();
        }
    }
}
