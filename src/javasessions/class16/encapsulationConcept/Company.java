package javasessions.class16.encapsulationConcept;

//8.
public class Company {

	//Use of a private Constructor
	//Is to avoid creating unnecessary objects.Its specially used in the utilities
	//(ExcelUtils or JSONUtils etc) when you need to use them using Classname.methodname();
	
	
	
	//Whenever there is a class having a private constructor
	//then its mandatory to create all the methods static
	private Company() {
		System.out.println("private constructor");
	}
	//The object of Company for the private constructor cannot be created
	
	//Can we have a public and private constructor with the same signature?
	//We can but the signature has to be different
//	public Company() {
//		
//	} will give an error
	
	//The object of Company which invoking the public constructor can be created
	public Company(int a) {
		
	}
	
	
	//non static methods
	//This method cannot be invoked, as a non static method requires an object to be created of the class and 
	//using the ref, methods can be invoked but in this case since the constructor is private the 
	//object cannot be created thus ns methods cannot be invoked when the constructor is private
	public void getEmployees() {
		System.out.println("Get Employees");
	}
	
	
	//private static methods
	//These methods cannot be directly accessed by a user as its private but through a public method 
	//within Company, the public method can be accessed by the user(getDetails), This is Encapsulation 
	private static void getRevenue() {
		System.out.println("Get Revenue");
	}
	
	//public static methods
	//The object of this class need not be created, but using the classname.methodname() can be invoked
	public static void  getDetails() {
		getRevenue();//Encapsulation
	} 
	

}
