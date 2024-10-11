package javasessions.class24.accessSpecifier;

//1.
public class FinallyBlock {

	//whether an Exception comes or not the finally block will be executed
	//if there's no Exception then finally will be executed
	//if there's an Exception then finally will still be executed
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		System.out.println("A");
		try {
			int i=9/0;
			//int i=9/3;
		}catch(Exception ex) {
			System.out.println("AE is coming...");
		}
		finally {
			System.out.println("I am in finally block");
		}
		System.out.println("Bye");
		
		//Usecase:
		//1.Make the connection in DB with username, password, ip:port-this line is applicable for the try-catch as this may/may not result in an exception
		
		//2.Hit the SQL query- if the table is wrong or query is wrong then this also can be in the try-catch block due to SQLException
		
		//3.Get the result from DB
		//4.Display the data on the UI
		
		//The line from 1 to 4 are all applicable for the try-catch block 
		//As the line from 1 to 4 may result in an Exception
		
		//5.Close the connection
		//6.logout
		
		
		//If the connection is made and there is an Exception then it is handled in the catch block
		//the user is logged out but the connection is still not closed
		//so the finally block has to be written in which the connection is closed
		//irrespective of whether line 1 to 4 results in an exception or not the finally block 
		//which closes the connection is executed
		
		//finally{
		//7.close connection with DB
		//}

		
		
	}
}
