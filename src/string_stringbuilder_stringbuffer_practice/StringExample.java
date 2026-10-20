package string_stringbuilder_stringbuffer_practice;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// String is Immutable in java
		// Once a String object is created, it's value cannot be changed.
		// Any Operation such as concatenation, replace(), or toUppercase() creates a 
		// new String object instead of modifying the existing one.
		
		String str = "Java";
		System.out.println("Original String: "+str);
		
		str=str+" Programming";
		System.out.println("Updated String: "+str);

	}

}
