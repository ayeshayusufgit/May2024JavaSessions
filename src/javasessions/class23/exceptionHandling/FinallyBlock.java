package javasessions.class23.exceptionHandling;

//8.
public class FinallyBlock {

	//whether an Exception comes or not the finally block will be executed
	//if there's no Exception then finally will be executed
	//if there's an Exception then finally will still be executed
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		System.out.println("A");
		try {
			int i=9/0;
			//int i=9/3;
		}catch(Exception ex) {
			System.out.println("AE is coming...");
		}
		finally {
			System.out.println("I am in finally block");
		}
		System.out.println("Bye");
	}
}
