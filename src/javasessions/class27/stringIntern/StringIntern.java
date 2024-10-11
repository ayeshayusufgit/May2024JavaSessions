package javasessions.class27.stringIntern;

//1.
public class StringIntern {

	//Interview Q:What is the purpose of intern?
	//For the backward compatibility of legacy code, somebody has written java code 10 yrs ago some object have been created(as below) 
	//in that case i want to intern some important string and use it with a reference variable in my code wo disturbing the string str
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String str=new String("hello java");//2 objects will be created 1 in the heap n 1 in the SCP
		String s1=str.intern();//if there are no references in the SCP of a string object then it can be made to point with a reference ex s1
		String s2=str.intern(); 
		
		System.out.println(str);
		System.out.println(s1);
		System.out.println(str==s1);
		System.out.println(str.equals(s1));
		
		
		

	}

}
