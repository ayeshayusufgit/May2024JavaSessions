package javasessions.class14;

//1st Program
public class TestMethod {
	
	public void getMail(){
		System.out.println("Get Mail");
	}

	//Can a static method be overloaded?
	//Yes a static method can be overloaded
	public static void sendMail(){
		System.out.println("Send Mail");
	}
	
	public static void sendMail(int a){
		System.out.println("Send Mail");
	}
	
	public static void sendMail(int a,int b){
		System.out.println("Send Mail");
	}
	
	//a static method can be overloaded with a non static method
	public void sendMail(String a) {
		System.out.println("Send Mail");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//How to call static method:
		//1.using the class name:
		TestMethod.sendMail();//this is a preferred way as well knows from which class the method is being called
		
		//2.within the same class, call it directly:
		sendMail();
		
		//How to call non static methods: we need to create the object
		
		TestMethod obj=new TestMethod();
		obj.getMail();
		
		obj.sendMail();//warning -- not a good programming practice
		
		
	}

}
