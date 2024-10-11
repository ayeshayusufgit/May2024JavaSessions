package javasessions.class4;

public class IncrementAndDecrementOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//++ (increment) and --(decrement) operators
		
		//1.post increment
//		int a = 1;
//		int b = a++; //the original value of "a" will be assigned to "b" first
//				   	 //then the value of "a" will be incremented	
//					
//		System.out.println(a);  //2
//		System.out.println(b);	//1
//		
//		int c = -98;
//		int d = c++;
//		
//		System.out.println(c);	//-97
//		System.out.println(d);	//-98
//		
//		//2.pre increment
//		int f = 1;
//		int g = ++f; //the value of "f" will be incremented by 1 first
//		   		   	 //then the value of "f" will be assigned to "g"
//		
//		System.out.println(f);	//2
//		System.out.println(g);	//2
//		
//		int r = -100;
//		int t = ++r;
//		System.out.println(r);	//-99
//		System.out.println(t);	//-99
//		
//		int h = -48;
//		int l = ++h;
//		System.out.println(h);	//-47
//		System.out.println(l);	//-47
//		
//		//3.post decrement: -- decrease the value by 1
//		int m = 2;
//		int n = m--;	//the original value of "m" will be assigned to "n" first
//	   	 				//then the value of "m" will be incremented
//		System.out.println(m);	//1
//		System.out.println(n);	//2
//		
//		int total = 10;
//		System.out.println(total++);	//10
//		System.out.println(total);      //11
//		
//		int fee = 100;
//		System.out.println(fee--);	//100
//		System.out.println(fee);	//99
//		
//		//4.pre decrement:	-- decrease the value by 1
//		int v = 2;
//		int z = --v;
//		System.out.println(v);	//1
//		System.out.println(z);	//1
//		
//		int num=10;
//		System.out.println(--num);//9
//		System.out.println(num);//9
//		
//		int i=11;
//		int j=i++ + ++i;
//		System.out.println(i);//13
//		System.out.println(j);//24
		
		
//		int a=11, b=22, c;
//		c = a + b + a++ + b++ + ++a + ++b;
//		//  11 + 22 + 11 + 22 + 13 + 24;
//		
//		System.out.println("a="+a);//13
//		System.out.println("b="+b);//24
//		System.out.println("c="+c);//103
		
		
//		 int i = 0;
//		 int j = i++ - --i + ++i - i--;
//		 // j1 =  0 - 0 + 1 - 1 = 0
//		 System.out.println(i);//0
//		 System.out.println(j);//0
		 
		 
//		 int m = 0, n = 0;
//		 int p = --m * --n * n-- * m--;
//		 //  p1 = -1 * -1 * -1 * -1 = 1 
//		 System.out.println(m);//-2
//		 System.out.println(n);//-2
//		 System.out.println(p);//1
		
//		int a = 1;
//		int b = a++ + ++a * --a - a--;
//		// b2  =  1   +    3 *    2 - 2;  
//		System.out.println(a); //1 
//		System.out.println(b); //5
		
//		int a = 11++; //invalid , cannot perform an operation(post increment) on a value  
//		System.out.println(a);		
		
		//ascii from a-z
		//ascii from A-Z
//		int ch='A';
//		System.out.println(ch++);//65
//		System.out.println(ch);//66
		
//		char ch='A';
//		System.out.println(ch++);//A
//		System.out.println(ch);//B
		
//		int d = (9)++;//no increment or decrement operation can be performed on a value
		
//		double d=1.2;
//		System.out.println(++d);//2.2, increment n decrement can be applied on double 
//		System.out.println(d);//2.2
		
//		System.out.println('a'++); // invalid as ++ n -- cannot be performed on values
		
//		char c = 'a';//ascii values 97
//		System.out.println(c++);//97=>'a' (internally calculated on the bases of ascii value)
//		System.out.println(c);//98=>'b'
		
//		char v='b';
//		System.out.println(v++);	//'b'
//		System.out.println(v);	//'c'
//		System.out.println((int)v);	// 'c' => 99
//		System.out.println((byte)v);	// 'c' => 99
		
//		char ch='z'; //'z' => 122 
//		System.out.println(++ch); //'{' => 123
		
		int s= 65000;
		//nearest character corresponding to the ascii value, if no character matches then a NumberFormatException comes
		System.out.println((char)s);
		
		//++ and -- cannot be performed on strings but can be performed only on numeric datatypes
		
//		String sss="Naveen";
//		System.out.println(sss++); -- n ++ cannot be performed on Strings results in an Error
		
		char th='a';
		short sh=(short)th; //since it is narrowing it has to be explicitly typecasted
		System.out.println(sh);
		
	}

}
