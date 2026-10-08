package string_math_method;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String Methods
		String S ="1Hello World";
		
		System.out.println(S.codePointAt(5));//ASCII value
		System.out.println(S.charAt(6));//Index
		System.out.println(S.concat(" "+S));
		System.out.println(S.replace("l", "i"));
		System.out.println(S.replaceAll("[0-9]", "Hi"));
		System.out.println(S.replaceFirst("l", "i"));
		System.out.println(S.repeat(2));
		System.out.println(S.length());
		System.out.println(S.contains("o"));
		System.out.println(S.substring(0,4));
		System.out.println(S.startsWith("H"));
		System.out.println(S.endsWith("d"));
		System.out.println(S.trim());
		System.out.println(S.lastIndexOf("l"));
		System.out.println(S.indexOf('l'));
		System.out.println(S.toLowerCase());
		System.out.println(S.toUpperCase());
		System.out.println(S.isBlank());//letter
		System.out.println(S.isEmpty());//letter and space
		System.out.println(S.split(S));
		System.out.println(S.equals(S));// content checking
		System.out.println(S.matches(S));// pattern checking
		
		System.out.println("");
		// Math Methods
		System.out.println(Math.PI);
		System.out.println(Math.abs(-9-3));//negative to positive(Difference)
		System.out.println(Math.floor(5.9));
		System.out.println(Math.round(3.5));
		System.out.println(Math.ceil(5.1));
		System.out.println(Math.floor(Math.random()*5));
		System.out.println(Math.min(3, 7));
		System.out.println(Math.max(7, 22));
		System.out.println(Math.E);
		System.out.println(Math.powExact(2, 3));
		System.out.println(Math.pow(3, 3));
	}

}
