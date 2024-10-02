package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
public class DropTableDemo {

	public static void main(String[] args)throws ClassNotFoundException,SQLException {
		  String driver = "com.mysql.cj.jdbc.Driver";
		  String jdbc_url = "jdbc:mysql://localhost:3306/demo";
		  String user  = "root";
		  String pwd = "Pass@123";
		  String sql_query = "drop table student";
		  Class.forName(driver);
		  Connection con = DriverManager.getConnection(jdbc_url,user,pwd);
		  Statement st = con.createStatement();
		  st.executeUpdate(sql_query);
		  System.out.println("Table Deleted Successfully..");
		  con.close();
	}

}
