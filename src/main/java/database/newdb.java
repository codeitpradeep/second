package database;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class newdb {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Connection conn = DriverManager.getConnection(
				  "jdbc:sqlserver://LAPTOP-G13R1R6V;" 
				+ "user=sa;" 
				+ "password=12345;" 
				+ "DatabaseName=teacher");
		System.out.println("test connected");
		
		Statement sta = conn.createStatement();

		String Sqldelete = "delete Persons  where PersonID = '2'";
		sta.execute(Sqldelete);

		String Sqlinsert = "insert into Persons values ('2','Auto','Sele','chennai','CHE')";
		sta.execute(Sqlinsert);

		String sqlupdate = "update Persons set FirstName = 'prad' where PersonID = '2'";
		sta.execute(sqlupdate);

		String sqlexec = "exec SelectAllCustomers";
		sta.execute(sqlexec);

		//
		ResultSet rs2 = sta.executeQuery(sqlexec);
		while (rs2.next()) {
			System.out.println(rs2.getString(1));
		}

		String Sql = "select * from Persons";
		ResultSet rs = sta.executeQuery(Sql);
		while (rs.next()) {
			System.out.println(rs.getString("FirstName"));
		}
	}

}
