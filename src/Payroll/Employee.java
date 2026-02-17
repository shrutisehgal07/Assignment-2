package Payroll;

public abstract class Employee implements Salary{
	
	double baseSalary;
	static final double PFPERCENT = 0.12;
	

	public abstract double grossSalary(double baseSalary);
	
	
	double attendanceDeduction;
	
	@Override
	public double attendance(double baseSalary,double attendedDays) {
		
		double dailySalary= baseSalary/30;
		double absentDays= 30-attendedDays;
		attendanceDeduction= absentDays* dailySalary;
		return attendanceDeduction;
	}
	
	double bonus;
	@Override
	public double perfomance(double grossSalary, int ratings) {
		
		double bonusPercent;
		
		if(ratings == 5) {
			bonusPercent = 0.2;
		}
		else if(ratings == 4) {
			bonusPercent = 0.15;
		}
		else if(ratings == 3) {
			bonusPercent = 0.1;
		}
		else if(ratings == 2) {
			bonusPercent = 0.05;
		}
		else {
			bonusPercent = 0.0;
		}
		
		bonus = bonusPercent * grossSalary;
		return bonus;
	}
	
	double pf;
	
	@Override
	public double pfDeduction(double baseSalary) {
		
		pf = PFPERCENT * baseSalary;
	//	System.out.println();
		return pf;
	}
	
	double tax;
	@Override
	public double taxCalculation(double grossSal, double bonus) {
		double taxableIncome = grossSal+ bonus;
		double taxRate;
		
		if(taxableIncome <= 50000) {
			taxRate = 0.05;	
		}
		else if(taxableIncome > 50000 && taxableIncome <= 100000) {
			taxRate = 0.1;	
		}
		else if(taxableIncome > 100000 && taxableIncome <= 150000) {
			taxRate = 0.15;	
		}
		else {
			taxRate = 0.2;
		}
		
		tax = taxRate * taxableIncome;
		
		return tax;
		
	}
	
	@Override
	public double netSalary(double grossSalary, double bonus, double tax, double pf,
			 double attendanceDeduction) {
		
		double netSalary = grossSalary + bonus- tax - pf- attendanceDeduction;
		return netSalary;
	}
	
	
	
}
