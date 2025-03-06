import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {

        //in this code we check the given word is a palindrome or not?
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter your word : ");
        String word = scanner.nextLine();

        boolean isPalindrome = checkPalindrome(word);
        if (isPalindrome) {
            System.out.println("Your word is a palindrome.");
        }else {
            System.out.println("Your word is not a palindrome.");
        }
    }
    public static boolean checkPalindrome(String word) {
        int start = 0;
        int end = word.length()-1;

        while(start < end) {
            if(word.charAt(start) != word.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;

    }
}
