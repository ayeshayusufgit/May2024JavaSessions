package javasessions.class23.exceptionHandling;

//2.
public class Browser {

	//Since m2() is called by m1() so its m1() responsibility to handle the ArithmeticException
	//m1() is also not handling the ArithmeticException and its throwing it to the main()
	public void m1() {
		System.out.println("m1 method");
		m2();
	}
	
	//Since m3() is getting called by m2() so its the responsibility of m2() to handle the ArithmeticException
	//m2() is also not handling the ArithmeticException and its throwing it to m1() 
	public void m2() {
		System.out.println("m2 method");
		m3();
	}
	
	//Since m3() is throwing this exception
	//Ideally its the responsibility of m3() to handle it
	//m3() is not handling it so its throwing the ArithmeticException to m2()
	
	public void m3() throws ArithmeticException {
		System.out.println("m3 method");
		int i=9/0;
	}
	
	//The Exception has to be handled by using the try-catch block
	//main() is calling m1(), so its the main()'s responsibility to handle it
	//The main() is also not handling the ArithmeticException and its thrown to the JVM to handle it
	//JVM is calling the main() 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser br=new Browser();
		br.m1();
		
		System.out.println("Bye");//Bye wont be printed, this means JVM is not handling the Exception
		
		//throws keyword is not handling the Exception
		//try-catch block only handled the Exceptions
		
		//the main() should never handle the Exceptions
		
		//

	}

}
