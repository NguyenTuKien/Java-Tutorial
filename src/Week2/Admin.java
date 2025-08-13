package Week2;
import java.util.ArrayList;
import java.util.Scanner;

public class Admin {
    ArrayList<Book> books = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    private void addBook(Book book) {
        books.add(book);
    }

    private void removeBook(Book book) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).equals(book)) {
                books.remove(i);
                return;
            }
        }
    }

    private void updateBook(String keyWord, Book updatedBook) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().equals(keyWord)) {
                books.set(i, updatedBook);
                return;
            }
            else if (books.get(i).getAuthor().equals(keyWord)) {
                books.set(i, updatedBook);
                return;
            }
            else if (books.get(i).getType().equals(keyWord)) {
                books.set(i, updatedBook);
                return;
            }
            else if( books.get(i).getPublicDate().equals(keyWord)) {
                books.set(i, updatedBook);
                return;
            }
        }
    }

    protected Book searchBook(String keyWord) {
        for (Book book : books) {
            if (book.getTitle().equals(keyWord) || book.getAuthor().equals(keyWord) ||
                book.getType().equals(keyWord) || book.getPublicDate().equals(keyWord)) {
                return book;
            }
        }
        return null; // Book not found
    }

    protected void viewBooks() {
        for (Book book : books) {
            System.out.println(book.getTitle());
            System.out.println(book.getAuthor());
            System.out.println(book.getType());
            System.out.println(book.getPublicDate());
        }
    }

    public void function(String function){
        if(function.equals("add")){
            String title = sc.nextLine();
            String author = sc.nextLine();
            String type = sc.nextLine();
            String date = sc.nextLine();
            Book book = new Book(title, author, type, date);
            addBook(book);
            System.out.println("___________________________");
        }
        else if(function.equals("remove")){
            String title = sc.nextLine();
            String author = sc.nextLine();
            String type = sc.nextLine();
            String date = sc.nextLine();
            Book book = new Book(title, author, type, date);
            removeBook(book);
            System.out.println("___________________________");
        }
        else if(function.equals("update")){
            String keyWork = sc.nextLine();
            String title = sc.nextLine();
            String author = sc.nextLine();
            String type = sc.nextLine();
            String date = sc.nextLine();
            Book book = new Book(title, author, type, date);
            updateBook(keyWork, book);
            System.out.println("___________________________");
        }
        else if(function.equals("search")){
            String keyWord = sc.nextLine();
            searchBook(keyWord).displayInfo();
            System.out.println("___________________________");
        }
        else if(function.equals("view")){
            viewBooks();
            System.out.println("___________________________");
        }
    }
}
