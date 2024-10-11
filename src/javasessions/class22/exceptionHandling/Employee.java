package javasessions.class22.exceptionHandling;

public class Employee {

	//What is exception?
	//Some unwanted code or condition resulted in termination of my program(unable to proceed) 
	//this is called Exception or Error 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println("A");
//		System.out.println("A");
//		System.out.println("A");
//		
//		int i=9/0; //The program is terminated in this line
//		//This line has resulted in an exception and its ok to get one but it needs to be handled
//		
//		System.out.println("Bye");
		
		
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		try {
			int i=9/0;//AE	
					  //The line causing the Exception should be surrounded by the try block
					  //The Exception is thrown by the try block which needs to be caught by the catch block
			
		}catch(ArithmeticException ex) {
			System.out.println("Arithmetic Exception is coming");
			ex.printStackTrace();//will print the stacktrace
		}
		System.out.println("Bye");
		
		//try-catch block should always be together
		//only try or only catch block will result in Error
		
		//The Exception which is generated will be caught by the catch block and the program will not be terminated
		
	}
}
