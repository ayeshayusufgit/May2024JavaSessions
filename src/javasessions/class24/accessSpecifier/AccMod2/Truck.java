package javasessions.class24.accessSpecifier.AccMod2;

import javasessions.class24.accessSpecifier.AccMod1.Car;

//5.
public class Truck {
	
	//Different package non subclass
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c=new Car();//The object of Car cannot be created as the constructor is with access specifier protected 
		
		//c.name="Bharat Benz";//default member cannot be accessed within a class in another package
		//c.color="Black";//protected member cannot be accessed in class in another package
		c.price=1000000;//public member can be accessed in a class in another package
		//c.chasisNumber="123456"; //private member cannot be accessed in a class in another package

	}

}
