package javasessions.class23.exceptionHandling;

//4.
public class Browser3 {

	//Amazon App
	public void search() {
		
		System.out.println("search method");
		cart();
	}
	
	//Amazon App
	//throws keyword need not be written in the cart() as the Exception is already being handled in the cart()
	
	public void cart() { 
		System.out.println("cart method");
		try {
		bankPayment();
		}catch(ArithmeticException ex) {
			ex.printStackTrace();
			System.out.println("Some AE is coming...");
		}
	}
	
	//This method still throws the Exception, but throws is an identifier to indicate that this method may 
	//throw n Exception and needs to be handled in the calling method like cart()
	
	public void bankPayment() throws ArithmeticException{
		System.out.println("bankPayment method");
		int i=9/0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser3 br=new Browser3();
		br.search();
		
		System.out.println("Bye");
	}
}
