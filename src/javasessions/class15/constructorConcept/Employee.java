package javasessions.class15.constructorConcept;

//Program 6
public class Employee {
	String name;
	int age;
	double salary;
	char gender;
	String dob;
	boolean isPerm;
	
	//Can this be a constructor?
	//No as this is a method having a return type, the function name should not be the name of the class
	//Not a good practice
	public void Employee() {
		
	}
	
	//This kind of function name should be used
	public void empSearch() {
		
	}
	
	//Once an object is created its properties have to be initialized using the constructor
	//THe business logic can only be there in the function
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1=new Employee();
		e1.name="Tom";
		e1.age=20;
		e1.salary=12.33;
		
		Employee e2=new Employee();
		e2.name="Tom";
		e2.age=20;
		e2.salary=12.33;
		
		Employee e3=new Employee();
		e3.name="Tom";
		e3.age=20;
		e3.salary=12.33;
		
		Employee e4=new Employee();
		e4.name="Tom";
		e4.age=20;
		e4.salary=12.33;
		
		Employee e5=new Employee();
		e5.name="Tom";
		e5.age=20;
		e5.salary=12.33;
		
		//There are necessary objects getting created in the heap memory, which are not being used
		//Its a bad practice
		//The Garbage collector wont be destroying these objects as its still having a reference
		//GC will be destroying objects that have no reference or null reference
	
	
		//blank objects are getting created
		Employee e6=new Employee();
		Employee e7=new Employee();
		Employee e8=new Employee();
		Employee e9=new Employee();
		Employee e10=new Employee();
		
		
		
	}

}
