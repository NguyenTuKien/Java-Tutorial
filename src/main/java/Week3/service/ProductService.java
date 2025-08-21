package Week3.service;
import java.util.*;
import Week3.model.Products.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductService {
    private ArrayList <Book> ListBook = new ArrayList<>();
    private ArrayList <Notebook> ListNotebook = new ArrayList<>();
    private ArrayList <Pencil> ListPencil = new ArrayList<>();
    private ArrayList <Pen> ListPen = new ArrayList <>();

    public ProductService(){
        ListBook.add(new Book("Book1", "Author1", "Publisher1", "Type1", "2021", "Language1", 100000));
        ListNotebook.add(new Notebook("Notebook1", 100000, "Brand1", "Paper1", "Size1"));
        ListPencil.add(new Pencil("Pencil1", 100000, "Brand1", "Color1", "Material1", "Hardness1"));
        ListPen.add(new Pen("Pen1", 100000, "Brand1", "Color1", "Material1", "Ink1", "Smoothness1"));
    };
}
