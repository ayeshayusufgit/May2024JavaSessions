package javasessions.class21.superKeyword;

//2.
public class Car extends Vehicle{
	
	int speed=100;
	
	public Car() {
	System.out.println("Car -- default constructor");	
	}
	
	public Car(int a) {
		System.out.println("Car -- constructor:"+a);	
		}
	
	public Car(int a,int b) {
		System.out.println("Car -- constructor:"+(a+b));	
		}
	
	public void start() {
		System.out.println("Car--start");
		
	}
	public void refuel() {
		System.out.println("Car--refuel");
	}
	
	public static void testing() {
		System.out.println("Car--testing");
	}
	
	//Tell me the usecases or features of super keyword(Interview Question)
	//1.super keyword is used to call the parent class constructor from a child class constructor
	//2.But it should be used as a first statement of ur child class
	//3.its used to call the parent class variables, methods from the child class
	//4.if the child class has overridden method(start), now if I want to call parent class (start()) method
	//we have to use super.start();
	//5.if the immediate parent class does not have any var/methods, super can be used to call var/methods from 
	//the grandparents
	//6.There should be a parent n child relationship then only super keyword can be used in the child classes
	
	//Usecases of this keyword:
	//1.this() is used to initialize the class variables with the local variables
	//2.this() keyword can be used in the methods/constructors
	//3.this() keyword is used in calling the same class constructor
	//4.this() has to be the first statement
	//5.this() and super() keyword can never be together
	//6.Recursive constructor calling not allowed
	//7.We can return this keyword from a method/function:Builder Pattern
	
	
	
}

