package collection_ArrayList_HashSet;

import java.util.ArrayList;
import java.util.Scanner;

public class Student2 {
	
	
	int rollNo;
	String name;
	String department;
	
	Student2(int rollNo, String name, String department){
		this.rollNo=rollNo;
		this.name=name;
		this.department=department;
	}
	
	void diplay() {
		System.out.println("Roll No: "+rollNo+", Name: "+name+", Department: "+department);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		ArrayList<Student2> students=new ArrayList<Student2>();
		students.add(new Student2(101,"yuvaraj","CSBS"));
		students.add(new Student2(102, "Hemanth", "CSE"));
		students.add(new Student2(103, "Arun", "ECE"));
		students.add(new Student2(104, "Kumar", "IT"));
		students.add(new Student2(105, "Priya", "EEE"));

		System.out.println("Enter Search RollNo Between this(101,102,103,104,105): ");
		int searchRollNo=sc.nextInt();
		boolean found=false;
		
		for(Student2 student:students) {
			if(student.rollNo==searchRollNo) {
				System.out.println("Student Found: ");
				student.diplay();
				found=true;
				break;
			}
		}
		if(!found) {
			System.out.println("Student Not Found");
		}
		
		sc.close();
	}

}
