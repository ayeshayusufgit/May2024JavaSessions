package javasessions.class22.exceptionHandling;

public class Employee3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		try {
			int i=9/3; //This line doesn't result in an exception
			
			//The below lines will continue executing
			System.out.println("Hello");
			System.out.println("Hello");
			System.out.println("Hello");
			System.out.println("Hello");
			System.out.println("Hello");
			
			//It will not goto the catch block
			//catch block will be executed only when there is an exception
			
		}catch(ArithmeticException ex) {
			System.out.println("Arithmetic Exception is coming");
			ex.printStackTrace();
		}
		System.out.println("Bye");
	}
}
