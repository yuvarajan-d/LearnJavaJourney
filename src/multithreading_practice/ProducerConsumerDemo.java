package multithreading_practice;

public class ProducerConsumerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProductStore store = new ProductStore();
		
		Consumer c1 = new Consumer(store, "Consumer-1");
		Consumer c2 = new Consumer(store, "Consumer-2");
		Consumer c3 = new Consumer(store, "Consumer-3");

		Producer producer = new Producer(store);
		
		c1.start();
		c2.start();
		c3.start();
		producer.start();
	}

}
