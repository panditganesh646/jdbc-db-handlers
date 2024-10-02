package com.jdbc.crudoperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateMultipleRowsDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String driver = "com.mysql.cj.jdbc.Driver";
		String jdbc_url = "jdbc:mysql://localhost:3306/demo";
		String user = "root";
		String pwd = "Pass@123";
		Class.forName(driver);
		Connection con  = DriverManager.getConnection(jdbc_url,user,pwd);
		Statement st = con.createStatement();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Bonus Amount");
		double bonus = sc.nextDouble();
		System.out.println("Enter Salary Range:");
		double salRange = sc.nextDouble();
		String sqlQuery = String.format("update employees set esal=esal+%f where esal<%f",bonus,salRange);
		int updateCount = st.executeUpdate(sqlQuery);
		System.out.println("The number of rows updated:"+updateCount);
		con.close();
		
		
	}

}
