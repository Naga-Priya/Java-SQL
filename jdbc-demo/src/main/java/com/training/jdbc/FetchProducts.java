package com.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class FetchProducts {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
		
		String url = "jdbc:sqlserver://localhost:1433;"
				+"databaseName=mars;"+
				"encrypt=true;trustServerCertificate=true";
		
		String user = "sa";
		
		String password = "bigStrongPwd";
		
		Connection con =DriverManager.getConnection(url,user,password);  
		if(con!=null) {
			System.out.println("Connection established Successfully!!");
		}
		else {
			System.out.println("Connection Refused!!");
		}
		
		String Query = "select * from product";
		
		Statement stmt =con.createStatement();
		
		ResultSet rs = stmt.executeQuery(Query);
		
		if(rs!=null) {
			List<Product> productList = new ArrayList();
			while (rs.next()) {
				productList.add(new Product(
						rs.getString("prod_id"),
						rs.getString("prod_name"), 
						rs.getString("prod_desc"),
						rs.getDouble("price")));
				
			}
			Collections.sort(productList,new PriceComparator());
			
			for(Product product:productList) {
				System.out.println(product.prod_name + " is $"+product.getPrice());
			}
		}
		else {
			System.out.println("No results found in Table!");
		}
		
		
		
	}

}
