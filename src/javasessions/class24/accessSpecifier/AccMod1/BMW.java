package javasessions.class24.accessSpecifier.AccMod1;

//2.
public class BMW extends Car{
	
	@Override
	//public methods of the parent class can be overridden in the subclass with only public access specifiers 
	public void billing() {
		System.out.println("BMW---billing");
	}
	
	@Override//private methods cannot be overriden
	public void start() {
		System.out.println("BMW---start");
	}
	
	@Override
	//protected methods of the parent class can be overridden in the subclass with either protected or public access specifiers
	public void stop() {
		System.out.println("BMW---stop");
	}
	

	//protected methods of the parent class cannot be overridden in the subclass with default access specifier
	//only protected n default are allowed to override
	@Override
	void refuel() {
		System.out.println("BMW---refuel");
	}
	
	@Override
	//default methods of the parent class can be overridden in the subclass with default, protected and public access specifiers.private is not allowed
	void autolock() {
		System.out.println("BMW---autolock");
	}
	
	//Same package subclass
	public static void main(String[] args) {
		BMW b=new BMW();
		//b.chasisNumber this cannot be accessed as this is a private variable
		
		//All the members of the Car class can be accessed except for the private member 
		b.name="BMW X3";
		b.color="Blue";
		b.price=1234567;
		
		Car c=new Car();
	}
}
