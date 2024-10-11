package javasessions.class13;

public class EmployeeSheet {
	
	//Method Overloading:Same method names with different parameters and different sequence of parameters.
	//Also called Poly(many)+morphism(form)[multiple forms of the same method]:Compile Time Polymorphism(Static Polymorphism)
	//within the same class if we have multiple methods:
	//1.with the same method name
	//2.with the different number of parameters 
	//3.with the different sequence of parameters(if the number of parameters are the same) 
	//4.return type does not matter
	
	//will be used for the same functionality(login,search,payment) 
	
	public int test() {
		System.out.println("Calling test()");
		return 100;
		
	}
	
	//duplicate methods in the same class not allowed
	/*public void test() { //0 param
		
	}*/

	//This is allowed as its got 1 extra parameter
	public double test(int a) { //1 parameter
		System.out.println("Calling test(int)");
		return 12.33;
	}
	
	/*public void test(int x) { //1 parameter of the existing datatype, this is not allowed
		
	}*/
	public void test(String x) { //1 String parameters, allowed as this combination n sequence of datatype for test() is not existing
		System.out.println("calling test(String)");
	}
	
	public void test(String x,String y) { //2 String parameters, allowed as this combination n sequence of datatype for test() is not existing
		
	}
	
	public void test(String a,int b) { //2 String parameters
		System.out.println("calling test(String,int)");
		System.out.println(a+b);
		
	}
	
	public int test(int a,String b) { //2 String parameters
		return 100;
	}
	
	
	//Use Cases
	//Login in an application can be done in 3 ways
	
	//1.login wo any paramters, single sign on
	//open ur url and u get signed in, this can happen in some internal application
	public void login() {
		
	}
	
	//log into an application using username and password
	public void login(String un,String pwd) {
		
	}
	
	//log into an application using username, password and otp
	public void login(String un,String pwd,int otp) {
		
	}
	
	//Search is also a good example of method overloading
	public void search() {
		
	}
	
	public void search(String name) {
		
	}
	
	//To search for products with name and color
	public void search(String name, String color) {
		
	}
	
	//To search for products with name, color with a given price
	public void search(String name, String color,int price) {
		System.out.println("Search with:"+ name+" "+ color + " " +price);
		
	}
	
	//Payment:
	//Payment can be done by upi
	public void doPayment(String upi) {
		
	}
	
	public void doPayment(String cc,int cvv) {
		
	}
	
	public void doPayment(String cc,int cvv,int otp) {
		
	}
	//Uber:
	//Car booking login:
	public void carBooking(String stPoint,String endPoint) {
		
	}
	public void carBooking(String stPoint,String endPoint,String carType) {
		
	}
	public void carBooking(String stPoint,String endPoint,String carType,int passengers) {
	
	}
	
	/*public double calculateTax(int totalIncome,int bonus,int stockProfit) {
		System.out.println("Calculating Tax");
		int totalTax=(totalIncome/30)*100+(bonus/5)*100;
		//even though we are passing 3 arguments only the first 2 are being used, this is a wrong practice
		//if 3 values are being pass 3 values should be used in the function
		return totalTax;
	}*/
	
	public double calculateTax(int totalIncome,int bonus) {
		System.out.println("Calculating Tax");
		int totalTax=(totalIncome*30)/100+(bonus*5)/100;
		return totalTax;
	}
	public double calculateTax(int totalIncome,int bonus,int stockProfit) {
		System.out.println("Calculating Tax");
		int totalTax=(totalIncome*30)/100+(bonus*5)/100+(stockProfit*2)/100;
		return totalTax;
	}
	
	//void can be written with blank return
	public void click(String element) {
		System.out.println("Clicking on the element:"+element);
		return;
		//a return "value" cannot be used with a void function the only exception is a void return ie return;
		//or write nothing
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeSheet obj=new EmployeeSheet();
		obj.test();//test() method is called
		//The compiler decides which method is to be called during compile time
		//It depends on the number,type and sequence of the arguments that are passed 
		//while calling the method.
		
		obj.test(90);//test(int) method is called
		obj.test("Naveen");//test(String) method is called
		obj.test("Naveen",70);//test(String,int) method is called
		
		obj.search("Tshirt", "Black", 100);
		
		double tax=obj.calculateTax(1000, 500, 300);
		System.out.println(tax);
		
		tax=obj.calculateTax(4000, 200);
		System.out.println(tax);
		
		
	}
}
