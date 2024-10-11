package javasessions.class22.builderPattern;

public class Application {
	
	public Application login() {
		System.out.println("Login to App");
		//return new Application(); a new object gets created wo a reference which is eligible for garbage collection
		
		//thats why this keyword is used, this keyword will return the current class object which is already there in the memory
		//this keyword avoids necessary object creation
		return this;
	}

	
	//Whenever any other method  of the Application class is being called its returning the same object
	//Every method is returning the same object
	public Application login(String un,String password) {
		System.out.println("Login to App with:"+un+" password:"+password);
		return this;	
	}
	
	public Application search(String productName) {
		System.out.println("Searching the product:"+productName);
		return this;
	}
	
	public Application search(String productName,int price) {
		System.out.println("Searching the product:"+productName+" price:"+price);
		return this;
	}
	
	public Application addToCart(String productName) {
		System.out.println("Adding to cart:"+productName);
		return this;
	}
	
	public Application doPayment(String upi) {
		System.out.println("Making payment using upi:"+upi);	
		return this;
	}
	
	public Application doPayment(String cc,String cvv) {
		System.out.println("Making payment using cc:"+cc+" "+cvv);
		return this;
	}
	
	public Application generateOrder() {
		System.out.println("Your order id is:"+1234567890);
		return this;
	}
	
	public Application logOut() {
		System.out.println("Logging out of the Application");
		//return this;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
