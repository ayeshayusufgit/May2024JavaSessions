package javasessions.class23.exceptionHandling;

//9.
public class FinallyBlock2 {

	// only a try wo a catch can be used with a finally block
	// only a catch block wo a try cannot be used with finally block
	// try-catch-finally block sequence
	// multiple finally blocks with a try block are not allowed
	// another catch block cannot come after the try-finally block
	// only a try block cannot come after a try-catch-finally block

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("A");
		System.out.println("A");

		try {
			// int i = 9 / 3;
			int i = 9 / 0;// An Exception is thrown but not handled and the finally block is executed

		} finally {
			System.out.println("In the finally block1");
		}

		try {
			int i = 9 / 3;
		}catch(ArithmeticException ex) {
			System.out.println("AE is coming");
		} 
	}
}
