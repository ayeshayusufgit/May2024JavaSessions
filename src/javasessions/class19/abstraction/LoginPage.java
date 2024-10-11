package javasessions.class19.abstraction;


//The abstract methods of the Page class have to be implemented in the LoginPage(child) class
//Its the child class responsibility to implement the abstract methods

public class LoginPage extends Page{

	//default hidden constructor will be added by the compiler if no constructor there
	
	//Constructor overloading is allowed in Abstract classes
	public LoginPage(){
		System.out.println("LoginPage Class Constructor...default");
	}
	
	public LoginPage(int a){
		System.out.println("LoginPage Class Constructor:"+a);
	}
	
	public LoginPage(int a,int b){
		System.out.println("LoginPage Class Constructor:"+(a+b));
	}
	
	@Override
	public void title() {
		System.out.println("Login Page Title");
	}

	@Override
	public void url() {
		System.out.println("Login Page URL");
	}
	
	@Override
	//The LoginPage, loading time differs from the Page class 
	public void loading() {
		System.out.println("Page Loading in 5 secs");
	}

	//individual method
	public void doLogin() {
		System.out.println("Login to the App");
	}
}
