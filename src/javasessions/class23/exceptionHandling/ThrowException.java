package javasessions.class23.exceptionHandling;

//5.
public class ThrowException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//deliberately want to throw custom exception or user defined exception
		
		
		//Excample
		//data is coming from an external source,if data == null then throw an Exception during runtime
		
		
		String data=null;
		
		if(data==null) {
			
			throw new RuntimeException("Data not found!!!");//Custom/User Defined Exception
		}
		
		System.out.println("Bye");//This will be the unreachable code, as the Exception is already thrown before Bye
		

	}

}
