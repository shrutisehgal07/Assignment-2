package Week3.Ques7;

/*Write a program that simulates a resource that can be accessed by multiple
threads, but only one thread at a time can modify it. Use ReentrantLock to ensure
that each thread gets exclusive access to the resource.

Objective: Explore the functionality of ReentrantLock compared to synchronized,
including features like fairness and lock reentrancy*/

public class Trigger {

	public static void main(String[] args) {
		
		Resource resource = new Resource();
		
		Thread t1= new Thread(()->resource.useResource()); // using the lambda function
		Thread t2= new Thread(resource::useResource);  // using method referencing way
		Thread t3= new Thread(resource::useResource);
		
		t1.start();
		t2.start();
		t3.start();
		
	//	Thread t3= new Thread(new Runnable() {    // normal way
	//		public void run() {
	//			resource.useResource();
	//		}
	//	});        
	}

}
