package javasessions.class15.constructorConcept.assignment1;

public class Registration {
	String fName;
	String lName;
	String email;
	String telephone;
	String password;
	String passwordConfirm;
	

	public Registration(String fName, String lName, String email, String telephone, String password,
			String passwordConfirm) {
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.telephone = telephone;
		this.password = password;
		this.passwordConfirm = passwordConfirm;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Registration obj1=new Registration("Ayesha", "Yusuf", "test@gmail.com", "1234567890", "abc123","abc123");
		

	}

}
