package Week3.view.Function;
import java.util.*;
import Week3.service.*;
import Week3.model.Products.*;

public class ShowView {
    private Scanner sc;
    private TableService tableService;
    private ListService listService;
    private ArrayList<Book> listBook;
    private ArrayList<Notebook> listNotebook;
    private ArrayList<Pencil> listPencil;
    private ArrayList<Pen> listPen;

    public ShowView(ArrayList<Book> listBook, ArrayList<Notebook> listNotebook, ArrayList<Pencil> listPencil, ArrayList<Pen> listPen){
        sc = new Scanner(System.in);
        tableService = new TableService();
        listService = new ListService();
        this.listBook = listBook;
        this.listNotebook = listNotebook;
        this.listPencil = listPencil;
        this.listPen = listPen;
    }

    public void show(){
        System.out.println("Table/List: ");
        System.out.println("1. Table");
        System.out.println("2. List");
        int choice3 = sc.nextInt();
        sc.nextLine();
        if(choice3 == 1){
            System.out.println("-------Book-------");
            tableService.ViewBook(listBook);
            System.out.println("-------Notebook-------");
            tableService.ViewNotebook(listNotebook);
            System.out.println("-------Pencil-------");
            tableService.ViewPencil(listPencil);
            System.out.println("-------Pen-------");
            tableService.ViewPen(listPen);
        }
        else if(choice3 == 2){
            System.out.println("-------Book-------");
            listService.ViewBook(listBook);
            System.out.println("-------Notebook-------");
            listService.ViewNotebook(listNotebook);
            System.out.println("-------Pencil-------");
            listService.ViewPencil(listPencil);
            System.out.println("-------Pen-------");
            listService.ViewPen(listPen);
        }
    }
}
