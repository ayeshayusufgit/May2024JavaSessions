package javasessions.class22.exceptionHandling;

public class NumberTest2 {
	
	public static int div(int a,int b) {
		try {
			int c=a/b;
			return c;
		}catch(ArithmeticException ex) {
			System.out.println("Some Exception");
			return -1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//The div() will only work for specific numbers, the moment the 0 is passed it results in an Exception
		//This code has to be written with Exception Handling
		//This Exception cannot be fixed but atleast this Exception can be handled
		//So that the program is not terminated
		
		System.out.println(div(4, 2));//o/p=>2
		System.out.println(div(4, 0));//o/p=>-1	
		
		System.out.println("Print the marksheet!!!");//o/p=>Print the marsheet!!!
		
		
		
		
	}

}
