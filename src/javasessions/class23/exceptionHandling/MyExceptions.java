package javasessions.class23.exceptionHandling;

//6.
public class MyExceptions extends RuntimeException{

	public MyExceptions(String message) {
		super(message);
		//supply this message to the RuntimeException Constructor
		//RuntimeException is responsible for taking the message and printing the message on the Console
		
	}
}
