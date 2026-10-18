package collection;

import java.util.Hashtable;
import java.util.Vector;

public class Vector_and_Hashtable {
	
	public void vector() {
		Vector<Integer> term=new Vector<Integer>();
		term.add(10);
		term.add(20);
		term.add(30);
		term.set(0, 5);
		term.add(20);
		System.out.println(term);
		System.out.println(term.indexOf(20));
		System.out.println(term.lastIndexOf(20));
	}

	public void hashtable() {
		Hashtable<Integer, String> student = new Hashtable<Integer, String>();
		student.put(101, "yuvaraj");
		student.put(102, "Raj");
		student.put(101, "yuvaraj");
		student.put(100, "arun");
//		student.replace("yuvaraj", "kumar");
		System.out.println(student);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector_and_Hashtable vh = new Vector_and_Hashtable();
		vh.vector();
		vh.hashtable();

	}

}
