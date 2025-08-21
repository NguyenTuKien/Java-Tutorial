package Week3.service;
import Week3.model.Products.*;

public class UpdateService {
    private ProductService productService;

    public UpdateService(ProductService productService){
        this.productService = productService;
    }

    public void Update(int index, Book book){
        productService.getListBook().set(index, book);
        System.out.println("Success!!");
    }

    public void Update(int index, Notebook notebook){
        productService.getListNotebook().set(index, notebook);
        System.out.println("Success!!");
    }

    public void Update(int index, Pencil pencil){
        productService.getListPencil().set(index, pencil);
        System.out.println("Success!!");
    }

    public void Update(int index, Pen pen){
        productService.getListPen().set(index, pen);
        System.out.println("Success!!");
    }
}
