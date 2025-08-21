package Week3.service;
import Week3.model.Products.*;

public class AddService {
    private ProductService productService;

    public AddService(ProductService productService){
        this.productService = productService;
    }

    public void Add(Book book){
        productService.getListBook().add(book);
        System.out.println("Success!!");
    }

    public void Add(Notebook notebook){
        productService.getListNotebook().add(notebook);
        System.out.println("Success!!");
    }

    public void Add(Pencil pencil){
        productService.getListPencil().add(pencil);
        System.out.println("Success!!");
    }
    
    public void Add(Pen pen){
        productService.getListPen().add(pen);
        System.out.println("Success!!");
    }

    
}
