package Week3.Ques6;

import java.util.concurrent.CountDownLatch;

/* Simulate a relay race where each runner (thread) has to wait for the previous
runner to finish before starting. Use CountDownLatch to ensure that the second runner
starts only after the first runner finishes, and so on.

Objective: Learn how to use CountDownLatch to coordinate between threads where
some threads need to wait for others to finish.*/

public class RelayRace implements Runnable{

	private final CountDownLatch latch;
	
	RelayRace(CountDownLatch latch){
		this.latch = latch;
	}
	
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " is in the waiting state");
		 try {
	            Thread.sleep(200); 
	            System.out.println(Thread.currentThread().getName() + " is running");
	        } 
	     catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		 //System.out.println();
		finally {
		latch.countDown(); 		   // it is used to decrease the count
		}
	} 

}
