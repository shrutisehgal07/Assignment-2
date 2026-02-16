package Week3.Ques2;

/*Implement a counter that can be accessed by two threads: one thread
increments the counter, and another thread reads its value.

Objective: Demonstrate the effect of the volatile keyword in ensuring variable
visibility between threads.
*/

public class Job implements Runnable {

	volatile int count = 1;
	@Override
	public void run() {
		counter();
		
	}
	
	public void counter() {
		for(int i=0;i<=3;i++) {
			count++;
			System.out.print(Thread.currentThread().getName());
			System.out.println(" Count is: " + count);
			try {
				Thread.sleep(200);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
