package javasessions.class22.exceptionHandling;

public class Employee15 {

	String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");

		try {
			Employee15 e = new Employee15();
			e = null;
			e.name = "Naveen";// NPE

			int i = 9 / 0;// AE

			System.out.println("Hello");
			
			//A NPE is generated in line number 17, immediately a check is made from the 1st catch block
			//to see if it can handle the NPE but no(as it is handling AE), then a check is made in the 
			//2nd catch(Arithmetic ex) block and yes it can handle the NPE, 
			//the last catch(Exception e) block wont be reached
			
			//The right practice is to handle the exceptions with the catch block handling the specific exceptions
		}
		catch (ArithmeticException ex) {
			System.out.println("AE is coming");
		} catch (NullPointerException ex) {
			System.out.println("NPE is coming");
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		System.out.println("Bye");
	}
}
