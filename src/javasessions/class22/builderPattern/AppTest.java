package javasessions.class22.builderPattern;

public class AppTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Application app=new Application();
//		app.login();
//		app.search("macbook");
//		app.addToCart("macbook");
		
		//workflow scenario
		//This pattern is called Builder Pattern
		//Whenever every method of that particular class is returning this, this pattern is called as builder pattern
		
		//Workflow 1.
		//only 1 object is created for every workflow
		app.login("naveen@gmail.com","naveen@123")
				.search("macbook pro")
					.addToCart("macbook pro 16 inches")
						.doPayment("naveen@okicici")
							.generateOrder()
								.logOut();
		
		//Workflow 2.
		app.login("naveen@gmail.com","naveen@123")
			.search("tshirt",1000)
				.addToCart("nike tshirt")
					.logOut();
		
		//Workflow 3.
		app.login("naveen@gmail.com","naveen@123")
		.search("tshirt",1000)
			.addToCart("nike tshirt")
				.doPayment("7878 8888 9999 7676","111")
					.generateOrder()
						.logOut();
		
		//Workflow 4.
		app.login("naveen@gmail.com","naveen@123")
			.logOut();
		
		//Workflow 5.
		app.login("naveen@gmail.com","naveen@123");
		
		//Workflow 6.
		app.login()
			.search("keyboard")
				.addToCart("keyboard apple")
					.doPayment("vibha@hdfc")
						.generateOrder()
							.logOut();
		
		//These kind of workflows are used in Ecommerce Application
		
		//Advantages of Builder Pattern:
		//Is more readable
		//Only 1 object is created per workflow
		
		//this:
		//1.to initialize the class variable
		//2.can be used in getter/setter(Used in the concept of Encapsulation)
		//3.same class constructor calling
		//4.returning this from a function, called a builder pattern
		

	}

}
