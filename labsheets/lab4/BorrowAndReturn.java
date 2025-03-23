import java.util.ArrayList;
import java.util.Scanner;

public class BorrowAndReturn {
    Scanner scanner = new Scanner(System.in);
    private ManageBooks manageBooks;
    private ManageMembers manageMembers;

    public BorrowAndReturn(ManageBooks manageBooks , ManageMembers manageMembers) {
        this.manageBooks = manageBooks;
        this.manageMembers = manageMembers;
    }
    public void borrowABook() {
        System.out.print("Enter member ID: ");
        String memberID = scanner.nextLine();

        // check the entered ID is valid or invalid
        if (manageMembers.findMemberByID(memberID) != null) {
            manageMembers.searchMember(memberID); //print member details

            // check member has already borrowed a book or not
            if(!manageMembers.findMemberByID(memberID).get(2).equals("NONE")){
                System.out.println("Member " + memberID + " is already borrowed a book..!");
            }else{
                System.out.print("Enter book name to borrow : ");
                String bookName = scanner.nextLine();

                for (ArrayList<String> book : manageBooks.books){
                    //check the book exist in the library
                    if(book.get(0).equalsIgnoreCase(bookName)){
                        // check the availability and update
                        if(book.get(3).equals("A")){
                            book.set(3 , "NA");
                            manageMembers.findMemberByID(memberID).set(2 , bookName);
                            System.out.println("You borrowed book '" + book.get(0) + "' successfully!");
                        }else{
                            System.out.println("The book '" + book.get(0) + "' is already borrowed");
                        }
                    }else{
                        System.out.println("The book '" + bookName + "' does not exist in Library");
                    }
                }
            }
        }
    }
    public void returnABook() {
        System.out.print("Enter member ID: ");
        String memberID = scanner.nextLine();

        // check the entered ID is valid or invalid
        if (manageMembers.findMemberByID(memberID) != null) {
            manageMembers.searchMember(memberID); // print member details

            // check member has already borrowed a book or not
            if(manageMembers.findMemberByID(memberID).get(2).equals("NONE")){
                System.out.println("Member " + memberID + " hasn't borrowed a book..!");
            }else{
                System.out.print("Enter book name to return : ");
                String bookName = scanner.nextLine();

                // check the returned book is the same book that user borrowed
                if(manageMembers.findMemberByID(memberID).get(2).equals(bookName)){
                    for (ArrayList<String> book : manageBooks.books){
                        //check the book belongs to the library
                        if(book.get(0).equalsIgnoreCase(bookName)){
                            // check the availability and update
                            if(book.get(3).equals("NA")){
                                book.set(3 , "A");
                                manageMembers.findMemberByID(memberID).set(2 , "NONE");
                                System.out.println("Returned book '" + book.get(0) + "' successfully!");
                            }else{
                                System.out.println("The book '" + book.get(0) + "' is already in Library");
                            }
                        }else{
                            System.out.println("The book '" + bookName + "' does not belongs to Library");
                        }
                    }
                }else {
                    System.out.println("Member " + memberID + " has borrowed another book..!");
                }
            }
        }
    }
}
