package javasessions.class15;

//Program 5
public class TestExecution {

	//a method calling itself is called recursive function:recursion
	public static void getNum() {
		System.out.println("Get Num");
		getNum();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestExecution.getNum();
		//Infinite stacks will be created
		//(memory is getting allocated but decallocation is not happening resulting in StackOverflowError)
		//Gives the o/p as 
		//Get Num
		//Get Num
		//Get Num
		//Once the stack is full gives StackOverflowError

	}

}
