package Week2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        if (username.equals("admin")) 
        {
            String password = sc.nextLine();
            if (password.equals("admin"))
            {
                Admin admin = new Admin();
                do {
                    String request = sc.nextLine();
                    if (request.equals("exit")) {
                        break;
                    }
                    admin.function(request);
                } while (true);
            } 
        }
        else {
            Guest guest = new Guest();
            String request = sc.nextLine();
            guest.function(request);
        }
        sc.close();
    }
}
