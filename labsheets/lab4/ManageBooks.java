import java.util.ArrayList;

public class ManageBooks {
    protected ArrayList<ArrayList<String>> books ;

    public ManageBooks() {
        books = new ArrayList<>();
    }

    //add books
    public void addBook(String Title , String Author , String ISBN , String Status){
        ArrayList<String> bookDetails = new ArrayList<>();
        bookDetails.add(Title);
        bookDetails.add(Author);
        bookDetails.add(ISBN);
        bookDetails.add(Status);
        books.add(bookDetails);
    }
    //search books
    public void searchBook(String Title){
        boolean isFound = false;
        for (ArrayList<String> book : books) {
            if (book.get(0).equals(Title)){
                System.out.println("Found book '" + book.get(0) + "'");
                System.out.println(" author : " + book.get(1) + " | ISBN : " + book.get(2) + " | status : " + book.get(3));
                isFound = true;
            }
        }
        if (!isFound){
            System.out.println("Book not found");
        }
    }

    //print book details
    public void printBooks(){
        for(ArrayList<String> book : books){
            System.out.println("title : " + book.get(0) + " | author : " + book.get(1) + " | ISBN : " + book.get(2) + " | status : " + book.get(3));
        }
    }

}
