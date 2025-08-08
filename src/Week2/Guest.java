package Week2;
import java.util.Scanner;

public class Guest {
    protected Library library;
    protected Scanner scanner = new Scanner(System.in);
    public void setLibrary(Library library) {
        this.library = library;
    }

    public Book searchBook(String request) {
        return (Book) library.searchBook(request);
    }    

    public void viewBooks() {
        library.viewBooks();
    }
    
    public void function(String request) {
        if(request.equals("view")) {
            viewBooks();
        } else if (request.equals("search")) {
            String searchRequest = scanner.next();
            Book book = searchBook(searchRequest);
            if (book != null) {
                book.displayInfo();
            }
        }
    }
}

