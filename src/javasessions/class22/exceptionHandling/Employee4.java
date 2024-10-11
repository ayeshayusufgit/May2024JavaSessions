package javasessions.class22.exceptionHandling;

public class Employee4 {
	
	String name;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		try {
			Employee4 e=new Employee4();
			e=null;
			e.name="Naveen";//NPE , a check will be made if there is a catch block handling NPE, if not then the program will be terminated
							//NPE is thrown an caught with AE so in that case the program will not handle the Exception
			System.out.println("Hello");
			
		}catch(ArithmeticException ex) {
			System.out.println("Arithmetic Exception is coming");
			ex.printStackTrace();
		}
		System.out.println("Bye");
	}
}
