package com.training.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;


import com.training.model.User;

public class HomeDao implements IHomeDao{

	@Override
	public List<User> getUsers() throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
		
		String url = "jdbc:sqlserver://localhost:1433;"
				+"databaseName=MarsLearning;"+
				"encrypt=true;trustServerCertificate=true";
		
		String userId = "sa";
		
		String password = "bigStrongPwd";
		
		
		
		Connection con =DriverManager.getConnection(url,userId,password);  
		if(con!=null) {
			System.out.println("Connection established Successfully!!");
		}
		else {
			System.out.println("Connection Refused!!");
		}
		
		String Query = "select * from mluser";
		
		//Statement stmt =con.createStatement();
		
		//PreparedStatement stmt =con.prepareStatement(Query);
		PreparedStatement stmt =con.prepareStatement(Query);
		
		
		ResultSet rs = stmt.executeQuery();
		
		if(rs!=null) {
			List<User> userList = new ArrayList<User>();
			while (rs.next()) {
				userList.add(new User(
						rs.getString("name"),
						rs.getString("password")));
				
			}
			
			
			for(User user:userList) {
				System.out.println(user.getuName() + " and "+user.getPassword());
			}
			return userList;
		}
		else {
			System.out.println("No results found in Table!");
			return null;
		}
		
		
	}
	

}
