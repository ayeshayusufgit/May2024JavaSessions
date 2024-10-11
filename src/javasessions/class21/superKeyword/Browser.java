package javasessions.class21.superKeyword;

//7.
public class Browser implements Automation {

	String name;
	double version;
	
	//setter
	public void addBrowser(String name,double version) {
		this.name=name;//this keyword is always pointing to the current class object
		this.version=version;
		//this keyword can be used in getters and setters
		//this keyword can be also used in any method
		//this keyword cannot be used in any static method
		
		//System.out.println(super.time);not valid
		System.out.println(Automation.time);
		//System.out.println(Automation.super.time); not valid
		//System.out.println(Browser.super.time); not valid
		//if there is a parent interface better to avoid super keyword
		
		billing();
		//super.Automation.billing(); not valid
		Automation.super.billing();//Only default method of an interface can be accessed using the super keyword
		//used to call the default method of an Interface,only used when u have multiple parent interfaces and
		//every interface has this default billing method, so to differentiate from one interface to another
		
		//System.out.println(Automation.super.time); not valid
	}
	
	//getter
	public void getInfo() {
		System.out.println(name+":"+version);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(this.name);//this cannot be used in a static context as it refers to the current created object
		
		Browser br=new Browser();
		//br.name="chrome"; values can be also assigned this way
		//br.version=124.55;
		br.addBrowser("chrome", 124.55);
		
		//Constructor chain: whenever a constructor is calling another constructor
		
		br.getInfo();
		
	}
	
	//Can we use this() and super() in the Abstract class?

}
