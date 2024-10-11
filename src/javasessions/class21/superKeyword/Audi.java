package javasessions.class21.superKeyword;

//6.
public class Audi extends Car {

	public Audi() {
		super();
		//super() keyword should always be the first statement in the child class constructor ow gives an error
		
		System.out.println("Audi -- default constructor");
	}

	public Audi(int a) {
		//super();Can be used to call the Parent class default constructor
		super(a);
		//super(100); Can be used to call the Parent class parameterized constructor
		
		//The Parent class constructor cannot be called more than once, 
		//in the above case super keyword is the 2nd statement
		
		System.out.println("Audi -- constructor:" + a);
	}

	public Audi(int a, int b) {
		
		//if no super keyword is written then by default a super() keyword is added by the compiler
		
		//super(10,20);
		
		super(a, b);
		
		System.out.println("Audi -- constructor:" + (a + b));
		
		System.out.println(super.speed);
		//super keyword can be used with variables, accesses the value of the Car.speed variable
		//Can be used in the second statement onwards
		
		super.start();
		//super keyword can be used to call methods of the parent/super class, calls the start() of the Car class
		//Can be used in the second statement onwards
		
		//super keyword is used in the child classes to access the parent class properties
		
		//super.testing();
		//another way of calling testing() is using the classname.method() incase of static methods
		Car.testing();
	}
	
	//Can a parent class constructor be called from a child class method?
	//method
	public void billing() {
		//super(10); this is not allowed
		//a constructor can be called only from another constructor using super not from a method
		//method cannot call a constructor using super()
		
	}
}
