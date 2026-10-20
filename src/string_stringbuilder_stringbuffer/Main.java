package string_stringbuilder_stringbuffer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="arun";
		name.concat("kumar");
		System.out.println(name);
		
		StringBuilder sb=new StringBuilder("pen");
		sb.append("pencil");
		System.out.println(sb.charAt(0));
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.codePointAt(2));
		System.out.println(sb.indexOf("c"));
		
		StringBuffer sbb=new StringBuffer();
		sbb.append("ECE");
		
	}

}
