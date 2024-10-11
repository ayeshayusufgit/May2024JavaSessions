package javasessions.class22.exceptionHandling;

public class Employee11 {

	String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");

		try {
			Employee11 e = new Employee11();
			/// e = null;
			e.name = "Naveen";// NPE

			int i = 9 / 0;// AE

			
			//Throwable is the superclass of Exception class coming from java.lang package
			//Throwable will be able to handle both the Exceptions
			//As Throwable is the grandparent of AE n NPE class
			
			
			//This is not a good practice as we don't know which Exception is resulting wo running the code
			
			System.out.println("Hello");
		}
		catch(Throwable ex) {
			ex.printStackTrace();
		}
//		catch (ArithmeticException ex) {
//			System.out.println("AE is coming");
//		} catch (NullPointerException ex) {
//			System.out.println("NPE is coming");
//		}
		System.out.println("Bye");
	}
}
