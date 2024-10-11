package javasessions.class22.exceptionHandling;

public class Employee18 {

	String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");

		try {
			Employee18 e = new Employee18();
			e = null;
			e.name = "Naveen";// NPE

			int i = 9 / 0;// AE

			System.out.println("Hello");

			//line number 17 is resulting in a NullPointerException which is not handled by the 
			//catch(Error ex) block
			//
			//Exception can be handled by the corresponding AE or NPE or Exception class or Throwable class
			//but not with Error class

		}catch(Error ex) {
			System.out.println("Some error is coming");
			ex.printStackTrace();
		}

//		catch (ArithmeticException ex) {
//			System.out.println("AE is coming");
//		} catch (NullPointerException ex) {
//			System.out.println("NPE is coming");
//		} catch (Exception ex) {
//			ex.printStackTrace();
//		} catch (Throwable ex) {
//			ex.printStackTrace();
//		}
		System.out.println("Bye");
	}
}
