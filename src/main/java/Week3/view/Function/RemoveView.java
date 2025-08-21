package Week3.view.Function;
import java.util.Scanner;
import Week3.service.RemoveService;
import Week3.service.ProductService;

public class RemoveView {
    private Scanner sc;
    private RemoveService removeService;

    public RemoveView(ProductService productService){
        sc = new Scanner(System.in);
        removeService = new RemoveService(productService);
    }

    public void show(){
        System.out.println("Input index: ");
        int index = sc.nextInt() - 1;
        System.out.println("Type of product: ");
        System.out.println("1. Book");
        System.out.println("2. Notebook");
        System.out.println("3. Pencil");
        System.out.println("4. Pen");
        int choice = sc.nextInt();
        sc.nextLine();
        if (choice == 1) {
            try{    
                removeService.RemoveBook(index);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Index out of bounds");
            }
        } else if (choice == 2) {
            try{
                removeService.RemoveNotebook(index);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Index out of bounds");
            }
        } else if (choice == 3) {
            try{
                removeService.RemovePencil(index);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Index out of bounds");
            }
        } else if (choice == 4) {
            try{
                removeService.RemovePen(index);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Index out of bounds");
            }
        }
    }
}
