package javasessions.class13;

public class Browser2 {
	
	//In this case which function will be called when the getNumber(int a) is commented?
	//The preference will be given to the getNumber(int)
	//By default the java compiler will always consider the 100 as integer 
	//the getNumber(int) will be matched and called
	public void getNumber(byte a) {
		System.out.println("Hi byte:"+a);
	}
	
	public void getNumber(short a) {
		System.out.println("Hi short:"+a);
	}
	
//	public void getNumber(int a) {
//		System.out.println("Hi int:"+a);
//	}
	
	public void getNumber(long a) {
		System.out.println("Hi long:"+a);
	}
	
	public void getNumber(float a) {
		System.out.println("Hi float:"+a);
	}
	
	public void getNumber(double a) {
		System.out.println("Hi double:"+a);
	}
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Browser2 obj=new Browser2();
		
		obj.getNumber(100);//since the int version of getNumber(int) is commented, then it will call getNumber(long)
				
		obj.getNumber('a');//ascii value of 'a' will be 97, the characters will be stored in int by default which 
						   //will get automatically upcasted to long and getNumber(long) will be called
		obj.getNumber((short)100);//will call the getNumber(short)
		obj.getNumber((short)'a');//will call the getNumber(short)
		obj.getNumber((byte)'a');//will call the getNumber(byte)
		
	}

}
