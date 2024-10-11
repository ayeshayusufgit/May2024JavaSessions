package javasessions.class15;

//Program 4
public class TestingStack2 {
	
	//Local variables will be created on the stack
	

	public void m1() {
		int d=12;
		System.out.println("m1 method");
		m2();
	}
	
	public void m2() {
		int g=90;
		System.out.println("m2 method");
		m3();
	}
	
	public void m3() {
		int k=5;
		System.out.println("m3 method");
		//m1(); this will create a method circular chaining resulting in StackOverFlowError
		//Its a very bad programming practice
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int p=10;
		
		TestingStack2 obj=new TestingStack2();
		obj.m1();

	}

}
