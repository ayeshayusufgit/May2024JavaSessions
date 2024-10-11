package javasessions.class16.encapsulationConcept;

import java.util.Arrays;

//6.
public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Bank b=new Bank(); when no setter then no validation can be done before setting the value 
//		b.name="Veena";
//		b.age=10;
//		b.aadharNumber="1234567890";
//		b.phone="9999999999";
//		System.out.println(b.name+" "+b.age);
		
		
		//when there is no constructor 
//		Bank b=new Bank()
//		b.setName("Pooja");
//		b.setAge(1);//The age is not getting set at it is 1
//		System.out.println(b.getName()+" "+b.getAge());
		
		//when there is a constructor 
		Bank b1=new Bank("Pooja",20,"123456789","9999999999");
		System.out.println(b1.getName()+" "+b1.getAge());
				
		
		Bank b2=new Bank("Pooja",5,"123456789","9999999999");
		System.out.println(b2.getName()+" "+b2.getAge());
		b2.openAccount();
	
		//Unable to create an object of Company because of the private constructor
		//Company co=new Company();
		Company.getDetails();//Accessing the 
		
		//System obj=new System();
		//On trying to create an object of the System class results in an error "The constructor System() is not visible"
		//The constructor of the System class is private an all the methods within it are static
		
		//All the methods within the System class are static and can be accessed as below 
		System.console().readLine();
		
		//Arrays ar=new Arrays(); //gives error
		//Even Arrays class constructor is private, thus gives error on trying to create the object of the class.
		//All the methods of Arrays class are static 
		
	}

}
