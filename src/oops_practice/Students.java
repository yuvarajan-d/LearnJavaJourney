package oops_practice;

public class Students {
	
	String name;
	int rollNo;
	int mark;
	
	Students(String name,int rollNo, int mark){
		this.name=name;
		this.rollNo=rollNo;
		this.mark=mark;
	}
	void displatStudentDetails() {
		System.out.println("Name: "+name);
		System.out.println("RollNo: "+rollNo);
		System.out.println("Mark: "+mark);
		System.out.println("");
	}

}
