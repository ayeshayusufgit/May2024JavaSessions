package javasessions.class22.exceptionHandling;

public class Employee17 {

	String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");

		try {
			Employee17 e = new Employee17();
			e = null;
			e.name = "Naveen";// NPE

			int i = 9 / 0;// AE

			System.out.println("Hello");
			
			//Since the catch(Throwable ex) will be handling all the Exceptions resulting in the other catch blocks
			//as unreachable
			}
		catch(Throwable ex) { //grand parent exception class
			ex.printStackTrace();
		}
		catch (ArithmeticException ex) { //child exception classes
			System.out.println("AE is coming");
		} catch (NullPointerException ex) {//child exception classes
			System.out.println("NPE is coming");
		} catch (Exception ex) {//parent exception class
			ex.printStackTrace();
		}
		System.out.println("Bye");
	}
}
