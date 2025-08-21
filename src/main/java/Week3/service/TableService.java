package Week3.service;
import java.util.*;
import Week3.model.Products.*;

public class TableService {

    public void ViewBook(ArrayList<Book> listBook){
        System.out.println(String.format("%-15s | %-15s | %-15s | %-15s | %-15s | %-15s | %-15s", "Title", "Price", "Author", "Publisher", "Type", "Year", "Language"));
        System.out.println("------------------------------------------------------------------------------------------------");
        for(Book book : listBook){
            System.out.println(book.toString());
        }
        System.out.println("------------------------------------------------------------------------------------------------");

    }

    public void ViewNotebook(ArrayList<Notebook> listNotebook){
        System.out.println(String.format("%-15s | %-15s | %-15s | %-15s | %-15s", "Name", "Price", "Brand", "Paper", "Size"));
        System.out.println("------------------------------------------------------------------------------------------------");
        for(Notebook notebook : listNotebook){
            System.out.println(notebook.toString());
        }
        System.out.println("------------------------------------------------------------------------------------------------");

    }

    public void ViewPencil(ArrayList<Pencil> listPencil){
        System.out.println(String.format("%-15s | %-15s | %-15s | %-15s | %-15s | %-15s", "Name", "Price", "Brand", "Color", "Material", "Hardness"));
        System.out.println("------------------------------------------------------------------------------------------------");
        for(Pencil pencil : listPencil){
            System.out.println(pencil.toString());
        }
        System.out.println("------------------------------------------------------------------------------------------------");

    }

    public void ViewPen(ArrayList<Pen> listPen){
        System.out.println(String.format("%-15s | %-15s | %-15s | %-15s | %-15s | %-15s | %-15s", "Name", "Price", "Brand", "Color", "Material", "Ink", "Smoothness"));
        System.out.println("------------------------------------------------------------------------------------------------");
        for(Pen pen : listPen){
            System.out.println(pen.toString());
        }
        System.out.println("------------------------------------------------------------------------------------------------");
    }
}
