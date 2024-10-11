package javasessions.class16.encapsulationConcept;

//7.
public class Bank {

	// To open an account in a bank, registration has to be done
	
	//public final String name="Naveen"; final shouldnt be used as it has to initialized and the value cant 
	//be updated final is only used when u have to declare a constant
	
	//The user cannot assign values to the instance/class variables directly but through getter/setters which is a public layer
	private String name;
	private int age;// age should be greater than >= 18
	private String aadharNumber;
	private String phone;

	//Constructor helps in restricting the unnecessary objects
	//The first time initial value we are setting through the constructor
	
	//Constructors can be overloaded
	//Constructors cannot be overridden
	public Bank(String name, int age, String aadharNumber, String phone) {
		this.name = name;
		if(age>=18) {
			this.age = age;
		}
		this.aadharNumber = aadharNumber;
		this.phone = phone;
	}

	
	public String getName() {
		return name;
	}

	//Setters helps in updating values
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) { // some conditions can be applied in the setter before setting the value
		if(age>=18) {
		this.age = age;
		}
	}

	public String getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void openAccount() {
		if(this.age>=18) {
			System.out.println("Opening the account");
		}else {
			System.out.println("Age is less than 18, pls provide the age certificate, age should be greater than 18");
		}
		
	}
}
