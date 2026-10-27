package multithreading_practice;

public class Teacher extends Thread{
	ResultBoard board;
	
	public Teacher(ResultBoard board ) {
		// TODO Auto-generated constructor stub
		this.board=board;
	}
	
	public void run() {
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
		board.publishResult();
	}

}
