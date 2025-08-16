package Week2;

public class Guest extends Admin {
    @Override
    public void function(String function){
        if(function.equals("search")){
            System.out.println("Nhập từ khóa tìm kiếm:");
            String keyWord = sc.nextLine();
            System.out.println("Kết quả tìm kiếm:");
            searchBook(keyWord).displayInfo();
            System.out.println("___________________________");
        }
        else if(function.equals("view")){
            System.out.println("Danh sách sách:");
            viewBooks();
            System.out.println("___________________________");
        }
    }
}

