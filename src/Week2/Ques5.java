package Week2;
/*
 	Write a program to prove that Java follows pass by value: -
	• Pass a primitive variable to a method and modify it.
	• Pass an object to a method and modify its internal state.
	• Print values before and after method calls.
 */

class Modification{                                  // class to pass the value for non primitive object 
	private int value;
	
	Modification(int value){
		this.value=value;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value=value;
	}
	
	
}


public class Ques5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ques5 q = new Ques5();
		
		//passing the value of the primitive datatype
		int num=10;
		System.out.println("For primitive variable:");
		System.out.println();
		System.out.println("The value before the method call is = " + num);
		
		q.display(num);
		
		System.out.println("The value after the method call is = " + num);

		
		//passing the value of the non primitive data type
		System.out.println();
		
		System.out.println("For non primitive object:");
		System.out.println();
		Modification m = new Modification(25);
		System.out.println("The value before the method call is = " + m.getValue());
		
		q.display(m);
		System.out.println("The value after the method call is =  " + m.getValue());
			
	}
	

	public void display(int number) {
		System.out.println("The value inside method call is = " + number);

		number = 28;

		System.out.println("The value inside method call after modification is = " + number);
	}
	
	public void display(Modification m) {         //method overloading
		System.out.println("The value inside method call is =" + m.getValue());
		
		//m = new Modification(80);                         //for modifying only the value inside the method
		m.setValue(100);									// for modifying the value on a class level
		
		/*on uncommenting both as the 'm' is given new value in method, when we setValue it refers to the local object reference 
		 and changes the value of m inside method to 100 not changing the original, so after method call value will be 25 only.
		*/
		
		System.out.println("The value inside method call after modification is = " + m.getValue());
	}
		

}

