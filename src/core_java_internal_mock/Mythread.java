package core_java_internal_mock;

class Mythread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
        	try {
    			System.out.println("Thread Method: "+i);
    			Thread.sleep(1000);
    		}catch(InterruptedException e){
    			System.out.println(e.getMessage());
    		}
        }
    }
    
    public static void main(String args[]) {
    	Mythread t1 = new Mythread();
		Mythread t2 = new Mythread();
		t1.start();
		t2.start();
    }
}
