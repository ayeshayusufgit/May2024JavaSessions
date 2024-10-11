package javasessions.class19.WebDriverArch;

public class AmazonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ChromeDriver driver=new ChromeDriver();//This option will be used when the script is to be executed only on chrome
		
		//FirefoxDriver driver=new FirefoxDriver();//This option will be used when the script is to be executed only on firefox
		
		//SafariDriver driver=new SafariDriver();//This option will be used when the script is to be executed only on safari
		
		//Cross Browser Logic can be implemented using topcasting
		String browserName="chrome";//This may come from excel file or properties file or json file
		
		WebDriver driver=null;
		//In JAVA whenever a local variable which is a non primitive is created it has to be
		//initialized with null before it being used.
		
		
		switch (browserName.trim().toLowerCase()) {
		//child class being referred by parent reference variable
		
		case "chrome":	driver=new ChromeDriver();
						break;
						
		case "firefox":	driver=new FirefoxDriver();
						break;
						
		case "safari":	driver=new SafariDriver();
						break;				
						
		default:System.out.println("Please pass the right browser name:"+browserName);
			break;
		}
		
		driver.get("https://www.google.com");
		String title=driver.getTitle();
		System.out.println(title);
		driver.sendKeys("Search Field", "Naveen Automation Labs");
		driver.click("searchIcon");
		driver.close();
		//After the browser is closed, get the logs
		driver.getLogs();
	}
}
