package javasessions.class15;

//Program 1
public class A {
	
	//Once the stack is completely filled in the memory then it will result in the StackOverFlowError

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("A-main ");
		
		B.main(args);
		//For sometime A calls B and then B calls A, once the stack gets full it gives a StackOverFlowError
		

	}

}
