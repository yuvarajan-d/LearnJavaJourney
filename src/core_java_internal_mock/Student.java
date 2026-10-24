package core_java_internal_mock;

public class Student {
	
	int studentID;
	String name;
	double marks;
	
	public Student(int studentID, String name, double marks) {
		// TODO Auto-generated constructor stub
		this.studentID=studentID;
		this.name=name;
		this.marks=marks;
	}
	
	void displayDetails() {
		System.out.println("StudentID: "+studentID);
		System.out.println("Name: "+name);
		System.out.println("Marks: "+marks);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student(121,"Yuvarajan", 87);
		s.displayDetails();

	}

}
