package javasessions.class11;

public class Car {
	
	String name;//non static properties
	int price;//non static properties
	String modelNumber;//non static properties
	//Java objects will always hold the non static properties 
	
	//static int wheels=4;
	static final int wheels=4;
	//static properties which will be commonly shared
	//static variables will be stored in a common memory allocation/CMA/Perm Generation/Metaspace
	//This a separate section in the memory not apart of the stack n heap
	//THis space is designed only for static members or variables
	//Object never holds any static variables
	
	static int keys=2;//there will be 2 sets of keys given for all the cars
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Can a local variable be made static?
		//static int p =10;
		//local variable cannot be allowed to be static variable, only class variables can be static
		
		
		Car c1=new Car();
		c1.name="BMW";
		c1.price=60;
		c1.modelNumber="x3";
		//c1.wheels=4;
		//There is a duplication of memory space as all the cars have wheels=4
		//if there are 1000 objects then there will be a wastage of memory of 4000 mb
		//Common values shouldnt be written like this
		
		Car c2=new Car();
		c2.name="Audi";
		c2.price=65;
		c2.modelNumber="q3";
		//c1.wheels=4;
		
		Car c3=new Car();
		c3.name="Honda";
		c3.price=25;
		c3.modelNumber="civic";
		//c1.wheels=4;
		
		//How to access the static variables:
		//1.using the class name
		System.out.println(Car.wheels);
		//2.using directly
		System.out.println(wheels);
		//3.Can i access static variables using the obj reference?
		System.out.println(c1.wheels);//u can but its a bad practice, should be accessed using the classname
		
		
		//The static value wheels can be updated, which shouldn't be allowed,
		//users shouldn't be able to change the value of the wheels.This can be done by using the final keyword
		//Car.wheels=5;	Before using final the static value could be updated, after final results in an error
		
		Car.keys=3;//keys can be updated as its not final
		
		//final cannot be used for local variables
		
		//How to access non static variables using object reference:
		System.out.println(c1.name+" "+c1.price+" "+c1.modelNumber+" "+Car.wheels);
		System.out.println(c2.name+" "+c2.price+" "+c2.modelNumber+" "+Car.wheels);
		System.out.println(c3.name+" "+c3.price+" "+c3.modelNumber+" "+Car.wheels);
		
		
		System.out.println("=====================================================");
		int days=7;
		days=10;//No of days of the week cannot be changed so in that case it should be made final
		//Now the days cannot be changed,if tried to change it results in an error
		//final can be applied on the class variables n local variables
		
		
		int totalSalary=days*100;//the days shouldn't be allowed to be changed from the BE
		//On changing the totalSalary can be changed which is a bug in the BE
		
		System.out.println(totalSalary);
		
	}

}
