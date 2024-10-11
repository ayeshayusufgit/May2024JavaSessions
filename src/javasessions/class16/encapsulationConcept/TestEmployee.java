package javasessions.class16.encapsulationConcept;

//2.
public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Employee obj=new Employee();//Outside the class Employee, its private members cannot be accessed 
		//obj.name="Naveen"; gives error
		//obj.setName("Tom");//the value Tom will be set for the private "name" variable
		//String n=obj.getName();
		//System.out.println(n);
		//The direct private variables of Employee class is not accessible from outside the class
		//but can be accessed through public methods(getters/setter) using these variables from another class    
		
		
		//Creating a user - POST call
		Employee obj=new Employee("Pooja", 20, 12.33, true);
		
		//Getting the details of the user - GET call
		System.out.println(obj.getName()+" "+obj.getAge()+" "+obj.getSalary()+" "+obj.isPerm());
		
		//The setters most important function is that it can update/modify the existing values of the instance variables
		
		//Updating the value of the user - UPDATE call
		obj.setAge(21);
		obj.setSalary(25);
		
		System.out.println(obj.getName()+" "+obj.getAge()+" "+obj.getSalary()+" "+obj.isPerm());
		System.out.println("=========================");
		
		Employee obj1=new Employee("Veena", 30, 22.33, false);
		
		System.out.println(obj1.getName()+" "+obj1.getAge()+" "+obj1.getSalary()+" "+obj1.isPerm());
		
		obj1.setPerm(true);
		
		Browser browserObj=new Browser();
		//Since all the methods with the Browser class is public all the methods can be accessed by a User
		//The user doesnt understand RAM size or check the Browser Updates or verify the storage
		//The user only knows how launch browser ie by clicking on it
		//Its not a user friendly design as the user is getting unnecessary methods
		
		//Initially all the Browser methods were accessible to the user but later only the launchBrowser() 
		//was made public to the user
		
//		browserObj.launchBrowser();
//		browserObj.checkRAMSize();
//		browserObj.checkBrowserUpdates();
//		browserObj.verifyStorage();
//		browserObj.checkBrowserPolicy();	
		
		browserObj.launchBrowser();//User can see only this, 
		//whereas the unnecessary information is hidden from the user
		//(the internal working is hidden from the user)
		
		
		//login:
//		LoginPage loginObj1=new LoginPage();
//		loginObj1.setUsername("naveen@gmail.com");
//		loginObj1.setPassword("naveen@123");

		//Creating user login credentials---POST call
		//Constructor behaves like a first time setter
		LoginPage loginObj1=new LoginPage("naveen@gmail.com","naveen@123");
		
		//loginObj1.doLogin(loginObj1.getUsername(), loginObj1.getPassword());
		loginObj1.doLogin();
		System.out.println(loginObj1.getUsername()+" "+loginObj1.getPassword());
		
		loginObj1.setPassword("naveen@9090");//updating the password
		
		System.out.println(loginObj1.getUsername()+" "+loginObj1.getPassword());
		
		System.out.println("-------------------------------------------------");
		LoginPage loginObj2=new LoginPage("piyush@gmail.com","piyush@123");
		loginObj2.doLogin();
		
	}

}
