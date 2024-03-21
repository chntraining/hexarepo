package inter;

import java.util.Objects;

//POJO -- Plain Old Java Object  // entity //Java Bean
public class Employee {

	protected int empno;
	protected String ename;
	

	public Employee() {
		System.out.println("From Employee Constr...");
	}

	public Employee(int empno, String ename) {
		super();
		this.empno = empno;
		this.ename = ename;
		
	}

	public int getEmpno() {
		return empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEmpno(int eid) {
		this.empno = eid;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(empno, ename);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return empno == other.empno && Objects.equals(ename, other.ename);
	}
	
	



}
