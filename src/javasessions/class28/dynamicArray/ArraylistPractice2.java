package javasessions.class28.dynamicArray;

import java.util.ArrayList;

public class ArraylistPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ar=new ArrayList();//vc=10,pc=0; this will be an AL of type Object and the default vc will be 10
		//the below warning is given
		//ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized
		//this means any type of data can be added
		
		System.out.println(ar.size());//vc=10,pc=0, size=0
		ar.add(100);//index=0, when the value is added the size of the ArrayList increases by 1
		ar.add(200);//index=1
		ar.add(300);//index=2
		ar.add(400);//index=3
		
		System.out.println(ar.size());//size=4
		
		System.out.println(ar.get(3));
		//System.out.println(ar.get(4));//IndexOutOfBoundException
		
		//The add(),get(),remove() work on the physical segments
		//we can traverse only from index 0 to 4
		
		//print all the values of the ArrayList
		
		//1st method:
		System.out.println(ar);
		
		//2nd method:index based loop
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));//100 200 300 400
		}
		
		
		
		//ArrayList of raw type allows all types of data to be added in
		ArrayList ls=new ArrayList();
		ls.add(100);
		ls.add(12.33);
		ls.add("testing");
		ls.add(true);
		ls.add('a');
		
		//ArrayList with Generics: will restrict to a certain type of data to be added only
		//Generics defines the kind of data the ArrayList can hold, only the wrapper class of the corresponding primitive can be used
		
		ArrayList<Integer> numList=new ArrayList<Integer>();//ArrayList can hold only integer data,vc=10,pc=0
		numList.add(100);
		numList.add(200);
		numList.add(300);
		//numList.add("testing");//gives error, can only add data of type integer
		numList.add(null);//null can be allowed in non primitive ArrayList
		//no NPE unless some operation is performed on it
		
		ArrayList<Double> marksList=new ArrayList<Double>();//ArrayList can hold only double data,vc=10,pc=0
		marksList.add(12.33);
		marksList.add(200.00);
		
		ArrayList<String> browserList=new ArrayList<String>();//ArrayList can hold only string data,vc=10,pc=0
		browserList.add("chrome");
		browserList.add("firefox");
		browserList.add("edge");
		
		//3rd method:foreach loop
		for(String browser:browserList) {
			System.out.println(browser);
			if(browser.equals("firefox")) {
				System.out.println("Pls enter url");
				break;
			}
		}
		
		ArrayList<Object> empDataList=new ArrayList<Object>();//ArrayList can hold all types of data,vc=10,pc=0
		empDataList.add("Tom");
		empDataList.add(30);
		empDataList.add(12.33);
		empDataList.add('m');
		empDataList.add(true);
		
		System.out.println(empDataList);
		
		for(Object e:empDataList) {
			System.out.println(e);
		}
		
		ArrayList<String> studentList=new ArrayList<String>();//vc=0,pc=0
		studentList.add(null);
		studentList.add("monika");//0
		studentList.add("monika");//0
		studentList.add("sunil");//1
		studentList.add("vibha");//2
		studentList.add("surya");//3
		studentList.add("sunil");//4, duplicate values are allowed in the ArrayList
		studentList.add(null);
		studentList.add(null);
		
		System.out.println(studentList);
//		studentList.remove(4);
//		System.out.println(studentList);
		
		//ArrayList of footers
		ArrayList<String> footerList=new ArrayList<String>(30);//vc=30 and pc=0 
		footerList.add("Contact Us");//0
		footerList.add("Help");//1
		footerList.add("Delivery Info");//2
		footerList.add("Returns");//3
		
		for(String e:footerList) {
			System.out.println(e);
			if(e.equals("Delivery Info")) {
				System.out.println("Click on it");
				break;
			}
		}
		
		
	}
}
