package javasessions.class22.exceptionHandling;

public class Employee2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		try {
			int i=9/0; //A/E
			
			//These lines of code wont be executed
			System.out.println("Hello");
			System.out.println("Hello");
			System.out.println("Hello");
			System.out.println("Hello");
			System.out.println("Hello");
		}catch(ArithmeticException ex) {
			System.out.println("Arithmetic Exception is coming");
			ex.printStackTrace();
		}
		System.out.println("Bye");
	}
}
