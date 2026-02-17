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
	

	public static void main(String[] args) {
		
		double baseSalary= 15000;
		int rating =5;
		int attendance = 22;
		
		Employee emp1 = new Intern(attendance);
		
		System.out.println("The salary calculation module of an Intern");
		
		System.out.println();
		
		double gross = emp1.grossSalary(baseSalary);
		double attendanceDeduct = emp1.attendance(baseSalary, attendance);
		double bonus = emp1.perfomance(emp1.grossSalary(baseSalary), rating);
		double pf = emp1.pfDeduction(baseSalary);
		double tax = emp1.taxCalculation(emp1.grossSalary(baseSalary), 
				emp1.perfomance(emp1.grossSalary(baseSalary), 5));
		
		
		// calculating the net salary 
		double netSalary = gross + bonus - tax - pf - attendanceDeduct;
		
		System.out.println("The Gross salary is: " + gross);
		System.out.println("The Attendance deduction is: " + attendanceDeduct);
		System.out.println("The performance bonus is: " + bonus);
		System.out.println("The pf deduction is: " + pf); 
		System.out.println("The tax deduction is: " + tax);
		System.out.println("The net salary is: " + emp1.netSalary(gross, bonus, tax, pf, attendanceDeduct));
	
	}


}
