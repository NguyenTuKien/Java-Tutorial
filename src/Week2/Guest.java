package Week2;

public class Guest extends Admin {
    @Override
    public void function(String function){
        if(function.equals("search")){
            String keyWord = sc.nextLine();
            searchBook(keyWord).displayInfo();
            System.out.println("___________________________");
        }
        else if(function.equals("view")){
            viewBooks();
            System.out.println("___________________________");
        }
    }
}

