package javasessions.class22.exceptionHandling;

//21.
public class Student2 {

	public void m1() { //This is is not a realtime usecase m1() calling m2() and m2() calling m1()
		System.out.println("m1");
		m2();
	}
	
	public void m2() {
		System.out.println("m2");
		m1();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 st=new Student2();
		
		try {
			st.m1();//this line is the culprit causing the error
					//the mpment the stack is completely full it results in a StackOverFlowError
					//which is handled by the catch(StackOverFlowError e) clause
		}catch(StackOverflowError e) {
			System.out.println("Some error is coming...");
		}
		System.out.println("Bye!!");
	}

}
