package collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

public class Stack_Queue {
	
	
	public void stack() {
		
		Stack<Integer> ticketbooking=new Stack<Integer>();
		ticketbooking.push(10);
		ticketbooking.push(20);
		ticketbooking.push(30);
		ticketbooking.push(10);
		ticketbooking.pop();
		System.out.println(ticketbooking.peek());//return last element in stack
		System.out.println(ticketbooking);
	}
	
	public void queue() {
		Queue<String> foodorder = new LinkedList<String>();
		foodorder.add("yuvaraj");
		foodorder.add("raj");
		foodorder.add("arun");
		foodorder.poll();
		System.out.println(foodorder);
		System.out.println(foodorder.peek());//return first element in queue
	}
	
	public void dequeue() {
		Deque<Integer> trainbook = new ArrayDeque<Integer>();
		trainbook.add(10);
		trainbook.addFirst(1);
		trainbook.add(15);
		trainbook.removeFirst();
		trainbook.addLast(20);
		trainbook.removeLast();
		trainbook.add(10);
		trainbook.add(20);
		trainbook.pollLast();
		trainbook.pollFirst();
		trainbook.offer(30);
		trainbook.offerFirst(25);
		trainbook.offerLast(40);
		trainbook.remove(10);
		System.out.println(trainbook);
	}
	
	public void blockedqueue() {
		Queue<Integer> fixedsize=new LinkedBlockingQueue<Integer>(3);
//		fixedsize.add(1);// If I use add() method in linkedblockingqueue it throws exception and also doesn't provide output in runtime
		// to overcome this issue we use offer() method to handle exception and to print output.
//		fixedsize.add(2);
		fixedsize.offer(10);
		fixedsize.offer(20);
		System.out.println(fixedsize);
		System.out.println(fixedsize.size());
	}
	
	public void blockeddequeue() {
		Deque<Integer> fs=new LinkedBlockingDeque<Integer>(5);
		fs.offer(20);
		fs.offerFirst(10);
		fs.offerLast(30);
		fs.push(2);
		System.out.println(fs.peek());
		System.out.println(fs);
	}
	
	public void priorityqueue() {
		//follows min-heap algorithm
		PriorityQueue<Integer> queue=new PriorityQueue<Integer>();
		queue.add(32);
		queue.add(46);
		queue.add(21);
		queue.add(7);
		queue.add(60);
		queue.add(14);
		queue.add(3);
		queue.add(56);
		System.out.println(queue);
	}
	
	public void priorityqueuestring() {
		PriorityQueue<String> str=new PriorityQueue<String>();
		str.add("aaa");
		str.add("xxxzz");
		str.add("c");
		str.add("aaa");
		str.add("xxxzz");
		str.add("c");
		System.out.println(str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack_Queue sq=new Stack_Queue();
		sq.stack();
		sq.queue();
		sq.dequeue();
		sq.blockedqueue();
		sq.blockeddequeue();
		sq.priorityqueue();
		sq.priorityqueuestring();
	}

}
