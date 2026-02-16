package Week3.Ques6;

/* Simulate a relay race where each runner (thread) has to wait for the previous
runner to finish before starting. Use CountDownLatch to ensure that the second runner
starts only after the first runner finishes, and so on.

Objective: Learn how to use CountDownLatch to coordinate between threads where
some threads need to wait for others to finish.*/

import java.util.concurrent.CountDownLatch;

public class Trigger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	RelayRace race = new RelayRace();
		int count = 3;
		CountDownLatch latch = new CountDownLatch(count);
		
		
	//	Thread t2 = new Thread(race);
	//	Thread t3 = new Thread(race);
		

        for (int i = 0; i < count; i++) {
        	Thread t1 = new Thread(new RelayRace(latch));  
        	
        	t1.start();
        }
		
        try {
            latch.await(); 
        } 
        catch (InterruptedException e) {
            e.printStackTrace();
        }
	}

}
