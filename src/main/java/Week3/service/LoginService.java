package Week3.service;
import Week3.model.Users.User;
import Week3.model.Users.Role;

public class LoginService {
    public boolean checkLogin(User user){
        if(user.getUsername().equals("admin")){
            if(user.getPassword().equals("admin")){
                user.setRole(Role.ADMIN);
                return true;
            }
            return false;
        }
        else if(user.getUsername().equals("guest")){
            if(user.getPassword().isEmpty()){
                user.setRole(Role.GUEST);
                return true;
            }
            return false;
        }
        return false;
    }
}
