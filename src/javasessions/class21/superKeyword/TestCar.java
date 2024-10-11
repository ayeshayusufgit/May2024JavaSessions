package javasessions.class21.superKeyword;

//4.
public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		BMW b=new BMW();
//		b.start();
//		b.displaySpeed();

		//Audi au=new Audi();//Parent(Car) Class default constr -> Child(Audi) Class default constr
		//Audi au=new Audi(10);//Parent Class(Car) default constructor->Child(Audi) Class Parameterized(10,20)
		//Audi au=new Audi(10,20);//Parent Class(Car) default constructor->Child(Audi) Class Parameterized(10,20)
	
		//System.out.println(super.speed);
		//this cannot be used here as the TestCar class doesn't have any parent, 
		//thus cannot access the parent properties
		
		Honda h=new Honda();
		//a check will be made if there is a parent class then the default constructor of the parent class will be called
		//then the child class parameterized constructor(using this(10))
		//then the child class default constructor
		
		//Honda h=new Honda(10);
	}

}
