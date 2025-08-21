package Week3.service;
import Week3.model.Products.*;
import java.util.*;

public class SearchService {
    private ProductService productService;

    public SearchService(ProductService productService){
        this.productService = productService;
    }

    public ArrayList<Book> searchBook(String keyWord){
        ArrayList<Book> listBook = productService.getListBook();
        ArrayList<Book> result = new ArrayList<>();
        for(Book book : listBook){
            if(book.getTitle().contains(keyWord)){
                result.add(book);
            }
            if(String.valueOf(book.getPrice()).contains(keyWord)){
                result.add(book);
            }
            if(book.getAuthor().contains(keyWord)){
                result.add(book);
            }
            if(book.getPublisher().contains(keyWord)){
                result.add(book);
            }
            if(book.getType().contains(keyWord)){
                result.add(book);
            }
            if(book.getPublic_year().contains(keyWord)){
                result.add(book);
            }
            if(book.getLanguage().contains(keyWord)){
                result.add(book);
            }
        }
        return result;
    }

    public ArrayList<Notebook> searchNotebook(String keyWord){
        ArrayList<Notebook> listNotebook = productService.getListNotebook();
        ArrayList<Notebook> result = new ArrayList<>();
        for(Notebook notebook : listNotebook){
            if(notebook.getName().contains(keyWord)){
                result.add(notebook);
            }
            if(String.valueOf(notebook.getPrice()).contains(keyWord)){
                result.add(notebook);
            }
            if(notebook.getBrand().contains(keyWord)){
                result.add(notebook);
            }
            if(notebook.getSize().contains(keyWord)){
                result.add(notebook);
            }
            if(notebook.getPaper().contains(keyWord)){
                result.add(notebook);
            }
        }
        return result;
    }

    public ArrayList<Pencil> searchPencil(String keyWord){
        ArrayList<Pencil> listPencil = productService.getListPencil();
        ArrayList<Pencil> result = new ArrayList<>();
        for(Pencil pencil : listPencil){
            if(pencil.getName().contains(keyWord)){
                result.add(pencil);
            }
            if(String.valueOf(pencil.getPrice()).contains(keyWord)){
                result.add(pencil);
            }
            if(pencil.getBrand().contains(keyWord)){
                result.add(pencil);
            }
            if(pencil.getMaterial().contains(keyWord)){
                result.add(pencil);
            }
            if(pencil.getHardness().contains(keyWord)){
                result.add(pencil);
            }
            if(pencil.getColor().contains(keyWord)){
                result.add(pencil);
            }
        }
        return result;
    }

    public ArrayList<Pen> searchPen(String keyWord){
        ArrayList<Pen> listPen = productService.getListPen();
        ArrayList<Pen> result = new ArrayList<>();
        for(Pen pen : listPen){
            if(pen.getName().contains(keyWord)){
                result.add(pen);
            }
            if(String.valueOf(pen.getPrice()).contains(keyWord)){
                result.add(pen);
            }
            if(pen.getBrand().contains(keyWord)){
                result.add(pen);
            }
            if(pen.getMaterial().contains(keyWord)){
                result.add(pen);
            }
            if(pen.getInk().contains(keyWord)){
                result.add(pen);
            }
            if(pen.getSmoothness().contains(keyWord)){
                result.add(pen);
            }
            
        }
        return result;
    }
    
}
