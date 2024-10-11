package javasessions.class24.accessSpecifier;

//6.
public class TestingFinally5 {
//Interview Question
	
	public static int getMarks(String studentName) {
		System.out.println("Getting Marks for: " + studentName);

		if (studentName.equalsIgnoreCase("Vibha")) {

			try {

				//int i = 9 / 0;

				int i = 9 / 3;

				
				//There are 2 stages of shutdown 0 or 1
	
				//System.exit(1);//1.Complete shutdown: All the libraries an resources will be shutdown 
				
				System.exit(0);//2.Partial shutdown:
				
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

		
		int m1 = TestingFinally5.getMarks("Vibha");
															
		System.out.println(m1);
		
	}
}
