package javasessions.class22.exceptionHandling;

//20.
public class Student {

	public void m1() { //This is called Circular method chaining
		System.out.println("m1");
		m2();
	}
	
	public void m2() {
		System.out.println("m2");
		m1();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st=new Student();
		
		
		//StackOVerflowError is coming due to the memory size, the stack memory is getting completely full
		
		try {
			st.m1();//this line is the culprit causing the error
					//the mpment the stack is completely full it results in a StackOverFlowError
					//which is handled by the catch(Error e) clause
		}catch(Error e) {
			System.out.println("Some error is coming...");
		}

	}

}
