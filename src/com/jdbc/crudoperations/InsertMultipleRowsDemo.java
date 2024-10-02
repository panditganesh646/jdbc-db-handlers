package com.jdbc.crudoperations;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class InsertMultipleRowsDemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		 String driver ="com.mysql.cj.jdbc.Driver";
		 String jdbc_url = "jdbc:mysql://localhost:3306/demo";
		 String user = "root";
		 String pwd = "Pass@123";
		 Class.forName(driver);
		 Connection con = DriverManager.getConnection(jdbc_url,user,pwd);
		 Statement st  = con.createStatement();
		 Scanner sc = new Scanner(System.in);
		 while(true) {
			    System.out.println("Employee Number:");
			    int eno = sc.nextInt();
			    System.out.println("Employee Name:");
			    String ename = sc.next();
			    System.out.println("Employee sal:");
			    double esal = sc.nextDouble();
			    System.out.println("Employee Address:");
			    String eaddr = sc.next();
			    String sqlQuery = String.format("insert into employees values(%d,'%s',%f,'%s')",eno,ename,esal,eaddr);
			    st.executeUpdate(sqlQuery);
			    System.out.println("Record Inserted Successfully");
			    System.out.println("Do you want to insert one more record[yes/No]:");
			    String option = sc.next();
			    if(option.equalsIgnoreCase("No")) {
			    	   break;
			    }    
		 }
		 con.close();
	}

}
