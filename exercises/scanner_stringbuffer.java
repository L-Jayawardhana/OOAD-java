import java.util.Scanner;

public class scanner_stringbuffer{
    public static void main(String[] args){
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Enter your first name : ");
        String first_name = scanner.nextLine();

        System.out.print("Enter your last name : ");
        String last_name = scanner.nextLine();
        
        //call stringbuffer function
        stringbuffer(first_name, last_name);
    }

    public static void stringbuffer(String first_name, String last_name){
        StringBuffer sb = new StringBuffer();
        sb.append("Hi ");
        sb.append(first_name);
        sb.append(" ");
        sb.append(last_name);
        sb.append(" welcome to JAVA!");

        System.out.print(sb.toString());
    }
}