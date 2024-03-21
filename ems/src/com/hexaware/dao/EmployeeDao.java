package com.hexaware.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.hexaware.model.Employee;
import com.hexaware.util.DBUtil;

public class EmployeeDao {

	Connection con;
	PreparedStatement ps;
	Statement stmt;
	ResultSet rs;

	public void createEmployee(Employee emp) {		
		try {
			con = DBUtil.getDBConn();	
			ps = con.prepareStatement("insert into Employee(eid,ename) values(?,?)");
			ps.setInt(1, emp.getEmpno());
			ps.setString(2, emp.getEname());			
			int noofrows =ps.executeUpdate();
			System.out.println(noofrows + " inserted Successfully in DB");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

	public void showEmployee() {
		con = DBUtil.getDBConn();
		
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from employee");
			
			while(rs.next()) {
				System.out.println("EmpId : " + rs.getInt(1));
				System.out.println("Emp Name : " + rs.getString(2));
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		
	}

	public void updateEmployee() {
		con = DBUtil.getDBConn();	
		
	}

	@Deprecated
	public void deleteEmployee() {
		con = DBUtil.getDBConn();	
		
	}

}
