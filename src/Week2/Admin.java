package Week2;
import java.util.Scanner;

public class Admin extends Guest {

    public void addBook(Book book) {
        library.addBook(book);
    }

    public void removeBook(Book book) {
        library.removeBook(book);
    }

    public void updateBook(String request, Book updatedBook) {
        library.updateBook(request, updatedBook);
    }

    public void function(String request)
    {
        if (request.equals("add")) {
            String title = scanner.next();
            String author = scanner.next();
            String type = scanner.next();
            String publicDate = scanner.next();
            Book book = new Book(title, author, type, publicDate);
            addBook(book);
        } else if (request.equals("remove")) {
            String title = scanner.next();
            Book book = (Book) library.searchBook(title);
            if (book != null) {
                removeBook(book);
            }
        } else if (request.equals("update")) {
            String title = scanner.next();
            Book updatedBook = new Book(scanner.next(), scanner.next(), scanner.next(), scanner.next());
            updateBook(title, updatedBook);
        }
        else {
            super.function(request);
        }   
    }
}
