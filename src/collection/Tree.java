package collection;

import java.util.TreeSet;

public class Tree {
	
	public void  tree() {
		TreeSet<Integer> T=new TreeSet<Integer>();
		T.add(10);
		T.add(57);
		T.add(34);
		System.out.println(T);
		T.remove(57);
		System.out.println(T);
		System.out.println(T.first());
		System.out.println(T.getFirst());
		System.out.println(T.getLast());
		System.out.println(T.size());
		T.clear();
		System.out.println(T);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tree t=new Tree();
		t.tree();
	}

}
