package Week3.service;
import Week3.model.Products.*;
import java.util.*;

public class ListService {

    public void ViewBook(ArrayList<Book> listBook){
        for(Book book : listBook){
            System.out.printf("Title : %s\n", book.getTitle());
            System.out.printf("Author : %s\n", book.getAuthor());
            System.out.printf("Publisher : %s\n", book.getPublisher());
            System.out.printf("Type : %s\n", book.getType());
            System.out.printf("Year : %s\n", book.getPublic_year());
            System.out.printf("Language : %s\n", book.getLanguage());
            System.out.printf("Price : %d\n", book.getPrice());
            System.out.println("--------------------------------");
        }
    }

    public void ViewNotebook(ArrayList<Notebook> listNotebook){
        for(Notebook notebook : listNotebook){
            System.out.printf("Name : %s\n", notebook.getName());
            System.out.printf("Price : %d\n", notebook.getPrice());
            System.out.printf("Paper : %s\n", notebook.getPaper());
            System.out.printf("Size : %s\n", notebook.getSize());
            System.out.println("--------------------------------");
        }
    }

    public void ViewPencil(ArrayList<Pencil> listPencil){
        for(Pencil pencil : listPencil){
            System.out.printf("Name : %s\n", pencil.getName());
            System.out.printf("Price : %d\n", pencil.getPrice());
            System.out.printf("Brand : %s\n", pencil.getBrand());
            System.out.printf("Color : %s\n", pencil.getColor());
            System.out.printf("Material : %s\n", pencil.getMaterial());
            System.out.printf("Hardness : %s\n", pencil.getHardness());
            System.out.println("--------------------------------");
        }
    }

    public void ViewPen(ArrayList<Pen> listPen){
        for(Pen pen : listPen){
            System.out.printf("Name : %s\n", pen.getName());
            System.out.printf("Price : %d\n", pen.getPrice());
            System.out.printf("Color : %s\n", pen.getColor());
            System.out.printf("Material : %s\n", pen.getMaterial());
            System.out.printf("Ink : %s\n", pen.getInk());
            System.out.printf("Smoothness : %s\n", pen.getSmoothness());
            System.out.println("--------------------------------");
        }
    }

}
