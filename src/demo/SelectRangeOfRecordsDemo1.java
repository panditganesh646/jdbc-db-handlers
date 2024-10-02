package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectRangeOfRecordsDemo1 {
          public static void main(String[] args)throws ClassNotFoundException, SQLException {
			    Class.forName("com.mysql.cj.jdbc.Driver");
			    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","Pass@123");
			    Statement st = con.createStatement();
			    ResultSet rs= st.executeQuery("select * from employees");
			    while(rs.next()) {
			    	  System.out.println(rs.getInt("eno")+"\t"+rs.getString("ename")+"\t"+rs.getInt("esal")+"\t"+rs.getString("eaddr"));
		}
			    con.close();
       
	}

}
