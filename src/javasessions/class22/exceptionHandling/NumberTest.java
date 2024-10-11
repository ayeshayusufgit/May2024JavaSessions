package javasessions.class22.exceptionHandling;

public class NumberTest {
	
	public static int div(int a,int b) {
		int c=a/b;
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//in what cases will there be an exception in the div method?
		
		
		//System.out.println(div(4, 2));//=>Print the marksheet!!! is printed
		System.out.println(div(4, 0));//=> line 6 results in a ArithmeticException
									  //=> and the program will be terminated
									  //The marksheet wont be printed because of the Exception	
		
		System.out.println("Print the marksheet!!!");
		
		
		
		
	}

}
