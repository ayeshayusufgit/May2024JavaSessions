package javasessions.class24.accessSpecifier.AccMod2;

import javasessions.class24.accessSpecifier.AccMod1.Car;

//4.
public class Audi extends Car{

	//Different package and subclass
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Audi a=new Audi();
		//a.name="Q1";//default member cannot be accessed within a sub-class in another package
		a.color="Black";//protected member can be accessed within a sub-class in another package
		a.price=1000000;//public member can be accessed within a sub-class in another package
		//c.chasisNumber="123456"; //private member cannot be accessed within a sub-class in another package
		
		Car c=new Car();//protected class constructor cannot be accessed from a different package child class
		
	}
}
