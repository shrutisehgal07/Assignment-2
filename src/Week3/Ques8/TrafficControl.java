package Week3.Ques8;

import java.util.concurrent.Semaphore;

/*Create a traffic control system where only 3 cars can pass through a tunnel at
the same time. Use a semaphore to limit the number of cars that can be in the tunnel
concurrently.

Objective: Learn how to use Semaphore to control access to a limited number of
resources in a multithreaded environment.
*/

public class TrafficControl {

	private final Semaphore semaphore = new Semaphore(3);  // 3 for specifically 3 cars
	/*  private final Semaphore semaphore = new Semaphore(3,true); 
	 * boolean in parameters tell in which order the threads arrived. So on FCFS permit will 
	 * be granted.
	*/
	public void pass() {
		try {
			semaphore.acquire(); // to acquire the lock 
			System.out.println(Thread.currentThread().getName() + " has entered the tunnel");
			Thread.sleep(3500); //considering the time it takes to pass the tunnel
			System.out.println(Thread.currentThread().getName() + " has exited the tunnel\n");
		} 
		catch (InterruptedException e) {
			System.out.println("Interrupted Exception was encountered.");
			//e.printStackTrace();
		}
		finally { // we can also do it without finally
			semaphore.release();  //releasing the acquired lock
		}
	}
}
