package Payroll;

public interface Salary {
	
	 double grossSalary(double baseSalary);
	
	 double attendance(double baseSalary, double attendedDays);
	
	 double perfomance(double grossSalary,int ratings);  // rating should be 1-5
	
	 double pfDeduction(double baseSalary);
	
	 double taxCalculation(double grossSal, double bonus);
	
	 double netSalary(double grossSalary, double bonus, double tax, double pf,
			 double attendanceDeduction);


}
