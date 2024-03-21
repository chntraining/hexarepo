package com.hexaware.model;

import java.util.Scanner;

import com.hexaware.controller.EmpSalaryInterface;

public class FullTimeEmployee extends Employee implements EmpSalaryInterface {
	Salary salary = new Salary();

	Scanner sc = new Scanner(System.in);

	@Override
	public Salary calculateSalary() {
		salary.setSalaryType("monthly");
		System.out.println("Enter basic Salary");
		int basic = sc.nextInt();
		salary.setBasic(basic);
		salary.setHra();
		salary.setPf();
		salary.setGross();
		salary.setNet();
		return salary;
	}

	@Override
	public void manageLeave() {
		System.out.println("Full-time employee is managing leave...");

	}

}
