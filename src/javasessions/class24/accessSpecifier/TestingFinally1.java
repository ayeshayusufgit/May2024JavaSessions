package javasessions.class24.accessSpecifier;

//2.
public class TestingFinally1 {

	public static int getMarks(String studentName) {
		System.out.println("Getting Marks for: " + studentName);
		if (studentName.equalsIgnoreCase("Vibha")) {
			try {
				int i = 9 / 0;//When there is an Exception
				//int i=9/3;//When there is no Exception
			} catch (ArithmeticException ex) {
				System.out.println("AE is coming...");
				return 10;//if there is an Exception 10 will be returned
			}
			return 100;//if there is no Exception 100 will be returned

		} else if (studentName.equalsIgnoreCase("Monika")) {
			return 90;
		} else if (studentName.equalsIgnoreCase("Veena")) {
			return 80;
		} else {
			System.out.println("No student found...");
			return -1;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m1 = TestingFinally1.getMarks("Vibha");
		System.out.println(m1);

	}

}
