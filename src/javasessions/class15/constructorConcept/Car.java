package javasessions.class15.constructorConcept;

//Program 8
public class Car {
	String name;
	String colour;
	double price;
	String model;
	String chasisNumber;
	
	//Java will not add any hidden default constructors, as there are parameterized constructors already there
	//Only those can be used
	
	public Car(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public Car(String name, String colour, double price, String model) {
		this.name = name;
		this.colour = colour;
		this.price = price;
		this.model = model;
	}

	public Car(String name, String colour, double price, String model, String chasisNumber) {
		this.name = name;
		this.colour = colour;
		this.price = price;
		this.model = model;
		this.chasisNumber = chasisNumber;
	}
	
	
	public static void main(String[] args) {
		Car c1=new Car("BMW",50.44);
		Car c2=new Car("BMW","Red",80.44,"x3");
		Car c3=new Car("Audi","Green",75.44,"q3","1234567890");
		
		
		//The data which is supplied while creating the object the same data will be also fetched
		System.out.println(c1.name+" "+c1.price+" "+c1.model+" "+c1.chasisNumber+" "+c1.colour);
		System.out.println(c2.name+" "+c2.price+" "+c2.model+" "+c2.chasisNumber+" "+c2.colour);
		System.out.println(c3.name+" "+c3.price+" "+c3.model+" "+c3.chasisNumber+" "+c3.colour);
		
		Car c4=new Car();
		//If there are parameterized constructors then java will not added any hidden default constructor
		//Thus the object wont be able to be created of type Car
	}

}
