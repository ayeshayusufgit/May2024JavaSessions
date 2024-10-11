package javasessions.class16.encapsulationConcept;

//1.

//Can a class be private?
//A class can never be private

public class Employee {

	//Encapsulation means hiding/protecting the data members(class variables)
	//via private keyword and giving the access via public layer(class methods) 
	
	private String name;
	private int age;
	private double salary;
	private boolean isPerm;
	static String company="IBM";
	
	//public constructor is behaving like a setter
	
	//Uses of a constructor:
	//Unnecessary objects are not created
	//The very first time when the object is created the values are set by the constructor
	public Employee(String name, int age, double salary, boolean isPerm) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.isPerm = isPerm;
		//Can a static variable be accessible in a constructor?
		//Yes it can.
		System.out.println(Employee.company="DELL");
	}

	//public methods: getter/setter
	//For every private variable a getter n setter has to be created
	//Internally the getter is returning the value and setter is setting the value
	
	public String getName() {
		return name;
	}

	
	//Are setter mandatory?
	//The constructor( is setting the values of variables) behaves like a setter thus a setter is not mandatory
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public boolean isPerm() {
		return isPerm;
	}

	public void setPerm(boolean isPerm) {
		this.isPerm = isPerm;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Employee obj=new Employee();
//		obj.name="Naveen";//within the class the "name" field can be accessed

	}
}
