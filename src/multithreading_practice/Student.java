package multithreading_practice;

public class Student extends Thread {

	ResultBoard board;
	
	public Student(ResultBoard board, String name) {
		// TODO Auto-generated constructor stub
		this.board=board;
		setName(name);
	}
	
	public void run() {
		board.checkResult();
	}
}
