package Week3.Ques8;

/*Create a traffic control system where only 3 cars can pass through a tunnel at
the same time. Use a semaphore to limit the number of cars that can be in the tunnel
concurrently.

Objective: Learn how to use Semaphore to control access to a limited number of
resources in a multi threaded environment.
*/

public class Trigger {

	public static void main(String[] args) {
		
		TrafficControl tc = new TrafficControl();
		 
		for(int i=1;i<6;i++) {             // this loop is to make 5 threads 
			Thread car = new Thread(tc::pass, "Car " + i);
			
			car.start();
		}

	}

}
