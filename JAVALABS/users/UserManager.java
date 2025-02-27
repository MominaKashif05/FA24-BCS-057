package users;
import main.LoginSystem;

public class UserManager {
    static final String storedUsername = "abcxyz";
    static final String storedPassword = "a123";

    public static LoginProcessor {
        static boolean authenticate(String username, String password) {
            if (storedUsername.equals(username) && storedPassword.equals(password)) {
                return true;
            }
        }
    }
}
