package javasessions.class22.exceptionHandling;

public class Employee13 {

	String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");

		try {
			Employee13 e = new Employee13();
			/// e = null;
			e.name = "Naveen";// NPE

			int i = 9 / 0;// AE

			System.out.println("Hello");
		}
		catch(Object ex) { //No exception of type Object can be thrown; an exception type must be a subclass of Throwable
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
