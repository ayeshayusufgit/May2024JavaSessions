package javasessions.class24.accessSpecifier.AccMod1;

//1.

//Classes cannot be private they can be public,abstract and final
//classes cannot be private,protected and default
public class Car {
	
	
	//Data members:vars+methods+constructors //rule will be the same for variables and methods
	
	String name; //default access specifier
	public int price;
	protected String color;
	private String chasisNumber;
	
	//public constructor of a class can be created
//	public Car() {
//		System.out.println("Car---constructor");
//	}
	
	//private constructor of a class can be created but the methods have to be static(wo creating the object of the class)
//	private Car() {
//		System.out.println("Car---constructor");
//	}
	
//  protected constructor will not allow the object to be created in another package and a non subclass	
	protected Car() {
		System.out.println("Car---constructor");
	}
	
	
	//default constructor will be allowed except for in Truck n Audi class
//	Car(){
//		System.out.println("Car---constructor");
//	}
	
	//the preferred access specifiers for constructors are private(singleton pattern or public)
	
	public void billing() {
		System.out.println("Car---billing");
	}
	
	private void start() {
		System.out.println("Car---start");
	}
	
	protected void stop() {
		System.out.println("Car---stop");
	}
	
	protected void refuel() {
		System.out.println("Car---refuel");
	}
	
	void autolock() {
		System.out.println("Car---autolock");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.members within the Same class 
		Car c=new Car();
		c.name="BMW X1";//default member can be accessed within the class Car
		c.price=123456;//public member can be accessed within the class Car
		c.color="Red";//protected member can be accessed within the class Car
		c.chasisNumber="123";//private member can be accessed within the class Car
	}
}
	