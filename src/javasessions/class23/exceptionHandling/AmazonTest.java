package javasessions.class23.exceptionHandling;

//7.
public class AmazonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String browser = "chrome";
		String browser = "naveen";
		
		//if browser == "chrome" then the complete scenario takes place
		
		//if browser == "naveen" then a Custom Exception will be thrown and lines from 30 to 33 wont be executed
		//which is making more sense
		
		switch (browser) {
		case "chrome":
			System.out.println("Launch Chrome!!!");
			break;

		case "firefox":
			System.out.println("Launch Firefox!!!");
			break;

		case "safari":
			System.out.println("Launch Safari!!!");
			break;

		default:
			System.out.println("Pls pass the right browser:"+browser);
			throw new MyExceptions("===WRONG BROWSER PASSED===");//syntax of throws keyword
			//Since MyException class is extending RuntimeException this Exception will be thrown at runtime
			
			//MyExceptions() cannot be created as there's no default constructor in the class
			
			//MyException class behaves like a utility, use when required 
			
			//break; this is commented
		}
		
		System.out.println("Launch URL");
		System.out.println("Login to App");
		System.out.println("Shop a product");
		System.out.println("Close browser");
	}
	
}
