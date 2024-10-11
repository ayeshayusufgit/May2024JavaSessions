package javasessions.class23.exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

//1.
public class TestException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=9/0; 
		//Runtime Exceptions(Unchecked Exception):Getting the exceptions after running the program
		
		FileInputStream fis1=new FileInputStream("test.xls");
		//CompileTime Exception(Checked Exception):Compiler immediately catches the exception and asking to surround it by
		//a try-catch block(this exception has to be handled)
		
		//This line might give you an exception and the code needs to be surrounded by a try-catch block to handle it
		
		try {
			FileInputStream fis2=new FileInputStream("test.xls"); //CTE
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			Thread.sleep(5000); //wait for 5000 milliseconds or 5 seconds
								//This might give an Exception and the code needs to be surrounded by a try-catch block
								//This is a Compile Time Exception
								
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		//There are 2 types of Exception
		//1.Runtime Exception
		//2.CompileTime Exception:Compile immediately catches that Exception
		
	}

}
