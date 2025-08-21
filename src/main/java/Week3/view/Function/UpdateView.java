package Week3.view.Function;
import java.util.Scanner;
import Week3.service.UpdateService;
import Week3.service.ProductService;
import Week3.model.Products.*;

public class UpdateView {
    private Scanner sc;
    private AddView addView;
    private UpdateService updateService;

    public UpdateView(ProductService productService){
        sc = new Scanner(System.in);
        addView = new AddView(productService);
        updateService = new UpdateService(productService);
    }

    public void show(){
        System.out.println("Input index: ");
        int index = sc.nextInt() - 1;
        Object product = addView.newProduct();
        if (product instanceof Book) {
            try{
                updateService.Update(index, (Book) product);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Index out of bounds");
            }
        } else if (product instanceof Notebook) {
            try{
                updateService.Update(index, (Notebook) product);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Index out of bounds");
            }
        } else if (product instanceof Pencil) {
            try{
                updateService.Update(index, (Pencil) product);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Index out of bounds");
            }
        } else if (product instanceof Pen) {
            try{
                updateService.Update(index, (Pen) product);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Index out of bounds");
            }
        }
    }
}
