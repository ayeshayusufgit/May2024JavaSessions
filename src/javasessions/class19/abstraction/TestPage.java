package javasessions.class19.abstraction;

public class TestPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//LoginPage lp=new LoginPage();
		//When an object of the LoginPage is created then a default constructor will be called by the compiler
		//then the Page(Parent) class constructor also will be called.
		
		//default constructor of the Parent(Page)Class and Default Constructor of the child(LoginPage)
		
		//LoginPage lp=new LoginPage(10);
		//default constructor of the Parent(Page)Class and Parameterized Constructor of the child(LoginPage)
		
		LoginPage lp=new LoginPage(10,20);
		//default constructor of the Parent(Page)Class and 2 Parameter Constructor of the child(LoginPage) 
		
		lp.title();
		lp.url();
		lp.loading();
		lp.doLogin();
		
		//Cannot create the object of the abstract class
		//Page p=new Page();
		
		//Top Casting can be done
		//Child class object will be referred by the parent abstract class reference
		Page pg=new LoginPage();
		pg.title();
		pg.url();
		pg.loading();
		
		//individual method of LoginPge cannot be accessed
		//pg.doLogin();
		
		//DownCasting is not allowed at compile along leave alone Runtime
		//LoginPage lp=(LoginPage) new Page();
		
	}

}
