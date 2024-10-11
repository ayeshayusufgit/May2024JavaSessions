package javasessions.class22.exceptionHandling;

public class Employee8 {

	String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");

		try {
			Employee8 e = new Employee8();
			e = null;
			e.name = "Naveen";

			int i=9/0;
			System.out.println("Hello");
			
		} catch (ArithmeticException ex) {
			System.out.println("Arithmetic Exception is coming");
			ex.printStackTrace();
		} catch (NullPointerException ex) {
			System.out.println("Null Pointer Exception is coming");
			ex.printStackTrace();
		}
		//There are 2 exceptions ie AE n NPE
		//The NPE is the first Exception which is generated
		//Immediately it will goto the catch block with the NPE and handle the Exception
		
		System.out.println("Bye");
	}
}
