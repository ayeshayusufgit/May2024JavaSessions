package javasessions.class19.abstraction;

public abstract class Page {
	//An abstract class:
	//We can have abstract n non abstract methods
	//We can achieve 0% abstraction by having all the methods in the AC with the method body.
	//We can achieve 100% abstraction by having only abstract methods in the AC
	//We can achieve partial abstraction by having a combination of abstract methods n non abstract methods in the AC
	
	//1.abstract methods:has no method body
	//The abstract keyword has to be used with the abstract method
	//In the Abstract class the abstract methods have to be written with the abstract keyword
	
	//No object of the Abstract class can be created, but the constructor of the AC is allowed
	
	//When will the constructor be called?When the object of the child class is created then it will be called automatically
	
	//This is mandatory if you have any parameterized constructor in the Parent class, then the default constructor becomes mandatory
	//becomes mandatory
	public Page(){
		System.out.println("Page Class Constructor...default");
	}
	
	public Page(int a){
		System.out.println("Page Class Constructor:"+a);
	}
	
	//Title and URL should be there and  will be different for different pages, 
	//thus the flexibility is given to the Page child classes implementing them
	//These 2 methods are mandatory to be implemented in the child classes
	public abstract void title();
	public abstract void url();
	
	
	//2.non abstract methods
	//This cannot be a final method as the loading time varies for different pages, thus using final will be a bad design
	public void loading() {
		System.out.println("Page Loading in 20 secs");
	}
	
	//logo remains the same across all the pages
	public final void displayLogo() {
		System.out.println("myLogo.png");
	}
}
