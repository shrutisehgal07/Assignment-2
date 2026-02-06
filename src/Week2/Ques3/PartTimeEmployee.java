package Week2.Ques3;

public class PartTimeEmployee extends EmpSalary{
	
	int salary;
	int workingDays;

	PartTimeEmployee(int id, String name, int salary, int workingDays) {
		super(id, name);
		
		this.salary = salary;
		this.workingDays = workingDays;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calculateSalary() {
		// TODO Auto-generated method stub
		
		return salary * workingDays;
	}

}
