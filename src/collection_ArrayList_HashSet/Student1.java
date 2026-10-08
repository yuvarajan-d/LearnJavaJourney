package collection_ArrayList_HashSet;

import java.util.ArrayList;

public class Student1 {
	
	int rollNo;
	String name;
	double mark;
	
	Student1(int rollNo, String name, double mark){
		this.rollNo=rollNo;
		this.name=name;
		this.mark=mark;		
	}
	
	void display() {
		System.out.println("Roll N0: "+rollNo+", Name: "+name+", Mark: "+mark);
	}
	
	public static void main(String args[]) {
		ArrayList<Student1> students=new ArrayList<Student1>();
		students.add(new Student1(101,"yuvaraj",85));
		students.add(new Student1(102, "Hemanth", 72));
		students.add(new Student1(103, "Arun", 91));
		students.add(new Student1(104, "Kumar", 68));
		students.add(new Student1(105, "Priya", 88));
		
		System.out.println("All Students");
		
		for(Student1 S:students) {
			S.display();
		}
		
		Student1 highest=students.get(0);
//		System.out.println(highest.mark);
		for(Student1 S:students) {
			if(S.mark>highest.mark) {
				highest=S;
			}
		}
		System.out.println("\nStudent with Highest Mark: ");
		highest.display();
	}

}
