package javasessions.class17_18.inheritanceConcept;

//inheritance -- helps in reusability
//final class -- prevents inheritance 
//a class cannot be static
public class Car extends Vehicle{
	//This is Car class variable
	//int speed=100;
	
	//Interview question:Prove that there is no concept of variable overriding?
	//after using final keyword, the speed variable is not giving an error in the speed variable of BMW class
	//Thus proving that the speed is the individual variable of Car class and the same for speed variable in BMW class  
	final int speed=100;
	
	int price=70;
	
	//Method Overloading
	public void start() {
		System.out.println("Car---start");
	}
	
	//Method Overloading
	public void start(int a) {
		System.out.println("Car---start(int)");
	}

	public void stop() {
		System.out.println("Car---stop");
	}

	//final methods cannot be overridden -- prevents method overriding
	public final void refuel() {
		System.out.println("Car---refuel");
	}

	public void applyBreak() {
		System.out.println("Car--apply break");
	}

	public static void billing() {
		System.out.println("Car--billing");
	}

	//It is an individual private method of Car class
	//This private method cannot be accessed from outside the class
	private void getCarInfo() {
		System.out.println("Car--get info");
	}
	
	//getCarInfo() is a private method which can be accessed from outside the Car class using a public method(Encapsulation) 
	//But getCarInfo() cannot be accessed directly from outside the Car class
	public void getInfo() {
		getCarInfo();
	}
	
	@Override
	public void cruiseControl() {
		System.out.println("Car--cruise control");
	}
}
