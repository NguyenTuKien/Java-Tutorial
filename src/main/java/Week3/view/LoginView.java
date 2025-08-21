package Week3.view;
import java.util.*;
import Week3.service.LoginService;
import Week3.model.Users.*;

public class LoginView {
    private final LoginService loginService;
    private final Scanner sc;

    public LoginView(){
        loginService = new LoginService();
        sc = new Scanner(System.in);
    }
    
    public void show(){
        while (true) {
            System.out.println("Username: ");
            String username = sc.nextLine();
            System.out.println("Password: ");
            String password= sc.nextLine();
            User user = new User(username, password);
            if(loginService.checkLogin(user)){
                MenuView menu = new MenuView();
                menu.show(user);
                break;
            }
            else {
                System.out.println("Wrong!!!");
            }
        }
        
    }
}
