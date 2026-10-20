package string_stringbuilder_stringbuffer_practice;

public class StringBuilderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// StringBuilder is mutable, meaning it's content can be changed without creating 
		// a new object each time
		
		StringBuilder report = new StringBuilder();
		report.append("Employee 1: Yuvarajan\n");
		report.append("Employee 2: Arun\n");
		report.append("Employee 3: HemanthRaj\n");
		
		System.out.println("Employee Report: ");
		System.out.println(report);

	}

}
