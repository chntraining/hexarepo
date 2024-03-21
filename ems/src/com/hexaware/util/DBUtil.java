package com.hexaware.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 * @author Admin
 * @version 1.5
 *
 */
public class DBUtil {
	/**
	 * con it is static in nature for storing connection of DB.
	 */
	static Connection con;

   /**
	 * This method is used to establish connection with the DB.
	 * @exception SQL exception is thrown
	 * @return Connection This returns db connection
    */
  public static Connection getDBConn() {
	try {
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hexa3", "root", "root");
	} catch (SQLException e) {	
			e.printStackTrace();
	}
		return con;
	}

	public static void main(String[] args) {
		System.out.println(getDBConn());
	}

}
