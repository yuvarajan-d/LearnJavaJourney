package collection;

import java.util.ArrayList;

public class List {
	
	// collection => Non-primitive data types
	// List => ArrayList, LinkedList, Vector
	// collections comes under until package
	
	
	// array=> insertion order will be follow and allow duplication
	public void Arraylist() {
		ArrayList<Integer> arraylist=new ArrayList<Integer>();
		arraylist.add(10);
		arraylist.add(20);
		arraylist.add(30);
		arraylist.set(0, 25);
		arraylist.remove(0);
		
		ArrayList<String> S = new ArrayList<String>();
		S.add("Yuvaraj");
		S.add("Hemathraj");
		S.add("Arun");
		S.add("Tamizh");
		S.add("kumar");
		S.set(3, "Vishal");
		S.remove(4);
		
//		ArrayList<Float> F =new ArrayList<Float>();
		
 		
		System.out.println("string size: "+S.size());
		System.out.println(S);
		System.out.println(S.get(0));
		System.out.println(S.getFirst());
		System.out.println(S.getLast());
		System.out.println(S.isEmpty());
		
		System.out.println("");
		
		System.out.println(arraylist.get(0));
		System.out.println(arraylist);
		System.out.println("Size: "+arraylist.size());
		System.out.println(arraylist.contains(30));
		System.out.println(arraylist.indexOf(20));
		arraylist.clear();
		System.out.println(arraylist);
		
	}
	
	public void studentarraylist() {
		
		ArrayList<Studentinfo> student=new ArrayList<Studentinfo>();
		student.add(new Studentinfo("Yuvaraj",21,"Sairam"));
		student.add(new Studentinfo("Vishal",22,"Adiyaman"));
		student.set(1,new Studentinfo("Raj",22,"Sairam"));
		student.add(new Studentinfo("Arun",22,"sairam"));
		System.out.println("Name: "+student.get(0).getSname()+" Age: "+student.get(0).getAge()+" College: "+student.get(0).getClg());
		System.out.println("");
		for(Studentinfo S: student) {
			if(S.getSname()=="Yuvaraj") {
				S.setSname("Yuvarajan");
			}
			System.out.println(S.getSname()+" "+S.getAge()+" "+S.getClg());
		}
	}
	
	public void bankarraylist() {
		
		ArrayList<Bank> B = new ArrayList<Bank>();
		B.add(new Bank("velan",30000));
		B.add(new Bank("nirmal",35000));
		B.set(0, new Bank(B.get(0).getCustomername(),40000));
		for(Bank b:B) {
			System.out.println(b.getCustomername()+" "+b.getBalance());
		}
	}
	
	public static void main(String[] args) {
		List list =new List();
//		list.Arraylist();
//		
//		list.studentarraylist();
		
		list.bankarraylist();
	}

}
