package Week3.Ques10;

/*You are required to implement a Producer-Consumer system using two
threads. The Producer thread should generate items (in this case, integers) and the
Consumer thread should consume these items. The producer should wait if the buffer
(queue) is full, and the consumer should wait if the buffer is empty*/

public class Trigger {

	public static void main(String[] args) {
		
		ProducerConsumer pc1 = new ProducerConsumer();   
	  
		Thread producer = new Thread(() -> {
			try {
				for(int i=0;i<5;i++) {
					pc1.producer(i);
				}
			}
			catch(Exception e) {
				
			}
		});
		
		Thread consumer = new Thread(() ->{
			try {
				for(int i=1;i<=5;i++) {
					pc1.consumer();
				}
			}
			catch(Exception e) {
				
			}
		});
		
		producer.start();
		consumer.start();
	}

}
