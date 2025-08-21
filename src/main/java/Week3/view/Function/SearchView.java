package Week3.view.Function;
import java.util.*;
import Week3.model.Products.*;
import Week3.service.*;

public class SearchView {
    private Scanner sc;
    private SearchService searchService;
    private ShowView showView;

    public SearchView(ProductService productService){
        sc = new Scanner(System.in);
        searchService = new SearchService(productService);
    }

    public void show(){
        System.out.println("Keyword: ");
        String keyWord = sc.nextLine();
        ArrayList<Book> listBookSearch = searchService.searchBook(keyWord);
        ArrayList<Notebook> listNotebookSearch = searchService.searchNotebook(keyWord);
        ArrayList<Pencil> listPencilSearch = searchService.searchPencil(keyWord);
        ArrayList<Pen> listPenSearch = searchService.searchPen(keyWord);
        showView = new ShowView(listBookSearch, listNotebookSearch, listPencilSearch, listPenSearch);
        showView.show();
    }
}
