package string_stringbuilder_stringbuffer_practice;

public class Outer {
	
	class Inner{
		void displayStudents() {
			System.out.println("Student Details:");
			System.out.println("Roll No: 101");
			System.out.println("Name: Yuvarajan D");
			System.out.println("Department: CSBS");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		inner.displayStudents();

	}

}
