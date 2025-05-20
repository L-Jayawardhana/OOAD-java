import java.util.ArrayList;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        if (numbers.isEmpty()) {
            System.out.println("ArrayList is empty. Please enter 10 numbers:");
            for (int i = 0; i < 10; i++) {
                System.out.print("Enter number " + (i + 1) + ": ");
                int input = scanner.nextInt();
                numbers.add(input);
            }
        }

        // Calculate the total
        int total = 0;
        for (int num : numbers) {
            total += num;
        }

        // print numbers
        System.out.println("The 10 numbers you entered are:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // Print total
        System.out.println("Total sum: " + total);

        scanner.close();
    }
}
