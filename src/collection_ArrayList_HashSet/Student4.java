package collection_ArrayList_HashSet;

import java.util.Objects;
import java.util.HashSet;

public class Student4 {
	int rollNo;
	String name;
	String department;
	
	

	public Student4(int rollNo, String name, String department) {
		this.rollNo = rollNo;
		this.name = name;
		this.department = department;
	}

	public Student4() {
		
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(department, name, Integer.valueOf(rollNo));
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student4 other = (Student4) obj;
		return Objects.equals(department, other.department) && Objects.equals(name, other.name)
				&& rollNo == other.rollNo;
	}

	void display() {
		System.out.println("Roll No: "+rollNo+" Name: "+name+" Department: "+department);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  HashSet<Student4> students = new HashSet<Student4>();

	      students.add(new Student4(101, "Yuvaraj", "CSBS"));
	      students.add(new Student4(102, "Hemanth", "CSE"));
	      students.add(new Student4(103, "Arun", "ECE"));
	      students.add(new Student4(104, "Priya", "IT"));
	      students.add(new Student4(101, "Yuvaraj", "CSBS"));

	      System.out.println("Students in HashSet:");

	      for (Student4 s : students) {
	          s.display();
	      }
	}

}
