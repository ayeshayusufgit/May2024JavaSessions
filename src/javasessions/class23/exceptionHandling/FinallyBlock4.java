package javasessions.class23.exceptionHandling;

//11.
public class FinallyBlock4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("A");
		System.out.println("A");

		try {
			
			//int i = 9 / 3;No exception coming
			int i = 9 / 0;//Exception is coming but its not getting caught(handled)
			
		} finally {
			System.out.println("In the finally block");
		}
		
		System.out.println("Bye");//Bye will not get printed as the Exception is not caught(handled)
	}
}

//This comes from the JVM
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//at NaveenMay2024JavaSessions/javasessions.class223exceptionHandling.FinallyBlock4.main(FinallyBlock4.java:15)

//In the catch clause, Throwable, Exception, Error and all the Classes under it can be added 
//The actual Exception hierarchy starts after Throwable and not from Object
//Every class in java has parent Object but Object class does not have capabilities to handle Exceptions
//