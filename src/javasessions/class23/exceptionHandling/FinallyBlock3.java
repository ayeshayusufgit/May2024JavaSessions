package javasessions.class23.exceptionHandling;

//10.
public class FinallyBlock3 {

	//Interview Q - In which case will the finally block never be executed?
	//System.exit();
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("A");
		System.out.println("A");

		try {
			int i = 9 / 3;
			
			//A nested try-catch
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

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
