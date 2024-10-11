package javasessions.class22.exceptionHandling;

//21.
public class Student3 {

	public void m1() {
		System.out.println("m1");
		try {
		m2();
		}catch(StackOverflowError ex) {
			System.out.println("Some error is coming");
		}
	}
	
	public void m2() {
		System.out.println("m2");
		try {
		m1();
		}catch(StackOverflowError ex) {
			System.out.println("Some Error is coming");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student3 st=new Student3();
		
			st.m1();
			
		System.out.println("Bye!!");
	}

}
