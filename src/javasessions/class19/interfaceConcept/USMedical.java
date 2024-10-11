package javasessions.class19.interfaceConcept;

public interface USMedical extends WHO {
	
	int MIN_FEE=10;
	//interface vars are static and final by default
	//static and final keywords need not be written for the interface variables 
	
	//Interface cannot have the method body
//	public void test() {
//		
//	}
	
	//only method declaration: no method body called abstract method
	//cannot create the object of the interface
	//abstract methods:a method wo a body(only for non static methods)
	//static method can be created with the method body
	//Since object cannot be created of the interface thus cannot create the constructor of the interface
	//In the interface the abstract methods need not be written with the abstract keyword
	//By default all the methods of an interface are abstract in nature
	
	
	//If Fortis has to open a hospital in US then it should have these 3 services
	public void physioServices();
	public void oncologyServices();
	public void dentalServices();
	
	//Common method for all the countries
	public void emergencyServices();
	
	//Can a private method be created wo any method body?
	//private void freeMedical();
	//every abstract method has to be overridden, but private methods cannot be overridden in interfaces
	
	//Can a final method be abstract? no, the abstract methods need to be overridden and since its final it shouldn't be overridden 
	//public final void medicalResults(); 
	
	
	//Can i have a method with a body in an interface?:Yes
	//After JDK 1.8, 2 major changes happened
	//1.a static method with body was allowed
	//any no. of static methods can be there
	//static methods cannot be overridden in the implementing class 
	//2.Can have non static method with method body but should be written with the default keyword 
	
	//Method Hiding
	public static void billing() {
		System.out.println("US Medical--billing");
	}
	
	//non static method body with a default keyword in an interface
	//There can be n number of default non static methods in an interface
	//Can we override the default method of interface? 
	default void medicalInsurance() {
		System.out.println("US Medical--medicalInsurance");
	}
}
