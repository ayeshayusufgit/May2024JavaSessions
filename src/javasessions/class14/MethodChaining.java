package javasessions.class14;

//3rd Program
public class MethodChaining {
	
	public void m1() {
		System.out.println("m1 method");
		m2(); //m1() can call m2(), so no need to create an object(since they are apart of the same object) 
			  //can be called directly
		      //For ns methods we never use the classname
	}
	
	public void m2() {
		System.out.println("m2 method");
		m3();//m2() can call m3(), so no need to create an object can be called directly
	}
	
	public void m3() {
		System.out.println("m3 method");
		MethodChaining.t1();//calling a static method from a non static method
	}
	
	public void m4() {
		System.out.println("Bye");
	}
	
	//t1(),t2() and t3() are available in the CMA and they can talk to each other directly
	public static void t1() {
		System.out.println("t1 method");
		MethodChaining.t2(); 
		//or t2() if within the same class
	}
	
	public static void t2() {
		System.out.println("t2 method");
		MethodChaining.t3();
		//or t3() if within the same class
		MethodChaining obj1=new MethodChaining();
		obj1.m4();//calling a non static method from a static method
	}
	
	public static void t3() {
		System.out.println("t3 method");
	}

	
	//NS---NS:Direct calling(no object required as they are part of the same object)
	
	//S--S:Direct calling or Calling the static function with the Classname.Methodname()
	
	//NS--S:Direct calling or Classname.Methodname()
	
	//S--NS:Creating an object and calling it
	//There is a problem in this if there are 10 static methods n if it wants to call a 
	//non station method then as per the above 10 diff objects need to be create which is a wrong approach
	//So in this case Call By Reference is used
	
	
	//JVM starting point
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodChaining obj=new MethodChaining();//with the non static an object has to be created to call the 
												//non static methods
		obj.m1();	//calling the non static within the same class and same object
		//One object has multiple non static methods and they can talk to each other without creating objects
		
		
		//The static method can be called using the classname
		MethodChaining.t1();//calling only static methods within the same class
		
		
		//m3() which is a non static method wants to call t1() which is a static method
		//this can be done by calling the static method from the ns method using the Classname.methodName()
		
		
		
	}

}
