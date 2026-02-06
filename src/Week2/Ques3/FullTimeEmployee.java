package Week2.Ques3;

public class FullTimeEmployee extends EmpSalary {
	int id;
	String name;
	int salary;

	FullTimeEmployee(int id, String name, int salary) {
		super(id, name);
		this.salary=salary;
	}

	@Override
	public int calculateSalary() {
		
		salary*=30;
		
		return salary;
	}

}
