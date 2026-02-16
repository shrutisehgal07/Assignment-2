package Week3.Ques5;

/*Create a program that processes a list of tasks (e.g., file downloads, image
processing) using a thread pool. The program should dynamically allocate a fixed
number of worker threads to complete the tasks.

Objective: Implement a thread pool using ExecutorService and understand the
benefits of reusing threads for multiple tasks.
*/

public class Tasks implements Runnable{
	
	int taskId;
	
	
	
	Tasks(int taskId){
		this.taskId=taskId;   // we used taskId because it will be unique and easy to check in future
	}

	@Override
	public void run() {
		System.out.println("The task running is: " + taskId + " " + Thread.currentThread().getName());
		
		try {
			Thread.sleep(100);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		// we use try catch because it handles sleep operation else InterruptesException may occur
	}

}
