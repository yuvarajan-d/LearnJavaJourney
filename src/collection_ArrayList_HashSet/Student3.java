package collection_ArrayList_HashSet;

import java.util.HashSet;
import java.util.Objects;

public class Student3 {
	
	int rollNo;
	String name;
	String department;
	
	public Student3(int rollNo,String name, String department) {
		// TODO Auto-generated constructor stub
		this.rollNo=rollNo;
		this.name=name;
		this.department=department;
	}
	public Student3() {
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public int hashCode() {
		return Objects.hash((rollNo));
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student3 other = (Student3) obj;
		return rollNo == other.rollNo;
	}
	
	void display() {
		System.out.println("Roll No: "+rollNo+" Name: "+name+" Department: "+department);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Student3> students=new HashSet<Student3>();
		students.add(new Student3(101, "Yuvaraj", "CSBS"));
		students.add(new Student3(102,"Hemanth","CSE"));
		students.add(new Student3(103, "Arun", "ECE"));
		students.add(new Student3(104,"Priya","IT"));
		students.add(new Student3(101, "kumar", "EEE"));
		
		System.out.println("Students: ");
		for(Student3 student:students) {
			student.display();
		}

	}

}
