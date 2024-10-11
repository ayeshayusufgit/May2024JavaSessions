package javasessions.class15.constructorConcept.assignment1;

//Class and Objects
//Assignment 3:
public class Employee {
	String name;
	int age;
	double salary;
	static double totalSalary;
	
	

	public Employee(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		totalSalary+=salary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//In the main method:
		//1.Create three Employee objects and initialize their properties with different values.
		//2.Print the details of each employee and the total salary of all employees.
		//3.Give a raise to one employee by increasing their salary, and update the total salary accordingly.
		//4.Create another Employee object with a different salary and update the total salary of all employees.
		//5.Print the details of the new employee and the updated total salary of all employees.
		
		//1.
		Employee empObj1=new Employee("Ayesha", 25, 50000);
		Employee empObj2=new Employee("Abu", 35, 55000);
		Employee empObj3=new Employee("Ibu", 10, 5000);
		//2.
		System.out.println(empObj1.name+empObj1.age+empObj1.salary);
		//2
		System.out.println(empObj2.name+empObj2.age+empObj2.salary);
		//2
		System.out.println(empObj3.name+empObj3.age+empObj3.salary);
		//2
		System.out.println("Total Salary of All the employees:"+totalSalary);
		//3
		empObj1.salary=70000;
		System.out.println("Total Salary of All the employees:"+(empObj1.salary+empObj2.salary+empObj3.salary));
		
		//4
		Employee empObj4=new Employee("Pushpa", 15, 5100);
		System.out.println(empObj4.name+empObj4.age+empObj4.salary);
		System.out.println("Total Salary of All the employees:"+(empObj1.salary+empObj2.salary+empObj3.salary+empObj4.salary));

	}

}
