package javasessions.class19.WebDriverArch;

public class ChromeDriver implements WebDriver{

	public ChromeDriver() {
		System.out.println("Launch Chrome....");
		//This is the initialization logic of the ChromeDriver wo any functionality
	}
	
	@Override
	public void get(String url) {
		// TODO Auto-generated method stub
		System.out.println("Entering Url:"+url);
	}

	@Override
	public String getTitle() {
		return "Google";
	}

	@Override
	public void click(String element) {
		System.out.println("Clicking on element:"+element);
	}

	@Override
	public void sendKeys(String element, String value) {
		System.out.println("Entering value: "+value+" into the field: "+element);
	}

	@Override
	public void close() {
		System.out.println("Closing Browser");
		getLogs();//This is inherited from the WebDriver interface
	}
	

	//default method of the interface can be overridden with the public access specifier
	@Override
	public void getLogs() {
		System.out.println("Chrome Logs");
	}
}
