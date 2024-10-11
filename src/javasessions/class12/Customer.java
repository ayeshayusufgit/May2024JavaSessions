package javasessions.class12;

public class Customer {
	
	//WAF:
	//Create a function which will return the customer marks on the basis of a given  customer name
	//name: getCustomerName(String name)
	//return: marks(int)
	
//	public int getCustomerName(String name) {
//		//"name" is the parameter
//		System.out.println("Customer Name:"+name);
//		
//		if(name.trim().equalsIgnoreCase("Piyush")) {
//			return 90;
//		}else if(name.trim().equalsIgnoreCase("Ravi")) {
//			return 95;
//		}else if(name.trim().equalsIgnoreCase("Naveen")) {
//			return 10;
//		}else {
//			System.out.println("Please pass the right customer name..."+name);
//			return -1;
//		}
//	}
	
	//more than 255 arguments cannot be passed in the function
	//Once the object is created a copy of the class members and class functions are given to the object
	public int getCustomerName(String name) {

		System.out.println("Customer Name:"+name);
		
		int marks=-1;
		
		if(name.trim().equalsIgnoreCase("piyush")) {
			//return 90;
			marks=90;
			
		}else if(name.trim().equalsIgnoreCase("ravi")) {
			//return 95;
			marks=95;
			
		}else if(name.trim().equalsIgnoreCase("naveen")) {
			//return 10;
			marks=10;
			
		}else {
			System.out.println("Please pass the right customer name..."+name);
			//return marks;
			marks=-1;
		}
		return marks;
	}

	
	
	//Controller of the program
	//The execution of the program starts from the main()
	//no business logic is written in the main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c=new Customer();
		int marks=c.getCustomerName("piyush");//"piyush" is the argument
		System.out.println(marks);
		System.out.println("________________________________________");
		marks=c.getCustomerName("Piyush");
		System.out.println(marks);
		System.out.println("________________________________________");
		marks=c.getCustomerName("Piyush ");
		System.out.println(marks);
		System.out.println("________________________________________");
		marks=c.getCustomerName("	Piy		ush	");//These kind of cases need not be handled like spelling mistakes etc
		System.out.println(marks);
		System.out.println("________________________________________");
		
		marks=c.getCustomerName("pooja");//"piyush" is the argument
		System.out.println(marks);
		
		if(marks>=0) {
			System.out.println("Print the marksheet");
		}
	}

	public void main(int a) {
		System.out.println("Bye");		
	}
}
