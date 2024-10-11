package javasessions.class17_18.inheritanceConcept;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BMW b=new BMW();
		b.start();//Overridden method
		//child class start() will be called
		//When b.start() is invoked the compiler is confused as to which start() to be invoked
		//the parent class or child class and this is decided at runtime thats why its called as Runtime Polymorphism
		
		//The preference will always be given to the 
		//start() of the child class if the Car(parent) also has the same method 
		
		b.stop();//Inherited method
		//no stop method in the BMW class but it gets inherited from the Car class, 
		//so Car class stop method will be executed
		
		b.refuel();//Inherited method
		//no refuel() in the BMW class but it gets inherited from the Car class, 
		//so Car class refuel() will be executed
		
		b.autoParking();//Individual method of BMW class
		
		BMW.billing();//static billing() of the BMW class
		//If the billing() of BMW class is commented then the Car class billing() is called
		
		b.getInfo(); //this method is inherited to the BMW class from the Car class
					 //the public getInfo() internally calls the private getCarInfo()
		
		//System.out.println("BMW Speed is:"+b.speed);//o/p=>BMW Speed is:100
		//the speed variable is getting inherited from Car class to BMW class
		//when BMW class doesn't have the speed variable
		
		System.out.println("BMW Speed is:"+b.speed);//o/p=>BMW Speed is:200
		//the speed variable is being picked up from the BMW class
		//when BMW class has the speed variable like the Car class
		
		b.speed=50;//the speed can be changed as its not final
		
		b.speedTracking();//This method is there is BMW and Audi
		
		//b.engine();//able to access my grand parent properties(Vehicle)
		b.engine();//The overridden method of BMW class
		
		b.bmwLoading();//This method of the BMW class is using the Object of the Truck class and accessing heavyLoading() of Truck class
		b.cruiseControl();
		//If there is no cruiseControl() in BMW class it will go 1 level up and execute from Car class
		
		b.cruiseControl();
		//If the cruiseControl() is overridden in BMW class it will execute it
		
		
		System.out.println("BMW Price:"+b.price);
		//o/p=>70 when BMW doesnt have any price variable it picks up from the Car class price variable
		//o/p=>500 when BMW has the price variable it picks up from the its BMW class price variable
		
		
		System.out.println("===========================");
		Car c=new Car();
		c.start();//Car class start() will be called
		c.stop();//All these methods are in the parent class ie Car class
		c.refuel();
		
		//c.autoPArking(); accessing the method from the child class BMW will not be allowed
		
		Car.billing();//static billing method of the Car class will be executed
		
		c.getInfo();//the public getInfo() internally calls the private getCarInfo()
		
		System.out.println("Car Speed is:"+c.speed);//o/p=>Car Speed is:100
		
		//c.speed=50;//the speed cannot be changed as its final
		
		//c.theftSafety(); Car class(Parent) cannot take anything from the Audi(Child) class
		c.engine();//Able to access the parent(Vehicle) properties
		
		System.out.println("Car Price:"+c.price);//o/p=>70
		
		
		System.out.println("===========================");
		Audi au=new Audi();
		au.start();//preference will be given to the overridden method of Audi->start()
		au.stop();//inherited stop() from Car class
		au.refuel();//inherited refuel() from Car class
		au.applyBreak();//inherited applyBreak() from Car class
		au.theftSafety();//preference will be given to the overridden method of Audi->theftSafety()
		
		//au.autoParking();//Audi cannot access the BMW autoParking()
		//There is no concept like sibling inheritance
		
		au.speedTracking();//this is there is Audi and BMW
		
		System.out.println("============================");
		Vehicle vh=new Vehicle();
		vh.engine();//only the engine() of the Vehicle class, no start() or stop() 
		
		//child class object can be referred by parent class reference variable:Top Casting/Up Casting
		//From topcasting all the overridden and inherited methods can be accessed
		//But cannot access individual methods as ref type check will fail
		Car c1=new BMW();// Every BMW is a Car, this is-a relationship
		c1.start();//BMW overridden start()
		c1.stop();//Car inherited stop()
		c1.refuel();//Car inherited refuel()
		//c1.autoParking();individual methods of BMW cannot be accessed by the reference c1 of type Car
		
		
		//Down casting:
		//The parent class object can be referred by child class reference
		BMW b1=(BMW)new Car();//Every Car cannot be a BMW,
		//The compiler is confused at compile time due to the casting of Car object to BMW
		//This the error goes but on running give ClassCastException
		
		Car c2=new Audi();
		c2.start();//All the inherited methods can be accessed 
		c2.stop();
		c2.refuel();
		
		//Child class object can be referred by a Grand Parent reference
		Vehicle v1=new BMW();//BMW is a vehicle, this is an is-a relationship
		v1.engine();//Only engine() can be accessed
		
		//BMW b3=(BMW)new Vehicle();//Give CCE
		
		
	
		Testing t=new Testing();
		t.m1();
		
		
	}

}
