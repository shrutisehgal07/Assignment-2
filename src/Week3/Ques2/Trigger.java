package Week3.Ques2;

/*Implement a counter that can be accessed by two threads: one thread
increments the counter, and another thread reads its value.
Objective: Demonstrate the effect of the volatile keyword in ensuring variable
visibility between threads.
*/

public class Trigger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Job job = new Job();
		
		Thread counter = new Thread(job, "Increment count");
		Thread value = new Thread(job, "Read values");
		
		counter.start();
		value.start();
	}

}
