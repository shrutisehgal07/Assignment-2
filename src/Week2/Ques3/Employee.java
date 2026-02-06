package Week2.Ques3;

abstract class EmpSalary {
	
	int eId;
	String eName;
	
	EmpSalary(int id, String name){
		this.eId= id;
		this.eName=name;
	
			
	}
	
	public abstract int calculateSalary();
	public void displayDetails() {
		System.out.print("The id of the employee is: " + eId);
		System.out.println();
		System.out.print("The name of the employee is: " + eName);		
		System.out.println();
		System.out.print("The salary of the employee is: ");
		
	}
}

public class Employee{
	
	public static void main(String[] args) {
		
		EmpSalary fte= new FullTimeEmployee(2, "Gandhi ", 1000);
		EmpSalary pte = new PartTimeEmployee(5, "Modi ",50000,15);
		
		System.out.println("The full time employee details are:");
		System.out.println();
		fte.displayDetails();
		System.out.println(fte.calculateSalary());
		System.out.println();
		System.out.println();

		
		System.out.println("The part time employee details are:");
		System.out.println();
		pte.displayDetails();
		System.out.print(pte.calculateSalary());	
		
	}
}


