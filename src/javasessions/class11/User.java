package javasessions.class11;

import javasessions.class10.Employee;

public class User {
//	String name="Veena";
//	int age=45;
	
	//We can have n number of Users their class variable values will also change so we 
	//shouldnt have hard coded values
	
	String name;
	int age;
	String city;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User u1=new User();
		u1.name="Veena";
		u1.age=30;
		u1.city="Pune";
		
		User u2=new User();
		u2.name="Piyush";
		u2.age=35;
		u2.city="Bangalore";
		
		User u3=new User();
		u3.name="Suma";
		u3.age=40;
		u3.city="LA";
		
		System.out.println(u1.name+" "+u1.age+" "+u1.city);//Veena
		System.out.println(u2.name+" "+u2.age+" "+u2.city);//Piyush
		System.out.println(u3.name+" "+u3.age+" "+u3.city);//Suma	
		System.out.println("============================");
		
		u1=u2;
		
		System.out.println(u1.name+" "+u1.age+" "+u1.city);//Piyush
		System.out.println(u2.name+" "+u2.age+" "+u2.city);//Piyush
		System.out.println(u3.name+" "+u3.age+" "+u3.city);//Suma
		System.out.println("============================");
		
		u2=u3;
		
		System.out.println(u1.name+" "+u1.age+" "+u1.city);//Piyush
		System.out.println(u2.name+" "+u2.age+" "+u2.city);//Suma
		System.out.println(u3.name+" "+u3.age+" "+u3.city);//Suma
		System.out.println("============================");	
		
		u3=u1;
		
		System.out.println(u1.name+" "+u1.age+" "+u1.city);//Piyush
		System.out.println(u2.name+" "+u2.age+" "+u2.city);//Suma
		System.out.println(u3.name+" "+u3.age+" "+u3.city);//Piyush 	
		System.out.println("============================");
		
		//u1 has no reference pointing to it so it is eligible for garbage collection
		
		//The static property id can be accessed in another class 
		System.out.println(Employee.id);
		
	}
}
