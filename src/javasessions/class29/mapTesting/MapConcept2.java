package javasessions.class29.mapTesting;

import java.util.HashMap;

public class MapConcept2 {
	
	//DataStructure: the way the data is maintained
	//Array:
	//ArrayList:
	//Hashmap:
	
	public static void main(String[] args) {

		//<null,value>, null key will be always stored in the first position
		//the default capacity for hashmap is 15
		
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		map.put("chrome", 101);
		map.put("firefox", 96);
		map.put("edge", 111);
		
		//Hashmap can be created with any combination of key n value datatype
		HashMap<Integer, Integer> map1=new HashMap<Integer, Integer>();
		map1.put(100, 1);
		
		
		HashMap<String, Object> data=new HashMap<String, Object>();
		data.put("name","veena");
		data.put("age",35);
		data.put("designation", "SDET2");
		data.put("isperm", true);
		data.put("gender",'f');
		data.put(null,"Pune");
		//data.put(null,"India");
		data.put("phone", null);
		data.put("city", null);
		//data.put(null, null);
		data.put("address", "");
		//data.put("", "32.33");
		//data.put("age",37);
		
		
		System.out.println(data.get("name"));
		System.out.println(data.get("age"));
		System.out.println(data.get("designation"));
		System.out.println(data.get("isperm"));
		System.out.println(data.get("gender"));
		System.out.println(data.get("phone"));//null, if a key is not found then null is returned
		System.out.println(data.get(null));//null can be added as a key in the hashmap
		System.out.println(data.get("phone"));//null, value is returned
		System.out.println(data.get("city"));//null, value is returned
		System.out.println(data.get("address"));
		System.out.println(data.get(""));
		
		System.out.println("================================================");
		System.out.println(data);
		
		HashMap<String , Integer> empMap= new HashMap<String, Integer>();
		empMap.put("Tom", 20);
		empMap.put("Veena", 30);
		empMap.put("Sunil", 35);
		empMap.put("Pradesh", 45);
	}
}
