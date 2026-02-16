package Week3.Ques6;

import java.util.concurrent.CountDownLatch;

/* Simulate a relay race where each runner (thread) has to wait for the previous
runner to finish before starting. Use CountDownLatch to ensure that the second runner
starts only after the first runner finishes, and so on.

Objective: Learn how to use CountDownLatch to coordinate between threads where
some threads need to wait for others to finish.*/

public class RelayRace implements Runnable{

	private final CountDownLatch wait;
	private final String name;
	private final CountDownLatch next;
	
	RelayRace(String name, CountDownLatch latch2, CountDownLatch latch){
		
		this.wait=latch2;
		this.next = latch;
		this.name=name;		
	}
	
	
	@Override
	public void run() {
		try {
			// wait for previous runner latch to become 0
			if(wait != null) {
				wait.await();
			}
			
			System.out.println(name + " has started running");
		 
	        Thread.sleep(1500);
	        System.out.println(name + " has finished running");
	            
		} 
	     catch (InterruptedException e) {
	    	 e.printStackTrace();
	     }
		
		if(next != null) {
        	next.countDown();          // for countdown to become 0
        }
          
		
	} 

}
