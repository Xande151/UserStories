package testing;

import java.util.Map;
import java.util.Scanner;

public class Login {
    
    public static Accounts userLogin(Map<String, Accounts> accountsMap) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Input username: ");
        String username = keyboard.next();

        System.out.println("Input password: ");
        String password = keyboard.next();

        if (checkLogin(accountsMap, username, password)) {
            System.out.println("Login successful.");
            return accountsMap.get(username);
        } else {
            System.out.println("Login failed.");
            return null;
        }
    }
    
    //Function to check username and password to a given Accounts map
    public static boolean checkLogin(Map<String, Accounts> accountsMap, String username, String password) {
            if (!accountsMap.containsKey(username)) {
            //No account found with this username
                return false;
            }

            //Check username and password
            return accountsMap.get(username).getPassword().equals(password);
        }
}
