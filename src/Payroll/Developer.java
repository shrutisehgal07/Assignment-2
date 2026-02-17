package Payroll;

public class Developer extends Employee {
	
		
		int overtime = 5;
		double grossSal;
		
		Developer(){          // default constructor
			}
		
		Developer(double baseSalary){        // parameterised constructor
			this.baseSalary=baseSalary;
		}
	
	
	@Override
	public double grossSalary(double baseSalary) {
		
		grossSal= baseSalary +(overtime*500);
		
		return grossSal;
	}

}
