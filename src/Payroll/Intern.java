package Payroll;

public class Intern extends Employee{
	
	double baseSalary;
	double attendedDays;
	double grossSal;
	
	Intern(){
		
	}
	
	Intern(double attendedDays){
		this.baseSalary = baseSalary;
	}
	
	Intern(double baseSalary, double attendedDays){
		this.baseSalary = baseSalary;
		this.attendedDays = attendedDays;
	}
	
	
	@Override
	public double grossSalary(double baseSalary) {
		double attendancePercent = (attendedDays/30) *100;
		
		if(attendancePercent < 0.70) {
			grossSal = baseSalary - (baseSalary * 0.20);
		}
		else {
			grossSal = baseSalary;
		}
		
		return grossSal;
	}

}
