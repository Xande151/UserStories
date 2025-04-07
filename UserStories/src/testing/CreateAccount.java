package testing;

import java.util.Scanner;

public class CreateAccount {
	
	public static Accounts AccountCreation() {
		
		Scanner keyboard = new Scanner(System.in);
		
		//Get input from users
		//There is no checks for if the input is valid or not. Can add later if needed
		System.out.println("Please enter your first name: ");
		String fName = keyboard.next();
		
		System.out.println("Please enter your last name: ");
		String lName = keyboard.next();
		
		System.out.println("Please enter your email: ");
		String email = keyboard.next();
		
		System.out.println("Please enter a username: ");
		String uName = keyboard.next();
		
		System.out.println("Please enter your password: ");
		String password = keyboard.next();
		
        return new Accounts(uName, fName, lName, email, password);
        
	}
	
	
}
