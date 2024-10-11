package javasessions.class26.stringManipulation;

//3.
public class StringReverse {

	public static String reverse(String str) {
		//selenium
		
		//null check
		if(str==null) {
			throw new RuntimeException("Value cannot be null");
		}
		
		//length check
		if(str.length()==1||str.length()==0) {
			return str;
		}
		
		int len=str.length();
		String reverse="";
		for(int i=len-1;i>=0;i--) {
			reverse+=str.charAt(i);
		}
		//Do u want me to return with or wo space?w/o space then
		//return reverse.trim();
		return reverse;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="selenium";
		String m1=reverse(str);
		System.out.println(m1);
		
		System.out.println(reverse(str));
		System.out.println(reverse("T"));
		System.out.println(reverse(null));
		System.out.println(reverse(""));
		System.out.println(reverse(" "));
		//System.out.println(reverse(123)); this is not required to be handled
		System.out.println(reverse("123"));
		System.out.println(reverse("null"));
		System.out.println(reverse("testing "));
		
	}
}
