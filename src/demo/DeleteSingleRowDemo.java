package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteSingleRowDemo {
     public static void main(String[] args) throws ClassNotFoundException, SQLException {
		     String driver = "com.mysql.cj.jdbc.Driver";
		     String jdbc_url = "jdbc:mysql://localhost:3306/demo";
		     String user  = "root";
		     String pwd = "Pass@123";
		     String sqlQuery = "delete from employees where ename='durga'";
		     Class.forName(driver);
		     Connection con = DriverManager.getConnection(jdbc_url,user,pwd);
		     Statement st = con.createStatement();
		     int updateCount = st.executeUpdate(sqlQuery);
		     System.out.println("The number of rows deleted from database is:"+updateCount);
		     con.close();
		     
	}
}
