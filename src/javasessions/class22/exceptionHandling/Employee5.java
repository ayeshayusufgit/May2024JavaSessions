package javasessions.class22.exceptionHandling;

public class Employee5 {

	String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");

		try {
			Employee5 e = new Employee5();
			e = null;
			e.name = "Naveen";//result in a NPE which gets handled by the catch block with the NPE

			int i=9/3;
			
			System.out.println("Hello");
		} catch (ArithmeticException ex) {
			System.out.println("Arithmetic Exception is coming");
			ex.printStackTrace();
		} catch (NullPointerException ex) {
			System.out.println("Null Pointer Exception is coming");
			ex.printStackTrace();
		}
		System.out.println("Bye");
	}
}
