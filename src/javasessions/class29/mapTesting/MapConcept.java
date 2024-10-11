package javasessions.class29.mapTesting;

import java.util.HashMap;

public class MapConcept {
	
	//DataStructure: the way the data is maintained
	//Array:
	//ArrayList:
	//Hashmap:
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Collection which holds the data in the form of key n value format is a HashMap
		//Hashmap implements the Map Interface
		//Its a non order based collection(does not maintain the order of elements added in the map)
		
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
		data.put(null,"India");//null key gets updated with India as value
		//we can have multiple null keys but only one null will get the latest value
		data.put("phone", null);
		data.put("city", null);
		data.put(null, null);//null key gets updated with null as value
		data.put("address", "");
		data.put("", "32.33");
		data.put("age",37);
		
		
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
		
		
		
		
		
		
		
		
	}

}
