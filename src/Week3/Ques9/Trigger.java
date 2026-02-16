package Week3.Ques9;

/* You are required to implement a Ping-Pong game using two threads. One
thread should print "Ping" and the other should print "Pong" in a sequential and
synchronized manner. Your program should ensure that "Ping" is printed, then "Pong",
and so on, without any skipping or repeated prints.
*/

public class Trigger {

	public static void main(String[] args) {
		
		PingPong pingpong = new PingPong();
		
		Thread t1= new Thread(pingpong);
		Thread t2= new Thread(pingpong);
		
		t1.start();
		t2.start();
	}
}
