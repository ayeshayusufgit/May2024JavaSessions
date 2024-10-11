package javasessions.class14;

//4th Program
public class CallByReference {
	
	String name;
	int age;
	
	public void m1(int a) {
		System.out.println(a);
	}

	public static void t1(CallByReference p1) {
		p1.m1(20);
		
		System.out.println(p1.name);//Naveen
		System.out.println(p1.age);//20
		
		p1.name="Tom";//In the same object the name an age will be updated
		p1.age=40;
		
		//After manipulation of "name" an "age" using reference p1 the values 
		//will be updated to "Tom" and 40 for "name" and "age" as p1 also is 
		//referring the the same object pointed by obj
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CallByReference obj=new CallByReference();
		
		//default values will be given
		System.out.println(obj.name);//null
		System.out.println(obj.age);//0
		
		obj.name="Naveen";
		obj.age=20;
		
		//obj.m1(20);//Call by value
		
		CallByReference.t1(obj);//Call by reference
		//The main advantage of Call by Reference is to avoid unnecessary object creation
		
		System.out.println(obj.name);//The updated value for name and age will be picked up
		System.out.println(obj.age);
		
		//The object reference can be returned from a method
		
	}

}
