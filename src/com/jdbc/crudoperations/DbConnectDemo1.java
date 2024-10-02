package com.jdbc.crudoperations;
import java.sql.DriverManager;
import java.sql.*;
public class DbConnectDemo1 {
	public static void main(String[] args)throws Exception {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 String url = "jdbc:mysql://localhost:3306/demo";
		 String user = "root";
		 String Pwd  = "Pass@123";
		 Connection con = DriverManager.getConnection(url,user,Pwd);
		 if(con!=null) {
			   System.out.println("Connection established successfully...");
		 }
		 else {
			   System.out.println("Connection not established");
		 }
		 

	}

}
