package com.hexaware.view;

import java.util.Scanner;

import com.hexaware.controller.EmpSalaryInterface;
import com.hexaware.controller.EmployeeController;
import com.hexaware.controller.EmployeeInterface;
import com.hexaware.model.FullTimeEmployee;
import com.hexaware.model.PartTimeEmployee;

public class EmpMainClass {
	/** 
	 *  Mainmethod description.
	 * @param args
	 */
	public static void main(String[] args) {
		EmployeeInterface ec = new EmployeeController();

		Scanner sc = new Scanner(System.in);
		String ch = null;
		do {
			System.out.println("Enter your choice:");
			System.out.println("1. Add Employee");
			System.out.println("2. View Employee");
			System.out.println("3. sortByEmpnumber Using Comparable");
			System.out.println("4. sortByEnameUsingComparator");

			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				
				ec.addEmployee();
				break;
			}
			case 2: {
				ec.viewEmployee();
				break;
			}
			case 3: {
				ec.sortByEmpnumber();
				break;
			}
			case 4: {
				ec.sortByEnameUsingComparator();
				break;
			}
			case 5: {
				ec.updateEmployee();
				break;
			}
			case 6: {
				ec.deleteEmployee();
				break;
			}
			
			case 7: {
				ec.serializeEmployee();
				break;
			}
			
			case 8: {
				ec.deserializeEmployee();
				break;
			}
			default: {
				System.out.println("Enter the right choice. ");
			}
			}
			System.out.println("Do you want to continue? Y or y");
			ch = sc.next();
		} while(ch.equals("Y") || ch.equals("y")); 
	   System.out.println("Thanks for using our system !!!");
		System.exit(0);
	}
}
