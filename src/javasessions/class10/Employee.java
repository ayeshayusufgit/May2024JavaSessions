package javasessions.class10;

public class Employee {
	
	//class:category/template/blueprint
	
	//Car comes from the Vehicle category
	//Honda, BMW, Audi etc are all Cars
	
	//Electronics
	//Furniture
	//etc are Categories
	
	//All the students are from the Student class
	//All the employees are from the Employee class

	//When an objects are created of a class the objects are blueprint of the class
	//Object:physical entity
	
	
	//class/instance/template variables or global variables
	//scope of the class variables is that it can be used anywhere in the class
	String name;
	int age;
	double salary;
	boolean isPerm;
	char gender;
	//Java will check how many template/class variables are there, a photocopy of that will be created 
	//and given to the object which is created
	static public int id=1;
	
	Department dept;
	//A class can be added as a class variable this is called composition
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int i=0;//local variable
		//when a variable is created in a specific block(if block or method block etc)
		//it can only be used within that block
		
		//new Employee();//this is the object which is the instance of the class
		//Employee: is a class
		//new: is a keyword used to create the object
		//obj: is the reference name pointing to the object which has been created
		
		
		//create the object: using new keyword
		Employee obj=new Employee();
		//obj is the object reference name
		//In the RHS the object Employee is created
	
		//None of the class variables are initialized
		System.out.println(obj.name);
		//since there is no value assigned to the "name" class variable 
		//it will be initialized to the default value of String ie null
		
		System.out.println(obj.age);
		//since there is no value assigned to the "age" class variable 
		//it will be initialized to the default value of int ie 0
		
		System.out.println(obj.salary);
		//since there is no value assigned to the "salary" class variable 
		//it will be initialized to the default value of double ie 0.0
		
		System.out.println(obj.isPerm);
		//since there is no value assigned to the "isPerm" class variable 
		//it will be initialized to the default value of boolean ie false
		
		System.out.println(obj.gender);
		//since there is no value assigned to the "gender" class variable 
		//it will be initialized to the default value of char ie space
		
		System.out.println("---------------------------------------");
		//class/instance/template variables getting initialized
		//All the class variables are initialized
		obj.name="Pooja";
		obj.age=30;
		obj.salary=90;
		obj.isPerm=true;
		obj.gender='f';
		
		System.out.println(obj.name);
		System.out.println(obj.age);//the memory size will be 4 bytes
		System.out.println(obj.salary);
		System.out.println(obj.isPerm);
		System.out.println(obj.gender);
		
		//There are no limitations to the number of objects that can be created
		//Some of the class variables are initialized
		Employee e1=new Employee();
		e1.name="Ravi";
		e1.age=35;
		
		//only the declared values(name,age) are being displayed an the rest are showing their default values
		System.out.println(e1.name+" "+e1.age+" "+e1.isPerm+" "+e1.salary+" "+e1.gender);
		 
		e1.salary=60.22;
		//HR has updated his salary, so the updated value will be displayed
		System.out.println(e1.name+" "+e1.age+" "+e1.isPerm+" "+e1.salary+" "+e1.gender);

		//No reference objects
		//Its a bad practice to create an object wo a reference and to initialize each field a new object has to be created
		//Unecessary new objects are being created
		
		new Employee().name="Tom";//These can't be printed as these require a reference but values can be assigned to it
		new Employee().age=45;
		
		//An existing reference name cannot be used again
		//Employee e1=new Employee();
		
		Employee t1=new Employee();
		t1=null;
		//t1.name=null;
		//t1.name="Naveen";//NPE
		//System.out.println(t1.name);
		
		//There are many objects that are created in the heap such that 198 mb is filled
		//Either java crashes or OutOfMemoryError is thrown or the Performance of the application 
		//becomes very slow etc
		//There is a mechanism in the Java called the garbage collector will be activated
		//The memory allocation or deallocation in Java is done automatically
		//JVM will be monitoring the size of the heap memory and if there is very less space left
		//JVM will instruct the Garbage Collector to goto the Heap and start destroying the objects 
		//that have no reference or null reference, nothing will be done to the objects having a reference
		//Garbage Collector will only be deallocating the memory in the heap
		//The JVM asks the GC which inturn starts identifying the objects and starts deallocating the memory
		//GC doesn't start doing things on its own but waits for the instruction from the JVM
		
		//To programmatically call the GC 
		System.gc();//There is no guarantee that the GC will be called or activated
		//The GC is dependent on the JVM 
		//The deallocation of the stack memory is not done by the GC
		
		//Once 120 objects are destroyed then the memory will be deallocated and  memory will be restored again
		
		Employee p1;//local variable
		p1=new Employee();
		
		String s=null;
		System.out.println(s.equals("Naveen"));//NPE
		
		//Once the class will be executed/compiled the class will be given to the class loader
		//All the classes along with it class variables will be loaded in the Class Loader
		//Then the execution will start from the main()
		//The objects/class variables within the main() will be created
		
		
	}
	
	
}
