package javasessions.class22.exceptionHandling;

public class Employee12 {

	String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");

		try {
			Employee12 e = new Employee12();
			/// e = null;
			e.name = "Naveen";// NPE

			int i = 9 / 0;// AE

			// The best practice is try with multiple catch blocks
			//The code is more readable with multiple catch blocks
			//if a logic is giving 2-3 exceptions then its better to handle with multiple catch blocks

			System.out.println("Hello");
		}
//		catch(Exception ex) {
//			ex.printStackTrace();
//		}
		catch (ArithmeticException ex) {
			System.out.println("AE is coming");
		} catch (NullPointerException ex) {
			System.out.println("NPE is coming");
		}
		System.out.println("Bye");
	}
}
