package com.hexaware.model;

import java.io.Serializable;
import java.util.Comparator;


/** The Employee class is a Model Class to fetch employee info.
*
* @author  Deepikkaa
* @version 1.0
* @since   2024-03-19 
*/
public class Employee implements Comparable<Employee>, Serializable {

    protected int empno;
	protected String ename;
	protected Salary sal; // Composition r/s

	public Employee() {
		System.out.println("From Employee Constr...");
	}

	public Employee(int empno, String ename, Salary sal) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
	}

	 /**
	   * This method is used to getEmpno. 	 
	   * @return int This returns the empno
	   */
	public int getEmpno() {
		return empno;
	}

	public String getEname() {
		return ename;
	}

	 /**
	   * This method is used to get EmployeeID.
	   * @param eid This is the first paramter to setEmpno method	  
	   * @return Nothing This doesnot return anything
	   */
	public void setEmpno(int eid) {
		this.empno = eid;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Salary getSal() {
		return sal;
	}

	public void setSal(Salary sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", sal=" + sal + "]";
	}

	@Override
	public int compareTo(Employee e) {

		return this.empno - e.empno;
	}

	// Anonyomous Inner Class
	public static Comparator nameCompartor = new Comparator<Employee>() {

		public int compare(Employee e1, Employee e2) {

			return e1.getEname().compareTo(e2.getEname());
		}

	};

}
