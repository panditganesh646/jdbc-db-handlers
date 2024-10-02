package demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class CreateTableDemo {
   public static void main(String[] args)throws ClassNotFoundException,SQLException {
	       String driver = "com.mysql.cj.jdbc.Driver";
	       String jdbc_url = "jdbc:mysql://localhost:3306/demo";
	       String user = "root";
	       String pwd = "Pass@123";
	       String sql_query = "create table employees(eno int(5),ename varchar(10),esal int(5),eaddr varchar(10))";
	       Class.forName(driver);
	       Connection con = DriverManager.getConnection(jdbc_url,user,pwd);
	       Statement st=  con.createStatement();
	       st.executeUpdate(sql_query);
	       System.out.println("Table Created Successfully..");
	       con.close();
}
}
