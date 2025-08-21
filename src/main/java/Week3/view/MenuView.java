package Week3.view;
import java.util.*;
import Week3.service.*;
import Week3.view.Function.*;
import Week3.model.Users.*;
import Week3.model.Products.*;

public class MenuView {
    Scanner sc;
    private ProductService productService;
    private ArrayList<Book> listBook;
    private ArrayList<Notebook> listNotebook;
    private ArrayList<Pencil> listPencil;
    private ArrayList<Pen> listPen;

    public MenuView(){
        sc = new Scanner(System.in);
        productService = new ProductService();
        listBook = productService.getListBook();
        listNotebook = productService.getListNotebook();
        listPencil = productService.getListPencil();
        listPen = productService.getListPen();
    }
    
    public void show(User user){
        while (true) {
            System.out.println("0. Exit");
            System.out.println("1. Search");
            System.out.println("2. Show");
            if(user.getRole().equals(Role.ADMIN)){
                System.out.println("3. Add");
                System.out.println("4. Update");
                System.out.println("5. Remove");
            }
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 0:
                    System.out.println("THE-END");
                    return;

                case 1:
                    SearchView searchView = new SearchView(productService);
                    searchView.show();
                    break;
            
                case 2:
                    ShowView showView = new ShowView(listBook, listNotebook, listPencil, listPen);
                    showView.show();
                    break;

                case 3:
                    AddView addView = new AddView(productService);
                    addView.show();
                    break;

                case 4:
                    UpdateView updateView = new UpdateView(productService);
                    updateView.show();
                    break;

                case 5: 
                    RemoveView removeView = new RemoveView(productService);
                    removeView.show();
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
