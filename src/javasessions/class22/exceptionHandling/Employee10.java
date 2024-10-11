package javasessions.class22.exceptionHandling;

public class Employee10 {

	String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");

		try {
			Employee10 e = new Employee10();
			///e = null;
			e.name = "Naveen";//NPE

			int i=9/0;//AE
			
			//NPE n AE are the child of Exception class and can be handled by the catch(Exception ex){ } block
			//Any exception can be handled with a single catch block
			//The best practice is try with multiple catch blocks
			
			System.out.println("Hello");
		}catch(Exception ex) {
			ex.printStackTrace();
		}

		System.out.println("Bye");
	}
}
