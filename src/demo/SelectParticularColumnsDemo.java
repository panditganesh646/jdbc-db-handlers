package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectParticularColumnsDemo {

	public static void main(String[] args)throws ClassNotFoundException, SQLException {
	    String driver = "com.mysql.cj.jdbc.Driver";
	    String jdbc_url = "jdbc:mysql://localhost:3306/demo";
	    String user = "root";
	    String pwd = "Pass@123";
	    Class.forName(driver);
	    Connection con  = DriverManager.getConnection(jdbc_url,user,pwd);
	    Statement st = con.createStatement();
	    String sql_query = "select ename,eaddr from employees";
	    boolean flag = false;
	    ResultSet rs = st.executeQuery(sql_query);
	    System.out.println("ENAME\tEADDR");
	    System.out.println("--------------");
	    while(rs.next()) {
	    	 flag = true;
	    	 System.out.println(rs.getString("ename")+"\t"+rs.getString("eaddr"));
	    }
	    if(flag==false) {
	    	  System.out.println("No Records found");
	    }
	    con.close();  
	  }

}
