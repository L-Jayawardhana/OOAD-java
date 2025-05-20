import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise3 {
    public static void main(String[] args) {
        Set<Double> uniqueHeights = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the heights of 10 students (duplicates will be ignored):");

        int count = 1;
        while (count <= 10) {
            System.out.print("Enter height #" + (count + 1) + ": ");
            double height = scanner.nextDouble();

            // Try to add height. If it's a duplicate, don't increment the count.
            boolean included = uniqueHeights.add(height);
            if (included) {
                count++;
            } else {
                System.out.println("Duplicate height! Please enter a different value.");
            }
        }

        // Display unique heights
        System.out.println("\nUnique heights of students:");
        for (double h : uniqueHeights) {
            System.out.println(h);
        }

        scanner.close();
    }
}
