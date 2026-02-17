package Payroll;

public class Manager extends Employee{
	
	double baseSalary;
	int teamSize = 50;
	double grossSal;
	
	Manager(){       // default constructor
		}
	
	Manager(double baseSalary){       // parameterised constructor
		this.baseSalary=baseSalary; 
	}
	
	
	@Override
	public double grossSalary(double baseSalary) {
		
		grossSal= baseSalary +(teamSize * 1000);
		
		return grossSal;
	}
	

	

}
