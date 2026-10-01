package classandinterface;

public class Child extends Parent implements Interface {

	public void stringlen(String name) {
		System.out.println(name.length());
	}
	
	public void stringadd(String a, String b) {
		System.out.println(a+" "+b);
	}
}
