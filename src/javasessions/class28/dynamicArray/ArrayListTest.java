package javasessions.class28.dynamicArray;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//List(I)--->ArrayList(C) 
		//ArrayList actually implementing the List Interface
		
		//AL:maintains the index, the order in which the elements are added in it
		
		ArrayList ar=new ArrayList();//vc(virtual capacity)=10,pc(physical capacity)=0
		//if no values are supplied while creating the ArrayList then by default vc=10
		System.out.println(ar.size());//0(this is always check the physical capacity or pc which is 0)
		
		ar.add(100);//by default it will goto the 0th segment and 100 will be entered
		ar.add(200);//in the 1st index 200 will be entered 
		System.out.println(ar.size());//2(this is always check the physical capacity or pc which is 2);vc=8,pc=2
		//There are no method in java to check the physical capacity or pc
		//Since this is an index based collection the order or index will be maintained
		
		ar.add(300);//in the 2nd index 300 will be entered 
		ar.add(400);//in the 3rd index 400 will be entered and so on....
		System.out.println(ar.size());//4
		
		ar.add(500);
		ar.add(600);
		ar.add(700);
		ar.add(800);
		ar.add(900);
		ar.add(1000);//10 values are added, all the 10 segments are filled
		
		ar.add(1100);//before adding to the 10th index, the load factor(LF) will be calculated
		//a check is made on the current physical capacity(pc), LF=pc/2=10/2=5(vc) 
		//5 more virtual segments will be created and added to the ArrayList ar
		//1100 will be added to the 10th index
		ar.add(1200);
		ar.add(1300);
		ar.add(1400);
		ar.add(1500);
		
		ar.add(1600);//before adding to the 16th index, LF will be calculated
		//LF=pc/2=7.5=7(since 15 n 2 are integers),7 virtual segments will be created
		//1600 will be added in the 16th index
		
		ArrayList ar1=new ArrayList(5);//vc=5,pc=0
		//In this case 5 is supplied while creating the ArrayList() so virtual capacity or vc = 5
		
		ArrayList ar2=new ArrayList(50);//vc=50,pc=0
		//In this case 50 is supplied while creating the ArrayList() so virtual capacity or vc =50
		//Once 50 elements are added then the vc=0, pc=50
		//Before adding the 51st element in the 50th index the LF=pc/2=50/2=25 is calculated and 25 segments are added
		
		
		
	}

}
