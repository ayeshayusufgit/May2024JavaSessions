package javasessions.class24.accessSpecifier;

//3.
public class TestingFinally2 {

	public static int getMarks(String studentName) {
		System.out.println("Getting Marks for: " + studentName);
		
		if (studentName.equalsIgnoreCase("Vibha")) {
			try {
				
				int i = 9 / 0; //When there is an Exception it goes to the catch block
				//int i = 9 / 3; //When there is no Exception it goes directly to the finally block
				return 30;
				
			} catch (ArithmeticException ex) {//The Exception gets handled in the catch block
				
				System.out.println("AE is coming...");
				return 10; 
				//but since there is a return in the finally block the return value gets overridden with 80
				
			}finally {	//Whether an exception comes or not the finally block will be executed 
					  	//preference will be given to the finally return
				
				System.out.println("Bye!!!");
				return 80;
				
			}
			//return 50; unreachable code, results in an Error
			
		} else if (studentName.equalsIgnoreCase("Monika")) {
			return 90;
			
		} else if (studentName.equalsIgnoreCase("Veena")) {
			return 40;
			
		} else {
			System.out.println("No student found...");
			return -1;
			
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int m1 = TestingFinally2.getMarks("Vibha");
		//int m1 = TestingFinally2.getMarks("Veena");
		int m1 = TestingFinally2.getMarks("Naveen");
		System.out.println(m1);

	}

}
