package com.bridgelabz.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLConnection {
	String url = "jdbc:mysql://localhost:3306/Student_Payroll" ;
	String userName = "root" ;
	String password = "dpkaryan1996#";
		
	public Connection connection() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url ,userName , password );
			return connection;
				
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return null;			
	}
}


