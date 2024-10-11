package javasessions.class21.superKeyword;

//8.
public interface Automation {
	public int time = 10;
	
	default void billing() {
		System.out.println("Automation Billing");
	}
}
