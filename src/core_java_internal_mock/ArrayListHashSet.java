package core_java_internal_mock;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListHashSet {
	public static void main(String[] args) {
		
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(20);

        System.out.println("ArrayList: " + list);

        HashSet<Integer> set = new HashSet<>(list);

        System.out.println("After removing duplicates: " + set);
    }

}
