package Week3.model.Products;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Notebook {
    private String name;
    private int price;
    private String brand;
    private String paper;
    private String size;

    public Notebook() {}

    public Notebook(String name, int price, String brand, String paper, String size) {
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.paper = paper;
        this.size = size;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Notebook) {
            Notebook notebook = (Notebook) obj;
            return name.equals(notebook.name) 
                && price == notebook.price 
                && brand.equals(notebook.brand)
                && paper.equals(notebook.paper) 
                && size.equals(notebook.size);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + price + brand.hashCode() + paper.hashCode() + size.hashCode();
    }

    @Override
    public String toString() {
        return String.format("%-15s | %-15s | %-15s | %-15s | %-15s", name, price, brand, paper, size);
    }
}
