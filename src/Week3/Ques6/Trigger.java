package Week3.Ques6;

/* Simulate a relay race where each runner (thread) has to wait for the previous
runner to finish before starting. Use CountDownLatch to ensure that the second runner
starts only after the first runner finishes, and so on.

Objective: Learn how to use CountDownLatch to coordinate between threads where
some threads need to wait for others to finish.*/

import java.util.concurrent.CountDownLatch;

public class Trigger {

	public static void main(String[] args) {

	//	RelayRace race = new RelayRace();
	
		CountDownLatch latch1 = new CountDownLatch(1);
		CountDownLatch latch2 = new CountDownLatch(1);
		CountDownLatch latch3 = new CountDownLatch(1);
		
		
	//	Thread t2 = new Thread(race);
	//	Thread t3 = new Thread(race);
		
		Thread t1 = new Thread(new RelayRace( "Runner 1", null,latch1));
		Thread t2 = new Thread(new RelayRace("Runner 2", latch1, latch2));  
		Thread t3 = new Thread(new RelayRace("Runner 3", latch2, latch3));  
		Thread t4 = new Thread(new RelayRace("Runner 4", latch3, null));  
        	
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        
	}

}
