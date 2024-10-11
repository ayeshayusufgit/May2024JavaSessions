package javasessions.class13;

public class Browser {
	
	public void click(String element) {
		System.out.println("Click on element"+element);
	}
	
	public void sendKeys(String element, String value) {
		System.out.println("Entering the value:"+value+" into the element:"+element);
	}

	public String getTitle() {
		return "Google";
	}
	
	
	//WAF:launch Browser(String browserName)
	//browserName:chrome, firefox, safari, edge
	//return: print: success messg and return boolean(true/false)
	//when flag=true
	public boolean launchBrowser(String browserName) {
		System.out.println("browser name :"+browserName);
		boolean flag=true;
		switch (browserName.toLowerCase().trim()) {
		case "chrome":
				System.out.println("Launching chrome");
			break;
			
		case "firefox": 
				System.out.println("Launching firefox");	
			break;

		case "edge": 
				System.out.println("Launching edge");	
			break;	
		
		case "safari": 
				System.out.println("Launching edge");	
			break;
			
		default:
				System.out.println("pls pass the right browser"+browserName);
				flag=false;
			break;
		}
		return flag;
		
	}

	//WAF:launch Browser(String browserName)
	//browserName:chrome, firefox, safari, edge
	//return: print: success messg and return boolean(true/false)
	//when flag=false, here i have to manipulate the flag values in the  4 browser cases, 
	//the previous launchBrowser() is preferred as the flag=false is manipulated only once 
	//in the default case
	
	/*public boolean launchBrowser(String browserName) {
		System.out.println("browser name :"+browserName);
		boolean flag=false;
		switch (browserName.toLowerCase().trim()) {
		case "chrome":
				System.out.println("Launching chrome");
				flag=true
			break;
			
		case "firefox": 
				System.out.println("Launching firefox");
				flag=true	
			break;

		case "edge": 
				System.out.println("Launching edge");
				flag=true	
			break;	
		
		case "safari": 
				System.out.println("Launching edge");
				flag=true	
			break;
			
		default:
				System.out.println("pls pass the right browser"+browserName);
			break;
		}
		return flag;
		
	}*/
	
	//In this case which function will be called?
	//The preference will be given to the getNumber(int)
	//By default the java compiler will always consider the 100 as integer 
	//the getNumber(int) will be matched and called
	public void getNumber(byte a) {
		System.out.println("Hi byte:"+a);
	}
	
	public void getNumber(short a) {
		System.out.println("Hi short:"+a);
	}
	
	public void getNumber(int a) {
		System.out.println("Hi int:"+a);
	}
	
	public void getNumber(long a) {
		System.out.println("Hi long:"+a);
	}
	
	public void getNumber(float a) {
		System.out.println("Hi float:"+a);
	}
	
	public void getNumber(double a) {
		System.out.println("Hi double:"+a);
	}
	
	
	
	//The realtime example of this is the scientific calculator depending on the small, 
	//big and very large numbers the respective methods will be called
	
	
	//HW
	//The above program with double n float 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Browser obj=new Browser();
		boolean exec=obj.launchBrowser("ie");
		System.out.println(exec);
		
		if(exec) {
			System.out.println("enter the URL");
		}
		
		obj.getNumber(100);//The compiler matches the getNumber(int), 
							//by default 100 is considered as an integer thus matches getNumber(int)
		
		obj.getNumber((byte)100);//if the byte version of getNumber(byte) has to be called then
								 //then it has to explicitly casted to byte
		
		obj.getNumber(100L);//if the long version of getNumber(long) has to be called then L has to be appended
		
		obj.getNumber((short)100);//if the short version of getNumber(short) has to be called then
		 						  //then it has to explicitly casted to short
		
		obj.getNumber('a');//ascii value of 'a' will be 97, the characters will be stored in int by default
						  	//then getNumber(int) will be called	
		
		obj.getNumber(100.0);//by default the getNumber(double) will be called
		
		obj.getNumber(100.0f);//by default the getNumber(float) will be called
		

	}

}
