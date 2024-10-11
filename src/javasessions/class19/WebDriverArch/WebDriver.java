package javasessions.class19.WebDriverArch;

public interface WebDriver {
	public void get(String url);
	public String getTitle();
	public void click(String element);
	public void sendKeys(String element,String value);
	public void close();
	
	//This will get inherited in the implementing classes ChromeDriver,FireforDriver and SafariDriver
	default void getLogs() {
		System.out.println("Get Logs");
	}
	
	//default method can also be overridden in the implementing classes by a public method 
}
