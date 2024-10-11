package javasessions.class22.exceptionHandling;

public class Employee6 {

	String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");

		try {
			Employee6 e = new Employee6();
			//e = null;
			e.name = "Naveen";

			int i=9/3;
			System.out.println("Hello");
			
		} catch (ArithmeticException ex) {
			System.out.println("Arithmetic Exception is coming");
			ex.printStackTrace();
		} catch (NullPointerException ex) {
			System.out.println("Null Pointer Exception is coming");
			ex.printStackTrace();
		}
		//None of the catch blocks will be executed as there is no Exception
		
		System.out.println("Bye");
	}
}
