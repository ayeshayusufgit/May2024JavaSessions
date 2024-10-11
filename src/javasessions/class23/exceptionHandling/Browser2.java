package javasessions.class23.exceptionHandling;

//3.
public class Browser2 {

	//Amazon App
	public void search() {
		//Since the Exception is already handled in the cart(), so it need not be handled in search()
		//thus throws is not required here
		
		System.out.println("search method");
		cart();	//Incase cart() doesn't not handle it then search() has to handle the Exception
				//But main() is like the customer, the Exception shouldnt be handled there
	}
	
	//Amazon App
	public void cart() { 
		//this method is using the bankPayment() so the Exception has to be handled in cart()
		//Some meaningful message is shown to the user
		//thus the cart() shouldn't use throws 
		
		System.out.println("cart method");
		try {
		bankPayment();
		}catch(ArithmeticException ex) {
			ex.printStackTrace();
			System.out.println("Some AE is coming...");
		}
	}
		
	//HDFC bank application:3rd party
	//this method is throwing an ArithmeticException and its not handling it due to shortage of time
	
	public void bankPayment() throws ArithmeticException {
		System.out.println("bankPayment method");
		int i=9/0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser2 br=new Browser2();
		br.search();
		
		System.out.println("Bye");
	}
}
