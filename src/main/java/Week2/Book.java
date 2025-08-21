package Week2;

public class Book {
    private String title;
    private String author;
    private String type;
    private String public_date;

    public Book(String title, String author, String type, String public_date) {
        this.title = title;
        this.author = author;
        this.type = type;
        this.public_date = public_date;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getType() {
        return type;
    }

    public String getPublicDate() {
        return public_date;
    }

    public void displayInfo() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(type);
        System.out.println(public_date);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Book) {
            Book book = (Book) obj;
            return title.equals(book.title) && author.equals(book.author) && type.equals(book.type) && public_date.equals(book.public_date);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return title.hashCode() + author.hashCode() + type.hashCode() + public_date.hashCode();
    }
}
