package javasessions.class15;

//Program 3
public class TestingStack {

	public void m1() {
		System.out.println("m1 method");
		m2();
	}
	
	public void m2() {
		System.out.println("m2 method");
		m3();
	}
	
	public void m3() {
		System.out.println("m3 method");
		//m1(); this will create a circular chain resulting in StackOverFlowError
		//Its a very bad programming practice
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestingStack obj=new TestingStack();
		obj.m1();

	}

}
