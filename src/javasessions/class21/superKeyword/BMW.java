package javasessions.class21.superKeyword;

//3.
public class BMW extends Car{
	
	int speed=300;
	
	@Override
	public void start() {
		//start();//recursive call happens here
		//The stack memory will get completely filled resulting in StackOverFlowError
			
		super.start();//Calls the start() of the parent class
		System.out.println("BMW--start");
		
		super.refuel();
		//or
		//refuel();
		
	}
	
	public void autoParking() {
		System.out.println("BMW--autoParking");
		//start();calls the BMW start()
		super.start();
	}
	
	public void displaySpeed() {
		System.out.println("My speed is:"+speed);
		
		//if I want to use my Parent class speed
		System.out.println("Parent speed is:"+super.speed);
		
		//super keyword is used to access the parent properties when required
		
		System.out.println(super.speed);//On commenting the speed of Car class
		//A check will be made in the Parent class ie Car Class, 
		//if not found then the Grand Parent class ie Vehicle will be checked and speed variable will be accessed.
		
		
	}

}
