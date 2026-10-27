package multithreading_practice;

public class NotifyAllDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ResultBoard board = new ResultBoard();
		
		Student s1 = new Student(board, "Student-1");
		Student s2 = new Student(board, "Student-2");
		Student s3 = new Student(board, "Student-3");
		
		Teacher teacher= new Teacher(board);
		
		s1.start();
		s2.start();
		s3.start();
		teacher.start();

	}

}
