package oops;

public class Calculator {
	
	// Methods => add, sub, mul, div
	
	int add(int a, int b) {
		return a+b;
	}
	
	int sub(int a, int b) {
		return a-b;
	}
	int mul(int a, int b) {
		return a*b;
	}
	float div(int a,int b) {
		return a/b;
	}
	String AddtwoString(String a, String b) {
		return a+b;
	}
	static void message() {
		System.out.println("Hello java");
	}
	
	// constructor
	Calculator(int n1, int n2){
		System.out.println("Constructor: "+(n1+n2));
	}
	

}
