package com.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

public class JdbcTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		//Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		
		//String url = "jdbc:sqlserver://localhost\\MarsLearning";
		String url = "jdbc:sqlserver://localhost:1433;"
				+"databaseName=MarsLearning;"+
				"encrypt=true;trustServerCertificate=true";
        
		// Establish the connection.
//        SQLServerDataSource ds = new SQLServerDataSource();
//        ds.setServerName("jdbc:sqlserver://localhost");
//        ds.setPortNumber(1433);
//        ds.setDatabaseName(databaseName);
//        ds.setUser(username);
//        ds.setPassword(password);
		
		
		
		String user = "sa";
		
		String password = "bigStrongPwd";
		
		Connection con =DriverManager.getConnection(url,user,password);
		//Connection con =DriverManager.getConnection(url);

		if(con!=null) {
			System.out.println("Connection established Successfully!!");
		}
		else {
			System.out.println("Connection Refused!!");
		}
		
		String Query = "select * from admin";
		
		Statement stmt =con.createStatement();
		
		ResultSet rs = stmt.executeQuery(Query);
		
		while (rs.next()) {
			System.out.println(rs.getString("admin_id"));
			System.out.println(rs.getString("name"));
			System.out.println(rs.getString("email"));
		}
		
	}

}

//get values from product table, 
//store in collection, 
//sort the products based on the price"
