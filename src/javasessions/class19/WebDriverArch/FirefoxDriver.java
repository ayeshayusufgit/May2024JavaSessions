package javasessions.class19.WebDriverArch;

public class FirefoxDriver implements WebDriver {

	public FirefoxDriver() {
		System.out.println("Launch Firefox....");
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
	}
}
