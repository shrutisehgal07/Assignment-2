package Week3.Ques10;

/*You are required to implement a Producer-Consumer system using two
threads. The Producer thread should generate items (in this case, integers) and the
Consumer thread should consume these items. The producer should wait if the buffer
(queue) is full, and the consumer should wait if the buffer is empty*/

import java.util.*;

public class ProducerConsumer extends Thread {
	
	Queue<Integer> buffer = new LinkedList<>();
	private static final int MAX_SIZE= 5;
	int val=0;
	
	public synchronized void producer(int val) throws InterruptedException{    //producer thread for generation
		
		while(buffer.size() >= MAX_SIZE) {
			wait();
		}
		
		buffer.add(val);
		System.out.println("Item produced: " + val);
		
		notify();
	}
	
	public synchronized void consumer() throws InterruptedException{        // consumer thread to consume
		 
		while(buffer.isEmpty()) {
			wait();
		}
		
		int item = buffer.remove();
		System.out.println("Items consumed are: " + item);
		
		notify();
		
	}

}
