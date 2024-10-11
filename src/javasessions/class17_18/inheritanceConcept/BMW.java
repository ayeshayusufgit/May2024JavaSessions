package javasessions.class17_18.inheritanceConcept;

public class BMW extends Car {
//public class BMW extends Car,Truck {
	//The BMW class can inherit from either Car or Truck, multiple inheritance is not allowed in Java 
	
	//@Override cannot be used in variables
	//This is BMW class variable
	int speed = 200;
	
	//Method Overriding:is called Poly(many) + morphism(forms): Runtime/Dynamic Binding 
	//when we have a method in parent class and the same method in the child class:
	//1. with the same name
	//2. with the same number of parameters
	//3. with the same sequence of parameters
	//4. the business logic or the number of lines of code in the body doesn't matter
	//5. the return type should also be the same
	
	//static methods cannot be overridden but can be overloaded
	
	int price=500;
	
	
	//This annotation can only be applied to the overridden method
	@Override
	public void start() {
		System.out.println("BMW--start");
		super.start();//this is used to call the Car class, start() 
	}
	
	//This is an overloaded method coming from the Car class, this can be overridden in the BMW class
	@Override
	public void start(int a) {
		System.out.println("BMW--start(int)");
	}
	
	
	//This annotation can only be applied to overridden methods(those methods that are there in the parent)
	//@Override its an identifier to differentiate between an overridden n non-overridden method
	
	//This is an individual method of BMW
	public void autoParking() {
		System.out.println("BMW--auto parking");
		//refuel();//calling an inherited method(refuel()) from the Car class from the child class is possible
		applyBreak();//method chaining, calling method from the same class
		stop();
	}
	
	@Override
	public void applyBreak() {
		System.out.println("BMW--apply break");
	}
	
	@Override
	public void engine() {
		System.out.println("BMW--engine");
	}
	
	
	//@Override - static methods cannot be overridden
	
	//parent is having the static method and child is having the same method and this is called as Method Hiding
	//method hiding is applicable only if the parent-child method is static, same method name and signature
	
	//static methods can be overloaded
	public static void billing() {
		System.out.println("BMW--billing");
	}
	
	//@Override - private methods cannot be overridden
	//private methods can be overloaded
	//It is an individual private method of BMW class 
	private void getCarInfo() {
		System.out.println("BMW--get info");
	}
	
//	public final void refuel() {
//		System.out.println("Car---refuel");
//	}
	
	public void speedTracking() {
		System.out.println("BMW--speed tracking");
	}
	
	//Can a method be overriden of an overloaded method?
	//It is possible
	
	public void bmwLoading() {
		Truck tr=new Truck();//BMW method has Truck Class object but its not inheritance, its able to access all its properties
		tr.heavyLoading();//This is called composition
		Audi au=new Audi();
		au.speedTracking();
		//even though its a final method of the Audi class it can be used in the BMW class method
		//but it can't be overridden
	}
	
}
