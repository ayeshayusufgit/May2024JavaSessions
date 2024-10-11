package javasessions.class24.accessSpecifier;

//5.
public class TestingFinally4 {

	public static int getMarks(String studentName) {
		System.out.println("Getting Marks for: " + studentName);

		if (studentName.equalsIgnoreCase("Vibha")) {

			try {

				int i = 9 / 0;

				// int i = 9 / 3;

				System.exit(1);
				return 30;

			} catch (ArithmeticException ex) {

				System.out.println("AE is coming...");
				return 10;

			} finally {

				System.out.println("Bye!!!");
				return 80;
			}

		} else if (studentName.equalsIgnoreCase("Monika")) {
			return 90;

		} else if (studentName.equalsIgnoreCase("Veena")) {
			return 40;

		} else {
			System.out.println("No student found...");
			try {
				int p = 9 / 0;
			} finally {
				return 5;
			}
		
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int m1 = TestingFinally4.getMarks("Naveen");
		//The Exception wont get printed on the Console as there is no catch block to handle it
															
		System.out.println(m1);
		
		/* o/p=>
		Getting Marks for: Naveen
		No student found...
		5
		*/
	}
}
