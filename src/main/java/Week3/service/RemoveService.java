package Week3.service;
import java.util.ArrayList;
import Week3.model.Products.*;

public class RemoveService {
    private ProductService productService;
    private ArrayList<Book> listBook;
    private ArrayList<Notebook> listNotebook;
    private ArrayList<Pencil> listPencil;
    private ArrayList<Pen> listPen;

    public RemoveService(ProductService productService){
        this.productService = productService;
        this.listBook = productService.getListBook();
        this.listNotebook = productService.getListNotebook();
        this.listPencil = productService.getListPencil();
        this.listPen = productService.getListPen();
    }

    public void RemoveBook(int index){
        listBook.remove(listBook.get(index));
        System.out.println("Success!!");
    }

    public void RemoveNotebook(int index){
        listNotebook.remove(listNotebook.get(index));
        System.out.println("Success!!");
    }

    public void RemovePencil(int index){
        listPencil.remove(listPencil.get(index));
        System.out.println("Success!!");
    }

    public void RemovePen(int index){
        listPen.remove(listPen.get(index));
        System.out.println("Success!!");
    }
}
