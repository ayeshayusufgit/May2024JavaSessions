package javasessions.class24.accessSpecifier.AccMod1;

//3.
public class Cycle {

	//Same package non sub class
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c=new Car();
		c.name="Honda CRV";//default member can be accessed in another class within the same package
		c.color="Green";//protected member can be accessed in another class within the same package
		c.price=123456789;//public member can be accessed in another class within the same package
		//c.chasisNumber="123456"; //private member cannot be accessed in another class within the same package
		
		
		
	}
}
