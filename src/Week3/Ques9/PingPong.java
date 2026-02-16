package Week3.Ques9;

/* You are required to implement a Ping-Pong game using two threads. One
thread should print "Ping" and the other should print "Pong" in a sequential and
synchronized manner. Your program should ensure that "Ping" is printed, then "Pong",
and so on, without any skipping or repeated prints.
*/

public class PingPong implements Runnable{
	
	boolean ping= true;          // because we need to start with ping
	@Override
	public void run() {
		
		for(int i=1;i<=3;i++) {
			
			synchronized(this){
				if(ping) {
					System.out.println("Ping");
					ping=false;                   // for alternating 
				}
				else {
					System.out.println("Pong");
					ping = true;
					
				}
				notify();
				if(i<5) {
				try {                // good practice
				wait();          // optional but to ensure only one thread is in the block
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				
				}
			}
		
		}
	}
	

}

