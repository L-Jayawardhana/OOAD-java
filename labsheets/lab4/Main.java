import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static ManageBooks manageBooks = new ManageBooks();
    private static ManageMembers manageMembers = new ManageMembers();
    private static BorrowAndReturn borrowAndReturn = new BorrowAndReturn(manageBooks , manageMembers);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\nMain Menu");
            System.out.println("1 - Add a Book");
            System.out.println("2 - Search a Book");
            System.out.println("3 - Add a member");
            System.out.println("4 - Search a member");
            System.out.println("5 - Borrow a Book");
            System.out.println("6 - Return a Book");
            System.out.println("7 - Exit..!");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1: regABook(); break;
                case 2: searchABook(); break;
                case 3: regAMember(); break;
                case 4: searchAMember(); break;
                case 5: borrowAndReturn.borrowABook(); break;
                case 6: borrowAndReturn.returnABook(); break;
                case 7:
                    System.out.println("Exiting..!"); break;
                default:
                    System.out.println("Invalid choice"); continue;
            }
        }while(choice != 7);
    }
    private static void regABook() {
        String Title, Author, ISBN , Status;
        System.out.print("\nEnter book title: ");
        Title = scanner.nextLine();
        System.out.print("Enter book author: ");
        Author = scanner.nextLine();
        System.out.print("Enter book ISBN: ");
        ISBN = scanner.nextLine();
        boolean isrightStatus = false;
        do {
            System.out.print("Enter book status ('A' for Available and 'NA' for Not Available): ");
            Status = scanner.nextLine().toUpperCase();
            if (!Status.equals("A") && !Status.equals("NA")) {
                System.out.println("\nInvalid status");
                continue;
            }else{ isrightStatus = true; }
        }while(isrightStatus == false);

        manageBooks.addBook(Title , Author , ISBN , Status);
        manageBooks.printBooks();
        System.out.println("Book Added successfully..!");
    }
    private static void searchABook() {
        System.out.print("\nEnter book title to search: ");
        String Title = scanner.nextLine();
        manageBooks.searchBook(Title);
    }
    private static void regAMember(){
        String name, ID;
        System.out.print("\nEnter member name: ");
        name = scanner.nextLine();
        System.out.print("Enter member ID: ");
        ID = scanner.nextLine();

        manageMembers.addMember(name, ID);
    }
    private static void searchAMember(){
        System.out.print("\nEnter member ID to search: ");
        String ID = scanner.nextLine();
        manageMembers.searchMember(ID);
    }
}
