package testing;

import java.util.Scanner;


import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		String accountOrLogin = AccountOrLogin();
		
		//Create a key Map with the key being the username and the value being the account info
		Map<String, Accounts> accountsMap = new HashMap<>();
		//accountsMap.put("john", new Accounts("john", "John", "Block", "johnB@gmail.com", "mypassword"));

		//Create default account = nothing
		Accounts account = new Accounts();
		
		//If user inputs create then prompt them with inputs to create an account
		if (accountOrLogin.equals("create")) {
			account = CreateAccount.AccountCreation();
			//Put the account username into the map
	        accountsMap.put(account.getUName(), account);
			System.out.println("Account created.");
		}
        
        //This is a test to print the password
        //System.out.println(accountsMap.get(account.getUName()).getPassword());	
        
		//If user inputs login then ask for username and password, and perform login
		if (accountOrLogin.equals("login")) {
			account = Login.userLogin(accountsMap);
			System.out.println("Welcome " + account.getFName() + "!");
		}

		//test for correct login
		//System.out.println(Login.checkLogin(accountsMap, "john", "mypassword"));

		//test for incorrect login
		//System.out.println(Login.checkLogin(accountsMap, "john", "wrongpassword"));

		//test for non-existent user login
		//System.out.println(Login.checkLogin(accountsMap, "bob", "12345"));
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
	public void testTaskIsSuccessfullyAdded() {
	 
      Task task = new Task("1", "Laundry", "Wash clothes");
      todo.addTask(task);
      assertTrue(todo.getTasks().contains(task));
  }

  // Test that task count increases after adding
  @Test
  public void testTaskCountIncreasesAfterAdding() {
      int before = todo.getTasks().size();
      todo.addTask(new Task("2", "Study", "Read chapter 5"));
      assertEquals(before + 1, todo.getTasks().size());
  }

  //Test that task has correct title and details
  @Test
  public void testTaskHasCorrectTitleAndDetails() {
      Task task = new Task("3", "Exercise", "Run 3 miles");
      todo.addTask(task);
      Task added = todo.getTasks().get(0);
      assertEquals("Exercise", added.getTitle());
      assertEquals("Run 3 miles", added.getDetails());
  }

}
