package main;
import utils.PasswordValidator;
import users.UserManager;
import java.io.Console;

public class LoginSystem{
    public static void main(String args[]){

    Console cs = System.console();
    String username;
    String password;

    System.out.print("Username: ");
    username = cs.readLine();
    
    System.out.print("Password: ");
    password = cs.readPassword();

    UserManager user = new UserManager();
    LoginProcessor loginProcessor = user;
    
    System.out.println("Login Status: " + loginProcessor.authenticate(username, password));
    
    }
}
