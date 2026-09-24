package oops;

import java.util.Scanner;

public class Polymorphism {
	
	// perform same class=> method overloading
	
	void arithmetic() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Value1: ");
		int a=sc.nextInt();
		System.out.println("Value2: ");
		int b=sc.nextInt();
		System.out.println(a+b);
	}
	
	void arithmetic(int a, int b) {
		System.out.println(a-b);
	}
	
	void arithmetic(float a, float b) {
		System.out.println(a*b);
	}
	
	void arithmetic(int a, int b, int c) {
		System.out.println(a+b+c);
	}

}
