package Week3.Ques7;

/*Write a program that simulates a resource that can be accessed by multiple
threads, but only one thread at a time can modify it. Use ReentrantLock to ensure
that each thread gets exclusive access to the resource.

Objective: Explore the functionality of ReentrantLock compared to synchronized,
including features like fairness and lock reentrancy*/

import java.util.concurrent.locks.ReentrantLock;
public class Resource {

	private final ReentrantLock lock = new ReentrantLock();
	
	 public void useResource() {
		 
		 System.out.println(Thread.currentThread().getName());
		 
	        lock.lock();  // this is to acquire the manual lock
	        
	        try {
	            System.out.println(Thread.currentThread().getName() + " is using the resource");
	        } 
	        catch(Exception e) {
	        	Thread.currentThread().interrupt();
	        }
	        finally {
	            lock.unlock();  // this is to release the lock manually
	        }
	    }
	
}
