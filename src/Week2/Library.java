package Week2;
import java.util.ArrayList;

public class Library {
    ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).equals(book)) {
                books.remove(i);
                return;
            }
        }
    }

    public void updateBook(String request, Book updatedBook) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().equals(request)) {
                books.set(i, updatedBook);
                return;
            }
            else if (books.get(i).getAuthor().equals(request)) {
                books.set(i, updatedBook);
                return;
            }
            else if (books.get(i).getType().equals(request)) {
                books.set(i, updatedBook);
                return;
            }
            else if( books.get(i).getPublicDate().equals(request)) {
                books.set(i, updatedBook);
                return;
            }
        }
    }

    public Object searchBook(String request) {
        for (Book book : books) {
            if (book.getTitle().equals(request) || book.getAuthor().equals(request) ||
                book.getType().equals(request) || book.getPublicDate().equals(request)) {
                return book;
            }
        }
        return null; // Book not found
    }

    public void viewBooks() {
        for (Book book : books) {
            System.out.println(book.getTitle());
            System.out.println(book.getAuthor());
            System.out.println(book.getType());
            System.out.println(book.getPublicDate());
        }
    }
}
