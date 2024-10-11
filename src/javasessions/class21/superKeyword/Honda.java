package javasessions.class21.superKeyword;

//5.
public class Honda extends Car {

	public Honda() {//first it will goto Car(Parent) class default constructor
		this(10);
		//this keyword is calling the same class constructor
		//whenever 1 constructor is called from another then this() keyword also has to be the first statement
		//super(10);//this is not allowed or vice versa
		
		System.out.println("Honda -- default constructor");
		//this(); this gives an error, this n super should be the first statement
	}

	public Honda(int a) {
		this(10,20);
		//this(10); this is not allowed as recursion is not allowed in constructors, its applicable only for methods
		System.out.println("Honda -- constructor:" + a);
	}

	public Honda(int a, int b) {
		System.out.println("Honda -- constructor:" + (a + b));
	}
}
