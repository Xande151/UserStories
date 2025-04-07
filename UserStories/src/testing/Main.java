package testing;

import testing.CreateAccount;
import java.util.Scanner;
import testing.Accounts;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		String accountOrLogin = AccountOrLogin();
		
		//Create a key Map with the key being the username and the value being the account info
		Map<String, Accounts> accountsMap = new HashMap<>();
		
		//Create default account = nothing
		Accounts account = new Accounts();
		
		//If user inputs create then prompt them with inputs to create an account
		if (accountOrLogin.equals("create")) {
			account = CreateAccount.AccountCreation();
			//Put the account username into the map
	        accountsMap.put(account.getUName(), account);
		}
        
        //This is a test to print the password
        //System.out.println(accountsMap.get(account.getUName()).getPassword());	
        
	}

	public static String AccountOrLogin() {
		
		Scanner keyboard = new Scanner(System.in);
		
		//Loop to keep asking user to create an account or login until valid input
		while (true) {
			
			System.out.println("Welcome would you like to create an account or login?\n"
					+ "Please type: \"create\" or \"login\"");
			String accountOrLogin = keyboard.next();
			
			if (accountOrLogin.equals("create") || accountOrLogin.equals("login")) {
				return accountOrLogin;
			} else {
				System.out.println("Sorry, input invalid. Please try again.\n");
			}
		}
	}
}
