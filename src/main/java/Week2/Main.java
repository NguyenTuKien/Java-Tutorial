package Week2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập username:");
        String username = sc.nextLine();
        if (username.equals("admin")) 
        {
            System.out.println("Nhập password:");
            String password = sc.nextLine();
            if (password.equals("admin"))
            {
                System.out.println("Đăng nhập thành công!");
                Admin admin = new Admin();
                do {
                    System.out.println("Nhập chức năng (hoặc 'exit' để đăng xuất):");
                    String request = sc.nextLine();
                    if (request.equals("exit")) {
                        System.out.println("Đăng xuất thành công!");
                        break;
                    }
                    admin.function(request);
                } while (true);
            } 
            else {
                System.out.println("Mật khẩu không đúng!");
            }
        }
        else {
            System.out.println("Bạn là khách, không có quyền truy cập vào chức năng quản trị.");
            Guest guest = new Guest();
            String request = sc.nextLine();
            guest.function(request);
        }
        sc.close();
    }
}
