package testing;

public class Accounts {
	
	String fName;
	String lName;
	String uName;
	String email;
	String password;
	
	//default
	Accounts () {
		uName = "";
		fName = "";
		lName = "";
		email = "";
		password = "";
	}
	
	Accounts (String uName, String fName, String lName, String email, String password) {
		this.uName = uName;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.password = password;
	}
	
	//Get value
	String getUName() {
		return uName;
	}
	
	String getFName() {
		return fName;
	}
	
	String getLName() {
		return lName;
	}
	
	String getEmail() {
		return email;
	}
	
	String getPassword() {
		return password;
	}
	
}
