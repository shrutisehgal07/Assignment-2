package Payroll;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double baseSalary= 200000;
		int rating =2;
		int attendance = 20;
		
		Employee emp = new Manager(baseSalary);
		
		System.out.println("The salary calculation module of an Employee is");
		
		System.out.println();
		
		double gross = emp.grossSalary(baseSalary);
		double attendanceDeduct = emp.attendance(baseSalary, attendance);
		double bonus = emp.perfomance(emp.grossSalary(baseSalary), rating);
		double pf = emp.pfDeduction(baseSalary);
		double tax = emp.taxCalculation(emp.grossSalary(baseSalary), 
				emp.perfomance(emp.grossSalary(baseSalary), 5));
		
		
		System.out.println("The Gross salary is: " + gross);
		System.out.println("The Attendance deduction is: " + attendanceDeduct);
		System.out.println("The performance bonus is: " + bonus);
		System.out.println("The pf deduction is: " + pf); 
		System.out.println("The tax deduction is: " + tax);
		System.out.println("The net salary is: " + emp.netSalary(gross, bonus, tax, pf, attendanceDeduct));
	}
}
