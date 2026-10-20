package string_stringbuilder_stringbuffer_practice;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String studentName=null;
		Optional<String> name=Optional.ofNullable(studentName);
		
		System.out.println(name.orElse("Student name not available"));

	}

}
