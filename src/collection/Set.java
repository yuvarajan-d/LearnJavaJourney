package collection;

import java.util.HashSet;

public class Set {

	//set=> Hashset => doesn't follow index order, and doesn't allow duplicate values
	// remove elements using data not index
	
	public void hashset() {
		
		HashSet<Integer> hashset=new HashSet<Integer>();
		hashset.add(10);
		hashset.add(20);
		hashset.add(10);
//		hashset.remove(10);
//		hashset.clear();
		System.out.println(hashset);
		System.out.println(hashset.size());
		
		for(Integer i:hashset) {
			System.out.println(i);
		}
	}
	
	public static void main(String args[]) {
		Set s=new Set();
		s.hashset();
	}
}
