package javasessions.class17_18.inheritanceConcept;

public class Audi extends Car {

	@Override
	//Overridden method
	public void start() {
		System.out.println("Audi--start");
	}
	
	//Individual method
	public void theftSafety() {
		System.out.println("Audi--theft safety");
	}
	
	final public void speedTracking() {
		System.out.println("Audi--speed tracking");
	}
}
