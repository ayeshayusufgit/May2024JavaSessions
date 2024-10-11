package javasessions.class11;

public class Car2 {
	
	final String name="Merc";
	//The class/instance variable can be made final but has to be initialized
	//All the objects that are created will have the "name" as "Merc", on changing gives error
	//Its not a good practice to create a final non static variable
	//The object decides the values of the non static instant variables
	
	int price;
	String modelNumber;
	static final int wheels=4;
	//static variable can be declared with final thus making it a constant
	static int keys=2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car2 c1=new Car2();
		//c1.name="BMW";
		c1.price=60;
		c1.modelNumber="x3";
	
		Car2 c2=new Car2();
		//c2.name="Audi";
		c2.price=65;
		c2.modelNumber="q3";
		
		Car2 c3=new Car2();
		//c3.name="Honda";
		c3.price=25;
		c3.modelNumber="civic";
		
		System.out.println(Car2.wheels);

		System.out.println(c1.name+" "+c1.price+" "+c1.modelNumber+" "+Car2.wheels);
		System.out.println(c2.name+" "+c2.price+" "+c2.modelNumber+" "+Car2.wheels);
		System.out.println(c3.name+" "+c3.price+" "+c3.modelNumber+" "+Car2.wheels);
		
		System.out.println("=====================================================");
		
		//Footer and logo are the same in opencart site
		//if there are 100 pages then the footer and logo are common across all the pages thus it is static
		//and its final coz then non one can change the logo
		
		//The title will be different for all the pages(home,search) , url also differs
		
		//Advantage of the static variable:
		//Memory is saved(common variable created keys=2,wheels=4) for all the Cars.The static property is common for all the objects
	
		//Some fixed values like months etc can be declared with final key word
		//final keyword is used to provide constant values
		
		
		int i=1;
		while(i<=100) {
			if(i%5==0) {
				System.out.println(i++);
			}
			i++;
		}
		
		int i1=1;
		while(i1<=100) {
			System.out.println(i);
			i1=i1+5;
		}
		
		int i3=10;//local variables will be stored in the stack memory
		int[] a= {1,2,3}; // this will be stored in the stack memory
	}

}
