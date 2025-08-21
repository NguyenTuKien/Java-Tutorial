package Week3.model.Products;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book {
    private String title;
    private int price;
    private String author;
    private String publisher;
    private String type;
    private String public_year;
    private String language;

    public Book() {}
    
    public Book(String title, String author, String publisher, String type, String public_year, String language, int price) {
        this.title = title;
        this.price = price;
        this.author = author;
        this.publisher = publisher;
        this.type = type;
        this.public_year = public_year;
        this.language = language;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Book) {
            Book book = (Book) obj;
            return title.equals(book.title) 
                && price == book.price
                && author.equals(book.author) 
                && publisher.equals(book.publisher)
                && type.equals(book.type) 
                && public_year.equals(book.public_year)
                && language.equals(book.language);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return title.hashCode() 
            + price
            + author.hashCode() 
            + publisher.hashCode() 
            + type.hashCode() 
            + public_year.hashCode() 
            + language.hashCode();
    }

    @Override
    public String toString() {
        return String.format("%-15s | %-15s | %-15s | %-15s | %-15s | %-15s | %-15s", title, price, author, publisher, type, public_year, language);
    }
}

