package javasessions.class27.stringIntern;

//1.
public class StringIntern2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String s=new String("hello java");//2 objects in in the heap n the other in the SCP
		String s1=s;
		
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s==s1);
		System.out.println(s.equals(s1));
		
		
		

	}

}
