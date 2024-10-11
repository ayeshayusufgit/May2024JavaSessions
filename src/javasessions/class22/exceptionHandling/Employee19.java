package javasessions.class22.exceptionHandling;

public class Employee19 {

	String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");

		try {
			Employee19 e = new Employee19();
			e = null;
			e.name = "Naveen";// NPE

			int i = 9 / 0;// AE

			System.out.println("Hello");

			// A good practice is to write multiple catch blocks with the respective exceptions
			// so that its easy to debug the code

		}

		catch (ArithmeticException ex) {
			System.out.println("AE is coming");
		} catch (NullPointerException ex) {
			System.out.println("NPE is coming");
//		} catch (Exception ex) {
//			ex.printStackTrace();
//		} catch (Throwable ex) {
//			ex.printStackTrace();
//		}
		System.out.println("Bye");
	}
}
