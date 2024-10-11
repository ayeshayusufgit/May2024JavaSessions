package javasessions.class11.assignment;

public class User2 {
	String name;
	int age;
	String city;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User2 u1=new User2();
		u1.name="Veena";
		u1.age=30;
		u1.city="Pune";
		
		User2 u2=new User2();
		u2.name="Piyush";
		u2.age=35;
		u2.city="Bangalore";
		
		User2 u3=new User2();
		u3.name="Suma";
		u3.age=40;
		u3.city="LA";
		
		User2 u4=new User2();
		u4.name="Ayesha";
		u4.age=39;
		u4.city="Kolkata";
		
		System.out.println(u1.name+" "+u1.age+" "+u1.city);//Veena
		System.out.println(u2.name+" "+u2.age+" "+u2.city);//Piyush
		System.out.println(u3.name+" "+u3.age+" "+u3.city);//Suma
		System.out.println(u4.name+" "+u4.age+" "+u4.city);//Ayesha
		System.out.println("============================");
		
		u1=u2=u3=u4;
		
		System.out.println(u1.name+" "+u1.age+" "+u1.city);//Ayesha
		System.out.println(u2.name+" "+u2.age+" "+u2.city);//Ayesha
		System.out.println(u3.name+" "+u3.age+" "+u3.city);//Ayesha
		System.out.println(u4.name+" "+u4.age+" "+u4.city);//Ayesha
		System.out.println("============================");
		
	}
}
