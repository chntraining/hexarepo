package com.hexaware.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.hexaware.dao.EmployeeDao;
import com.hexaware.model.Employee;
import com.hexaware.model.FullTimeEmployee;

import com.hexaware.model.PartTimeEmployee;
import com.hexaware.model.Salary;

public class EmployeeController implements EmployeeInterface {
	enum EmployeeType {
		FT(11), PT(12);

		int value;

		EmployeeType(int val) {
			this.value = val;
		}

		public int getValue() {
			return value;
		}
	}

	Employee emp;
	FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(); // Early initilization
	PartTimeEmployee partTimeEmployee = new PartTimeEmployee();
	Salary salary = new Salary();

	List<Employee> emplist = new ArrayList<Employee>();
	EmployeeDao dao = new EmployeeDao();
	Scanner sc = new Scanner(System.in);

	public void addEmployee() {
	
	 emp = new Employee();

		System.out.println("Enter emp id");
		int empid = sc.nextInt();
		emp.setEmpno(empid);

		System.out.println("Enter emp name");
		String ename = sc.next();
		emp.setEname(ename);

		System.out.println("Enter the Employee Type. \n 1. FullTime \n 2. PartTime");

		int emptypeval = sc.nextInt();
		EmployeeType emptype = null;
		if (emptypeval == 1) {
			emptype = EmployeeType.FT;
		} else if (emptypeval == 2) {
			emptype = EmployeeType.PT;
		}

		if (emptype != null) {
			switch (emptype) {
			case FT: {
				// salary.setSalaryType("monthly");
				emp.setSal(fullTimeEmployee.calculateSalary());
				dao.createEmployee(emp);
				System.out.println("FT Employee added Successfully!!!");
				break;
			}
			case PT: {
				// salary.setSalaryType("daily");
				emp.setSal(partTimeEmployee.calculateSalary());
				dao.createEmployee(emp);
				System.out.println("PT Employee added Successfully!!!");
				break;
			}
			default:
				break;
			}
		}
		emplist.add(emp);
		System.out.println("Employee " + emp.getEmpno() + " added succesfully to List");
	}

	public void viewEmployee() {
		// System.out.println(emp.getEmpno() + " -- " + emp.getEname() );
		// System.out.println(emplist);

		Iterator it = emplist.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		dao.showEmployee();

	}

	@Override
	public void sortByEmpnumber() {

		System.out.println("**********After Sorting by empno ******");
		Collections.sort(emplist);
		System.out.println(emplist);
	}

	@Override
	public void sortByEnameUsingComparator() {
		Collections.sort(emplist, Employee.nameCompartor);
		System.out.println("**********After Sorting by Name ******");
		System.out.println(emplist);
	}

	@Override
	public void updateEmployee() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteEmployee() {

	}

	@Override
	public void serializeEmployee() {
		try {
			FileOutputStream fos = new FileOutputStream("empser.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(emplist);

			System.out.println("Serialized successfully");

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	@Override
	public void deserializeEmployee() {
		try {
			FileInputStream fis = new FileInputStream("empser.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);

			List<Employee> elist = (List<Employee>) ois.readObject();
			System.out.println(elist);

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

	}

}
