package javasessions.class4;

public class TypeCastingConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//byte<short<int<long<float<double
		
		byte b=10;
		short s=b;	//widening:Converting a lower datatype to a higher datatype
					//widening happens automatically so we say as auto widening
					//byte value can be stored in a short variable
		
		System.out.println(s);
		
		short s1 = 200;
		byte b1=(byte)s1; 	//narrowing: Converting a higher datatype to into a lower datatype 
							//here we are loosing the data
							//narrowing has to be done explicitly with brackets (byte)
							//the short value needs to forcefully converted ow results in an Compilation Error
		System.out.println(b1);//o/p is -56, the range of byte is -128 to 127 

		
		short s2=10;
		byte b2=(byte)s2;
		System.out.println(b2);//narrowing happens but there is no loss of data
							   //since byte can store values between the range -128 to 127, 10 falls within the range
							   //thus o/p is 10
		
		byte t1=10;
		int i=t1;			//auto-widening
		System.out.println(i); 
		
		int j=1000;
		byte k=(byte)j;			//explict narrowing
								//1000 should be got in the range of byte(256=128+127)
		System.out.println(k);  //-24=1000-256-256-256-256
		
		//practically narrowing is not used only widening is
		
		int p=100;
		float f=p;	//widening
		System.out.println(f); //100
		
		float f1=12.33f;//f has to be put for float numbers
		int p1=(int)f1;//narrowing
		System.out.println(p1);
		
		int d=10000;
		double dd=d;//widening
		System.out.println(dd);
		
		char ch='a';//97
		int w=ch;	//widening
		System.out.println(w); //	o/p	=>	97
		
//		int v=97;
//		char cg=(char)v; //narrowing
//		System.out.println(cg);
		
//		byte v=97;
//		char cg=(char)v; //narrowing
//		System.out.println(cg);
		
		
		int v=1200;
		char cg=(char)v; //narrowing
						 //there is no character of ascii value 1200
						 //1200 will be the unicode of Ұ
		
		System.out.println(cg);
		
		//if there is a narrowing of data and if there value is not within the range then there will be a loss of data
		
	}

}
