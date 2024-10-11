package javasessions.class15.constructorConcept;

//Program 7
public class Employee3 {
	String name;
	int age;
	double salary;
	char gender;
	String dob;
	boolean isPerm;
	
	//Interview Question
	//if I have a static variable can i use it in the constructor?
	static final String companyName="IBM";//now the company name cannot be changed as its final
	
	static int w;
	//Constructors helps to restrict object creation
	//Constructors are used to initialize the class(instance) variables with the help of local variables using this keyword
	
	
	//Unnecessary Objects will be created, thus its best to avoid default constructors
//	public Employee3() {
//		//default constructor
//	}
	
//	public Employee3() {//0 param const...default constructor
//		System.out.println("Default Constructor");
//	}
//	
//	public Employee3(int a) {//0 param const...default constructor
//		System.out.println("1 Param Constructor(int):"+a);
//	}
//	
//	public Employee3(double a) {//0 param const...default constructor
//		System.out.println("1 Param Constructor(double):"+a);
//	}
	
//	public Employee3(String name,int age) {
//		//name n age are local variables, it will be assigned with Priya and 20 but the 
//		//but will not initialize the instance variables thus giving null n 0 as the o/p 
//	}
	
	
//	public Employee3(String name,int age) {//o/p=> null 0
//		name=name;//the local variable name is assigned to name and since its scope is only within the constructor, the default value of null an 0 are picked up
//		age=age;
//	}
	
	//1. way of assigning the global(class/instance) variables to the local variables(passed during object creation)
	//But not the write way
//	public Employee3(String name1,int age1) {//o/p=>Priya 30
//		name=name1;//name1,age1 is the local variable assigned to the instance/class variable
//		age=age1;
//	}
	
	//2. way of assigning the global(class/instance) variables to the local variables(passed during object creation)
	//using the this keyword
	public Employee3(String name,int age) {//o/p=>Priya 30
			//this.Global=Local;
		
		    this.name=name;//this keyword refers to the global variable
		    			   //the global n local names should be the same	
			this.age=age;
			System.out.println(Employee3.companyName);
			//Yes a static variable companyName can be used in the constructor
			//By using the Classname.variableName
			
			//Employee3.w=4;//initializing value to a static variable in a constructor
	}
	
	//overloading the constructor, depending on the required values that have been passed during object creation
	public Employee3(String name,int age,double salary, char gender) {
	    this.name=name;	
		this.age=age;
		this.salary=salary;
		this.gender=gender;
	}
	
	public Employee3(String name, int age, char gender, String dob) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.dob = dob;
	}

	public Employee3(String name, int age, double salary, char gender, String dob, boolean isPerm) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.gender = gender;
		this.dob = dob;
		this.isPerm = isPerm;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Employee3 e1=new Employee3();//Unnecessary objects are created
		Employee3 e1=new Employee3("Priya",30);//Objects can be created only when name "Priya" and age 30 is passed
		System.out.println(e1.name+" "+e1.age);
		System.out.println(e1.name+" "+e1.age+" "+e1.salary+" "+e1.dob+" "+e1.isPerm);//o/p=>Priya 30 0.0 null false
		//Priya 30.0 are values which have be assigned during object creation
		//null false are the default values of the unassigned class/instance/global variables
		
		//Constructors help to construct the objects properly,by supplying the data properly
		//Unnecessary object creation is restricted
		//Any combination of constructor can be created
		
		e1.salary=23.44;//Priya's salary got updated
		System.out.println(e1.name+" "+e1.age+" "+e1.salary+" "+e1.dob+" "+e1.isPerm+" "+e1.gender+" "+Employee3.w);
		//Printing the updated values
		
		
		Employee3 e2=new Employee3("Devesh", 25,30.66,'m');
		System.out.println(e2.name+" "+e2.age+" "+e2.salary+" "+e2.dob+" "+e2.isPerm+" "+e2.gender);
		
		
		Employee3 e3=new Employee3("Naveen", 25,12.33,'m',"01-01-2000",true);
		System.out.println(e3.name+" "+e3.age+" "+e3.salary+" "+e3.dob+" "+e3.isPerm+" "+e3.gender);
		
		
		
		
 		
		
		
		
		
	}

}
