package collection_ArrayList_HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

public class Student5 {
	
	int rollNo;
	String name;
	double mark;
	
	Student5(int rollNo, String name, double mark){
		this.rollNo=rollNo;
		this.name=name;
		this.mark=mark;		
	}
	
	public Student5() {
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
		Student5 other = (Student5) obj;
		return rollNo == other.rollNo;
	}
	
	void display() {
		System.out.println("Roll N0: "+rollNo+", Name: "+name+", Mark: "+mark);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student5> students=new ArrayList<Student5>();
		students.add(new Student5(101,"yuvaraj",85));
		students.add(new Student5(102, "Hemanth", 72));
		students.add(new Student5(103, "Arun", 91));
		students.add(new Student5(101, "Kumar", 68));
		students.add(new Student5(105, "Priya", 88));
		students.add(new Student5(102, "Sachin", 100));
		
		System.out.println("ArrayList: All Students");
		
		for(Student5 student: students) {
			student.display();
		}
		
		System.out.println(" ");
		
		HashSet<Student5> uniqueStudent=new HashSet<>(students);
		
		System.out.println("HashSet: UniqueStudents");
		
		for(Student5 student:uniqueStudent) {
			student.display();
		}

	}

}

