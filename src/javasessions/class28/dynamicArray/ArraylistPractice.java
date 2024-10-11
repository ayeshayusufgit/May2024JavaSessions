package javasessions.class28.dynamicArray;

import java.util.ArrayList;

public class ArraylistPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ar=new ArrayList();//vc=10,pc=0
		
		System.out.println(ar.size());//vc=10,pc=0, size=0
		ar.add(100);//index=0, when the value is added the size of the ArrayList increases by 1
		ar.add(200);//index=1
		ar.add(300);//index=2
		ar.add(400);//index=3
		
		System.out.println(ar.size());//size=4
		
		
//		ar.remove(2);//when the value is removed from the ArrayList at index=2, the ArrayList size will shrink to 3
//		ar.remove(0);//when the value is removed from the ArrayList at index=2, the ArrayList size will shrink to 2
//		
//		System.out.println(ar.size());//size is 2
		
		System.out.println(ar.get(1));//gets the value from the ArrayList of index 2 ie 200
		 
//		ar.remove(1);//removes the index 1 and shifts the 2nd index to the 1st index
//		
//		System.out.println(ar.get(1));//gets the value from the ArrayList of index 2 ie 300
		
		//print all the values of the ArrayList
		
		//1st method:
		System.out.println(ar);
		
		//2nd method:
		for(int i=0;i<ar.size();i++) {
			
		}
		
	}

}
