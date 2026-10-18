package filehanding_and_collection_praactice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//  To remove duplicate values from the list use HashSet.
		ArrayList<Integer> numbers =  new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(10);
		numbers.add(30);
		numbers.add(20);
		System.out.println("ArrayList: "+numbers);
		HashSet<Integer> uniqueNumbers = new HashSet<Integer>(numbers);
		System.out.println("Unique Numbers: "+uniqueNumbers);
		
		System.out.println("");
		
		// To store student roll numbers and names as key-value pairs, use a HashMap 
		HashMap<Integer, String> students = new HashMap<Integer, String>();
		students.put(101, "Yuvarajan");
		students.put(102, "HemnathRaj");
		students.put(103, "Arun");
		
		System.out.println(students);
		
		System.out.println("");
		
		// To store the numbers in ascending order, use TreeSet
		
		TreeSet<Integer> nums = new TreeSet<Integer>();
		nums.add(40);
		nums.add(10);
		nums.add(30);
		nums.add(20);
		
		System.out.println(nums);

	}

}
