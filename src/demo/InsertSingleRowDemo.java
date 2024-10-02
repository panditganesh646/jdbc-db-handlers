package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertSingleRowDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String driver = "com.mysql.cj.jdbc.Driver";
		String jdbc_url = "jdbc:mysql://localhost:3306/demo";
		String user = "root";
		String pwd = "Pass@123";
		String sql_query = "insert into employees values(100,'durga',1000,'hyd')";
		Class.forName(driver);
		Connection con = DriverManager.getConnection(jdbc_url,user,pwd);
		Statement st = con.createStatement();
		int updateCount = st.executeUpdate(sql_query);
		System.out.println("The number of rows inserted:"+updateCount);
		con.close();

	}

}
