package collection;

import java.util.HashMap;
import java.util.TreeMap;


public class Map {

	public void hashmap() {
		HashMap<Integer, String> product=new HashMap<Integer, String>();
		product.put(1, "Pen");
		product.put(2, "pencil");
		product.put(3, "scale");
//		product.remove(3);
//		product.remove(1, "Pen");
		product.replace(1, "Ink pen");
		product.put(4, "Eraser");
		product.replace(1, "Ink pen", "Ball pen");
		System.out.println(product.containsKey(2));
		System.out.println(product.containsValue("scale"));
		System.out.println(product);
		System.out.println(product.get(2));
		System.out.println(product.values());//return only values
		System.out.println(product.keySet());//return only keys
		
		for(Integer key:product.keySet()) {
			System.out.println("Key: "+key);
		}
		for(String value:product.values()) {
			System.out.println("Values: "+value);
		}
		
		
		System.out.println("Return Both key and values: "+product.entrySet());
	}
	
	//---------------------------------------------------------------------------------------------
	
	public void hashtree() {
		
		TreeMap<String, Integer> student = new TreeMap<String, Integer>();
		student.put("kumar", 103);
		student.put("Arun", 101);
		student.put("Raj",102);
		System.out.println(student);
		System.out.println(student.firstKey());
		System.out.println(student.keySet());
		System.out.println(student.values());
		
	}
	
	public static void main(String args[]) {
		Map map = new Map();
		map.hashmap();
		map.hashtree();
	}
}

