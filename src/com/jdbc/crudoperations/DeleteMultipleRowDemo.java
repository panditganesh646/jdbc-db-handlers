package com.jdbc.crudoperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class DeleteMultipleRowDemo {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		String driver = "com.mysql.cj.jdbc.Driver";
		String jdbc_url = "jdbc:mysql://localhost:3306/demo";
		String user = "root";
		String pwd = "Pass@123";
		Class.forName(driver);
		Connection con  = DriverManager.getConnection(jdbc_url,user,pwd);
		Statement st = con.createStatement();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter cutOff Salary:");
		double cutoff =  sc.nextDouble();
		String sqlQuery = String.format("delete from employees where esal>=%f",cutoff);
		int updateCount = st.executeUpdate(sqlQuery);
		System.out.println("The number of rows deleted:"+updateCount);
		con.close();
	}

}
