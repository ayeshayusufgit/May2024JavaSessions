package javasessions.class24.accessSpecifier;

//4.
public class TestingFinally3 {

	public static int getMarks(String studentName) {
		System.out.println("Getting Marks for: " + studentName);
		
		if (studentName.equalsIgnoreCase("Vibha")) {
			
			try {
				
				int i = 9 / 0;	//when there is an exception it'll goto the catch block and then finally 
								//the return value will be overridden by 80 
				
				//int i = 9 / 3;	//when there is no exception then the program will terminate immediately  
				
				System.exit(1);//Shutting the JVM, only then the finally block wont be executed
							   //Terminate the program immediately	
				return 30;
				
			} catch (ArithmeticException ex) {
				
				System.out.println("AE is coming...");
				return 10;
				
			}finally {
			
				System.out.println("Bye!!!");
				return 80;	
			}
			
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

		int m1 = TestingFinally3.getMarks("Vibha");
		//O/p=>Getting Marks for: Vibha , when there is no Exception 
		//O/p=>Getting Marks for: Vibha , when there is an Exception
			 //AE is coming...
			 //Bye!!!
			 //80
		
		//int m1 = TestingFinally2.getMarks("Veena");
		//int m1 = TestingFinally3.getMarks("Naveen");
		System.out.println(m1);
	}
}
