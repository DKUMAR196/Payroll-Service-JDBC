package com.bridgelabz.program;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.bridgelabz.connection.SQLConnection;

public class SQLStatement {
	Scanner sc = new Scanner(System.in);
	public static  void main(String[] args) {
		SQLStatement sqlStatement = new SQLStatement();
		SQLConnection sqlConnection  = new SQLConnection();
		Connection connection = sqlConnection.connection();
//		sqlStatement.createDatabase(connection);
//		sqlStatement.createTable(connection);
//		sqlStatement.insertIntoEmployee(connection);
//		sqlStatement.selectAll(connection);
//		sqlStatement.selectedData(connection);
//		sqlStatement.addColumn(connection);
		sqlStatement.updates(connection);
	}
	
	/*
	private void createDatabase(Connection connection) {		
		String query = "Create DataBase Student_Payroll";
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			ps.execute();
			ps.close();
			connection.close();
			System.out.println("Database created");
		} catch (SQLException e) {	
			e.printStackTrace();
		}		
	}
	
	
private void createTable(Connection connection) {
		
		String query = "Create table Student_Pay(empId int(10) , eName varchar(50) , salary dec(10,2) , startDate date); ";
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			ps.execute();
			ps.close();
			connection.close();
			System.out.println("table created");
		} catch (SQLException e) {	
			e.printStackTrace();
		}		
	}
	
	
private void insertIntoEmployee(Connection connection) {
		
		System.out.println("Enter the Id");
		int empid = sc.nextInt();
		System.out.println("Enter the name ");
		String eName = sc.next();
		System.out.println("Enter the Salary");
		double salary = sc.nextDouble();
		System.out.println(" Enter the start Date ");
		String date = sc.next();
  
		
		String query = "Insert into Student_Pay(empid , eName , salary , startDate) values(?,?,?,?) ";
		PreparedStatement ps;
		try {
			ps = connection.prepareStatement(query);
			ps.setInt(1, empid);
			ps.setString(2, eName);
			ps.setDouble(3, salary);
			ps.setString(4,date);
			ps.execute();
			ps.close();
			connection.close();
			System.out.println("Data insert");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}	
	}
	
	
private void selectAll(Connection connection) {
		
		String query = "Select * from Student_Pay";
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			ResultSet set = ps.executeQuery(query);
			while(set.next()) {
				System.out.println(set.getInt(1) + " "+ set.getString(2) + " " + set.getDouble(3) + " " + set.getDate(4));
			}
			ps.execute();
			ps.close();
			connection.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	private void selectedData(Connection connection) {
		System.out.println("Enter the name");
		String name = sc.next();
		String query = "Select * from Student_Pay where eName = '?'";
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setString(2, name);
			ResultSet set = ps.executeQuery(query);
			while(set.next()) {
				System.out.println(set.getInt(1) + " "+ set.getString(2) + " " + set.getDouble(3) + " " + set.getDate(4));
			}
			ps.execute();
			ps.close();
			connection.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
private void addColumn(Connection connection) {
		
		String query = "Alter table Student_Pay add column gender char(1) after ename ";
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			ps.execute();
			ps.close();
			connection.close();
			System.out.println("Column added");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}*/
	
	
private void update(Connection connection) {
		
		String query = "update Student_Pay Set gender = 'M' where Empid = 1 ";
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			ps.execute();
			ps.close();
			connection.close();
			System.out.println(" added");
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}

private void updates(Connection connection) {
	
	System.out.println("Enter the gender");
	String gender = sc.next();
	String query = "update Student_Pay Set gender = ? where Empid = ? ";
	try {
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setString(1, gender);
		ps.setInt(2, 2);
		ps.execute();
		ps.close();
		connection.close();
		System.out.println(" added");
	} catch (SQLException e) {
		e.printStackTrace();
		}	
	}
}



