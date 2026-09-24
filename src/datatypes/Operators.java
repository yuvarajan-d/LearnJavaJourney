package datatypes;

import java.util.Scanner;

public class Operators {
	
	Scanner sc = new Scanner(System.in);
	
	void arithmetic() {
		int a=20;
		int b=10;
		System.out.println(a+b);
		
		
		System.out.println("Enter the first number: ");
		int num1=sc.nextInt();
		System.out.println("Enter the second number: ");
		int num2=sc.nextInt();
		System.out.println(num1+num2);
		System.out.println(num1-num2);
	}
	void addtwoString() {
		
//		System.out.println("Enter the first letter: ");
//		String s1=sc.next();
//		System.out.println("Enter the second letter: ");
//		String s2=sc.next();
//		System.out.println(s1+" "+s2);
		
		
//		System.out.println("Enter the first letter: ");
//		String l1=sc.nextLine();
//		System.out.println("Enter the second letter: ");
//		String l2=sc.nextLine();
//		System.out.println(l1+" "+l2);
		
		System.out.println("Enter the rollno: ");
		int l1=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the namer: ");
		String l2=sc.nextLine();
		System.out.println(l1+" "+l2);
	}

	void muldivmodules() {
		int a1=10,b1=20,c1=30;
		System.out.println("Multiply : "+a1*b1);
		System.out.println("Div : "+c1/a1);
		System.out.println("Modules : "+ a1%b1);
		
	}
	
	// assignment operators => =, +=, -=, *=, /=, %=
	public void total() {
		int amount=100;
		amount=50;
		amount+=100;
		amount*=2;
		amount/=2;
		amount%=7;
		System.out.println(amount);
	}
	
	// Relational or comparison operator => ==, !=, .equals
	
	public void comparison() {
		int a=30;
		int b=30;
		System.out.println(a==b);
		System.out.println(a!=b);
		
		String s1="hello";
		String s2="hello";
		System.out.println(s1==s2);
		
		String a1=new String("hello");
		String a2=new String("hello");
		System.out.println(a1==a2);
		System.out.println(a1.equals(a2));
	}
	
	
	// logical operators => &&, ||, !
	public void logical() {
		int a=10;
		int b=20;
		System.out.println("AND gate : " +(a<=b && a!=b));
		System.out.println("OR gate : " +(a==b || a!=b));
	}
	
	// bitwise operators
	void bitwise() {
		int a=5; // 00110101
		int b=7; // 00110111
		
		// and gate 00110101
		// or gate  00110111
		// xor gate 00000010
		
		System.out.println("and gate : "+(a&b));
		System.out.println("or gate : "+(a|b));
		System.out.println("and gate : "+(a^b));
		
		String P="b";
		System.out.println(P.codePointAt(0));// return the ascii value
	}
	
	// increment and decrement operators
	public void inanddec() {
		int a=90;
		System.out.println(a++);
		System.out.println(a);
		System.out.println(++a);
		System.out.println(a--);
		System.out.println(a);
		System.out.println(--a);
	}
}
