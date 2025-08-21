package Week3.view.Function;
import java.util.Scanner;
import Week3.model.Products.*;
import Week3.service.AddService;
import Week3.service.ProductService;

public class AddView {
    private Scanner sc;
    private AddService addService;

    public AddView(ProductService productService){
        sc = new Scanner(System.in);
        addService = new AddService(productService);
    }

    public Object newProduct(){
        System.out.println("1. Book");
        System.out.println("2. Notebook");
        System.out.println("3. Pencil");
        System.out.println("4. Pen");
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1:
                Book book = new Book();
                System.out.println("Title: ");
                book.setTitle(sc.nextLine());
                System.out.println("Price: ");
                book.setPrice(sc.nextInt());
                sc.nextLine();
                System.out.println("Author: ");
                book.setAuthor(sc.nextLine());
                System.out.println("Publisher: ");
                book.setPublisher(sc.nextLine());
                System.out.println("Year: ");
                book.setPublic_year(sc.nextLine());
                System.out.println("Language: ");
                book.setLanguage(sc.nextLine());
                System.out.println("Type: ");
                book.setType(sc.nextLine());
                return book;
            case 2:
                Notebook notebook = new Notebook();
                System.out.println("Name: ");
                notebook.setName(sc.nextLine());
                System.out.println("Price: ");
                notebook.setPrice(sc.nextInt());
                sc.nextLine();
                System.out.println("Brand: ");
                notebook.setBrand(sc.nextLine());
                System.out.println("Paper: ");
                notebook.setPaper(sc.nextLine());
                System.out.println("Size: ");
                notebook.setSize(sc.nextLine());
                return notebook;
            case 3:
                Pencil pencil = new Pencil();
                System.out.println("Name: ");
                pencil.setName(sc.nextLine());
                System.out.println("Price: ");
                pencil.setPrice(sc.nextInt());
                sc.nextLine();
                System.out.println("Brand: ");  
                pencil.setBrand(sc.nextLine());
                System.out.println("Color: ");
                pencil.setColor(sc.nextLine());
                System.out.println("Material: ");  
                pencil.setMaterial(sc.nextLine());
                System.out.println("Hardness: ");
                pencil.setHardness(sc.nextLine());
                return pencil;
            case 4:
                Pen pen = new Pen();
                System.out.println("Name: ");
                pen.setName(sc.nextLine());
                System.out.println("Price: ");
                pen.setPrice(sc.nextInt());
                sc.nextLine();
                System.out.println("Brand: ");
                pen.setBrand(sc.nextLine());
                System.out.println("Color: ");
                pen.setColor(sc.nextLine());
                System.out.println("Material: ");
                pen.setMaterial(sc.nextLine());
                System.out.println("Ink: ");
                pen.setInk(sc.nextLine());
                System.out.println("Smoothness: ");
                pen.setSmoothness(sc.nextLine());
                return pen;
            default:
                System.out.println("Invalid choice");
                return null;
        }
    }

    public void show(){
        Object product = newProduct();
        if (product instanceof Book) {
            addService.Add((Book) product);
        } else if (product instanceof Notebook) {
            addService.Add((Notebook) product);
        } else if (product instanceof Pencil) {
            addService.Add((Pencil) product);
        } else if (product instanceof Pen) {
            addService.Add((Pen) product);
        }
    }
}
