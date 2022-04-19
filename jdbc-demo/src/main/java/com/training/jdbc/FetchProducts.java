package com.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
		
		String Query = "select * from product where prod_desc = ? and price > ?";
		
		//Statement stmt =con.createStatement();
		
		//PreparedStatement stmt =con.prepareStatement(Query);
		PreparedStatement stmt =con.prepareStatement(Query);
		
		stmt.setString(1, "HP");	
		stmt.setDouble(2, 250.0);
		ResultSet rs = stmt.executeQuery();
		
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
		
		int num1 = 0;
		int result = 0;
		String str = null;
		
		try {
			//result = num1/0;
			str.length();
		}
		catch(ArithmeticException e) {
			System.out.println("Divide by zero");
			result = -1;
		}
//		catch(NullPointerException e) {
//			System.out.println("Null pointer");
//			System.out.println(e.getMessage());
//		}
		catch(Exception e) {
			e.printStackTrace();
			result = -1;
		}
		
		System.out.println(result);
		
	}

}

/* Checked exceptions or compile time exceptions are the exceptions thrown
 * by compiler during compilation.
 * 
 * Unchecked Exception or Runtime Exception are exceptions like divide by zero, that occurs at runtime.
 * we can handle it by wrapping it in try block and catch the exception in
 * catch block. When exception type is not known we can catch Generic exception
 * 'Exception' type.
 */
