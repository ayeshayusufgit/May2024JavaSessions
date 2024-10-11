package javasessions.class15.constructorConcept;

//Program 7
public class Employee2 {
	String name;
	int age;
	double salary;
	char gender;
	String dob;
	boolean isPerm;
	
	//Constructor
	//The constructor name will be the same name as the class name
	//It looks like a function but its not a function
	//A constructor cannot return anything, not even void(there is no return type) 
	//Avoid business logic in the constructor
	//Constructors are used to initialize class(instance) variables
	//The access specifier of the constructor can be public, protected and private
	//Constructor can be overloaded
	//The Constructor will be called automatically once the object of the class is created
	public Employee2() {//0 param const...default constructor
		System.out.println("Default Constructor");
	}
	
	public Employee2(int a) {//0 param const...default constructor
		System.out.println("1 Param Constructor(int):"+a);
	}
	
	public Employee2(double a) {//0 param const...default constructor
		System.out.println("1 Param Constructor(double):"+a);
	}

	//Can a constructor be static?
	//No a constructor cannot be static
	/*public static Employee2(String name,int age) {
		
	}*/
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee2 e1=new Employee2();//Compiler calls the default constructor
		
		Employee2 e2=new Employee2(10);//Compiler calls the 1 parameter(int) constructor
		
		Employee2 e3=new Employee2(10.12);//Compiler calls the 1 parameter(float) constructor
		
	}

}
