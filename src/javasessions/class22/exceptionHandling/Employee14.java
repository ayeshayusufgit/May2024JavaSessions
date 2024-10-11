package javasessions.class22.exceptionHandling;

public class Employee14 {

	String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");

		try {
			Employee14 e = new Employee14();
			/// e = null;
			e.name = "Naveen";// NPE

			int i = 9 / 0;// AE

			System.out.println("Hello");
		}
		catch(Exception ex) { 
			ex.printStackTrace();
		}
		
		//It makes no sense to have the catch blocks with AE and NPE after catch Exception block 
		//as the Exception block is already handling the AE n NPE resulting in unreachable code
		
		catch (ArithmeticException ex) {
			System.out.println("AE is coming");
		} catch (NullPointerException ex) {
			System.out.println("NPE is coming");
		}
		System.out.println("Bye");
	}
}
