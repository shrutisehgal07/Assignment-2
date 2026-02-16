package Week3.Ques5;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*Create a program that processes a list of tasks (e.g., file downloads, image
processing) using a thread pool. The program should dynamically allocate a fixed
number of worker threads to complete the tasks.

Objective: Implement a thread pool using ExecutorService and understand the
benefits of reusing threads for multiple tasks.
*/

public class Trigger {

	public static void main(String[] args) {
		
		List<Tasks> list = new ArrayList<>();
		
		for(int i=0;i<=5;i++) {
			list.add(new Tasks(i));
		}
		
		ExecutorService service = Executors.newFixedThreadPool(4);
		
		for(int i=0;i<=5;i++) {
			Tasks task = new Tasks(i);
			service.execute(task);
			
		}
		
		service.shutdown();
	}

}
