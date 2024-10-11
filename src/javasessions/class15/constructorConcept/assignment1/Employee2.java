package javasessions.class15.constructorConcept.assignment1;

//Class and Objects
//Assignment 3:
public class Employee2 {
	String name;
	int age;
	double salary;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//In the main method:
		//1.Create three Employee objects and initialize their properties with different values.
		//2.Print the details of each employee and the total salary of all employees.
		//3.Give a raise to one employee by increasing their salary, and update the total salary accordingly.
		//4.Create another Employee object with a different salary and update the total salary of all employees.
		//5.Print the details of the new employee and the updated total salary of all employees.
		
		double totalSalary=0.0;
		
		//1.
		Employee2 empObj1=new Employee2();
		empObj1.name="Ayesha";
		empObj1.age=25;
		empObj1.salary=50000;
		totalSalary+=empObj1.salary;
		
		Employee2 empObj2=new Employee2();
		empObj2.name="Abu";
		empObj2.age=35;
		empObj2.salary=55000;
		totalSalary+=empObj2.salary;
		
		Employee2 empObj3=new Employee2();
		empObj3.name="Ibu";
		empObj3.age=10;
		empObj3.salary=5000;
		totalSalary+=empObj3.salary;
		
		//2.
		System.out.println(empObj1.name+empObj1.age+empObj1.salary);
		//2
		System.out.println(empObj2.name+empObj2.age+empObj2.salary);
		//2
		System.out.println(empObj3.name+empObj3.age+empObj3.salary);
		//2
		System.out.println("Total Salary of All the employees:"+totalSalary);
		
		//3
		totalSalary=0.0;
		empObj1.salary=70000;
		totalSalary=empObj1.salary+empObj2.salary+empObj3.salary;
		System.out.println("Total Updated Salary of All the employees:"+totalSalary);
		
		//4
		Employee2 empObj4=new Employee2();
		empObj4.name="Ibu";
		empObj4.age=10;
		empObj4.salary=5000;
		totalSalary+=empObj4.salary;

		System.out.println("Total Salary of All the employees:"+totalSalary);

	}

}
