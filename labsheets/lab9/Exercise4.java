import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Student1 {
    private int studentID;
    private String name;
    private double GPA;

    public Student1(int studentID, String name, double GPA) {
        this.studentID = studentID;
        this.name = name;
        this.GPA = GPA;
    }

    public void displayInfo() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("GPA: " + GPA);
    }
}

public class Exercise4 {
    public static void main(String[] args) {
        Map<Integer, Student> studentMap = new HashMap<>();

        studentMap.put(101, new Student(101, "Kamal", 3.6));
        studentMap.put(102, new Student(102, "Amal", 3.8));
        studentMap.put(103, new Student(103, "Namal", 3.5));

        // User input for student number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a student number to view details: ");
        int studentNumber = scanner.nextInt();

        // Find and display student info if exists
        Student student = studentMap.get(studentNumber);
        if (student != null) {
            System.out.println("\nStudent details:");
            student.displayInfo();
        } else {
            System.out.println("Student with ID " + studentNumber + " not found.");
        }

        scanner.close();
    }
}
