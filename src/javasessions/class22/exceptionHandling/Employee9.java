package javasessions.class22.exceptionHandling;

public class Employee9 {

	String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");

		try {
			Employee9 e = new Employee9();
			e = null;
			e.name = "Naveen";

			int i=9/0;
			System.out.println("Hello");
		}
//		catch (ArithmeticException ex) {
//			System.out.println("Arithmetic Exception is coming");
//			ex.printStackTrace();
//		} catch (NullPointerException ex) {
//			System.out.println("Null Pointer Exception is coming");
//			ex.printStackTrace();
//		}
		System.out.println("Bye");
	}
}
