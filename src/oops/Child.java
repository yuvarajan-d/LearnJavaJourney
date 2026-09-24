package oops;

import java.util.Scanner;

public class Child extends Parent {
	Scanner sc=new Scanner(System.in);
	void findindex(String index) {
		System.out.println("What index you need to give: ");
		int indexno=sc.nextInt();
		System.out.println("String index: "+index.charAt(indexno));
	}

}
