package Week2;
import java.util.ArrayList;
import java.util.Scanner;

public class Admin {
    ArrayList<Book> books = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public Admin() {
        books.add(new Book("Harry Potter", "J.K. Rowling", "Fantasy", "1997"));
        books.add(new Book("The Hobbit", "J.R.R. Tolkien", "Fantasy", "1937"));
        books.add(new Book("1984", "George Orwell", "Dystopian", "1949"));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee", "Fiction", "1960"));
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", "Fiction", "1925"));
    }
    
    private void addBook(Book book) {
        books.add(book);
    }

    private void removeBook(int index) {
        Book book = books.get(index);
        books.remove(book);
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
            System.out.println(book.getTitle() + " " + book.getAuthor() + " " + book.getType() + " " + book.getPublicDate());
            System.out.println("___________________________");
        }
    }

    public void function(String function){
        if(function.equals("add")){
            System.out.println("Nhập thông tin sách (title, author, type, date):");
            System.out.println("Title:");
            String title = sc.nextLine();
            System.out.println("Author:");
            String author = sc.nextLine();
            System.out.println("Type:");
            String type = sc.nextLine();
            System.out.println("Date:");
            String date = sc.nextLine();
            Book book = new Book(title, author, type, date);
            addBook(book);
            System.out.println("Thêm sách thành công!");
        }
        
        else if(function.equals("remove")){
            System.out.println("Nhập vị trí sách cần xóa (0 đến " + (books.size() - 1) + "):");
            int index = sc.nextInt();
            sc.nextLine();
            removeBook(index);
            System.out.println("Xóa sách thành công!");
        }

        else if(function.equals("update")){
            System.out.println("Nhập thông tin sách cần cập nhật (keyWork):");
            System.out.println("KeyWork (title, author, type, date):");
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
        }
    }
}
