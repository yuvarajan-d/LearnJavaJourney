package datatypes;

public class Typesofdata {

	void primitive() {
		// primitive data types => byte, short, int, float, double , char, boolean, long
		
				// Numeric data types
				// =>INTEGER
				byte age=127; // -128 to 127
				System.out.println("age : "+age);
				
				short noofdays=365;
				System.out.println("NoOfDays : "+noofdays);
				
				int pincode=603130;
				System.out.println(pincode);
				
				long phno=8610109627L;
				System.out.println(phno);
				
				// =>Floating points
				float mark=75.75F;
				System.out.println(mark);
				
				double salary=250000.87888D;
				System.out.println(salary);
				
				//Non-Numeric Data types
				boolean pass=true;
				System.out.println(pass);
				
				char options='a';
				System.out.println(options);
	}
	
	void nonprimitive() {
		String email="yuva@gmainl.com";
		System.out.println(email);
	}
}
