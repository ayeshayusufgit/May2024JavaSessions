package javasessions.class12;

public class FunctionsInJava {

	//function gives the users reusablity
	//some input is given to the function and an output is returned, when the function is called
	//1)no input---->no return
	//2)no input---> return
	//3)input---->return
	//4)input---->no return
	
	//functions are independent to one another
	//functions are parallel to each other
	//Can a function be created inside another function? --- strictly no
	//Can a function be called from another function? --- yes
	
	//class data members
		//1.class variables:can be static n non static
		//class methods/functions:can be static n non static
	
	//1.no input and no return
	//void is a return type which returns nothing
	//this function is performing an action but not returning anything
	//THis is used if the information has to be displayed etc 
	public void test() {//0 parameters
		System.out.println("test method");
	}
	
	public void calc() {//0 parameters(No parameters)
		System.out.println("calc method");
		//Function variables are always local variables
		int a=10;
		int b=20;
		int c=2;
		System.out.println(c);//0 return(No return type)	
	}
	
	//2.No input but some return
	//return type:integer
	public int getNumber() {//0 parameters
		System.out.println("get number");
		int fee=100;
		int tax=20;
		int totalTax=fee+tax;
		return totalTax;//return integer	
	}
	
	public String getTrainer() {
		System.out.println("get trainer name");
		return "Naveen";
		//1 function can return only 1 value at a time
	}
	
	public boolean isUserActive() {
		System.out.println("Checking user status");
		return true;
	}
	
	//3.Some input and no return
	public void add(int a,int b) {//2 parameter
		//variables at the method level are called parameters(like "a" n "b")
		int sum=a+b;
		System.out.println(sum);
	}
	
	
	//4.Some inputs and then return:
	public int addition(int a,int b) {
		System.out.println("Adding 2 numbers");
		int sum=a+b;
		return sum;
	}
	
	//The program cannot be executed wo the main
	//The main is the starting point of the execution of the program
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//To access non static methods
			//1.create an object of the class and call the method by using the obj ref.function()
		FunctionsInJava obj=new FunctionsInJava();
		
		obj.test();
		obj.calc();
	   //System.out.println(obj.getNumber());This is not a good practice by calling the method n displaying the result

	   //whenever a function is being called n its returning some value it should be stored in a variable
	   //depending on the return type, the corresponding values should be held in the variable of the same datatype
		
		int t=obj.getNumber(); 
		//The advantage of storing it in a variable is that the variable "t" can be used in multiple occasions
		
		System.out.println(t);
		
	 
		String tr=obj.getTrainer();
		System.out.println(tr);
		
		boolean flag=obj.isUserActive();//Whatever the RHS is returning the variable type should be the same
		System.out.println(flag);
		
		if(flag) {
			System.out.println("Login to app");
		}
		
		obj.add(10, 20);//10 will be given to "a" and 20 will be given to "b"
		//the value passed ie 10 n 20 from the method add is called arguments
		
		//click() is the best example for a function which takes in a argument and performs an action
		//and doesnt return anything
		
		int p=obj.addition(10, 20);
		System.out.println(p);
		//The advantage of this is that any 2 numbers can be passed to addition method, 
		//the addition is performed and returned back
		//addition can be performed with different set of values, its reusable
			
		
		int p1=obj.addition(30, 40);
		System.out.println(p1);
		
		
		
		
	}

}
