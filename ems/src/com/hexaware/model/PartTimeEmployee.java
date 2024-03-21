package com.hexaware.model;

import java.util.Scanner;

import com.hexaware.controller.EmpSalaryInterface;

public class PartTimeEmployee extends Employee  implements EmpSalaryInterface {

	Salary salary = new Salary();

	Scanner sc = new Scanner(System.in);

	@Override
	public Salary calculateSalary() {
		salary.setSalaryType("daily");
		
		System.out.println("Enter hourly Rate for PTE");
		double hourlyRate = sc.nextDouble();
		salary.setHourlyRate(hourlyRate);

		System.out.println("Enter no.of hours worked PTE");
		int hoursWorked = sc.nextInt();
		salary.setHoursWorked(hoursWorked);
		salary.setDailySalary();
		return salary;
	}

	@Override
	public void manageLeave() {
		System.out.println("PTE managing leave");
	}

	@Override
	public String toString() {
		return "PartTimeEmployee [empno=" + empno + ", ename=" + ename + 
				"salary =" + this.sal + "]";
	}

}
