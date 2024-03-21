package com.hexaware.mypack;

import java.util.Arrays;

class Employee {
	
	int empid=111;
	String ename ="Nisha";
	 int x =55;
	Employee(){
		
		this(500);   // Constructor Chaining
		
		System.out.println("Employee Constr...");
	}
	
	Employee(int x){
		System.out.println("Employee Constr...X : " + x);
		
	}
	Employee(String x){
		System.out.println("Employee Constr...X : " + x);
	}
	Employee(int empid,String ename){  //Overloading the constructor
		System.out.println("param. Employee Constr...");
		this.empid = empid;
		this.ename = ename;
	}
	Employee(String ename,int empid){  //Overloading the constructor
		System.out.println("param. Employee Constr...");
		this.empid = empid;
		this.ename = ename;
	}

	public String getEmpInfo() {
		return empid + " " + ename;
	}
	
	public void printEmpName() {
		System.out.println(ename);
		this.x=x+1;
	}
	
	
}

class Manager extends Employee{     // IS-A
	String dept = "IT";
	
	
	public Manager() {
		super(113,"James");
		System.out.println("Manager Constr");
		
	}


	public String getEmpInfo() {     // Overridden Method
		return super.getEmpInfo()+ " " + dept;
	}
	
	public void getManagerDept() {
		System.out.println(dept);
	}
	
}

public class MainClass {

	public static void main(String[] args) {

		Employee emp = new Employee();		
		//System.out.println(emp.getEmpInfo());
		
		Manager mr = new Manager();		
		//System.out.println(mr.getEmpInfo());
		
		Employee emp2 = new Employee(112,"Shiva");
		//System.out.println(emp2.getEmpInfo());
		
		/*Employee emp3 = new Manager();  // Polymorphic Object
		System.out.println(emp3.getEmpInfo()); // Virtual Method Invocation
		emp3.printEmpName();
		//emp3.getManagerDept();  // NOT Possible
		
		if(emp2 instanceof Manager) {  // operator
			System.out.println("I am Employee");
		}else {
			System.out.println("I am Manager");
		}
		*/
		
		Employee[] earr = new Employee[2];
		earr[0]=emp;
		earr[1]=mr;
		
		System.out.println(Arrays.toString(earr));
		
		Manager emp3 =(Manager) new Employee();  
		System.out.println(emp3);
		
	}

}
