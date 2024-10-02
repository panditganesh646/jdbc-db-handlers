package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
public class SelectRowsSortingDemo {
	public static void main(String[] args)throws SQLException,ClassNotFoundException {
		String driver = "com.mysql.cj.jdbc.Driver";
		String jdbc_url = "jdbc:mysql://localhost:3306/demo";
		String user = "root";
		String pwd = "Pass@123";
		Class.forName(driver);
		Connection con = DriverManager.getConnection(jdbc_url,user,pwd);
		Statement st = con.createStatement();
		String sqlQuery = "select *from employees order by esal DESC";
		boolean flag = false;
		ResultSet rs = st.executeQuery(sqlQuery);
		System.out.println("ENO\tENAME\tESALARY\tEADDR");
		System.out.println("---------------------------");
		while(rs.next()) {
			    System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3)+"\t"+rs.getString(4));
		}
		if(flag==false) {
			   System.out.println("No Records Found");
		}
		con.close();
	}

}
