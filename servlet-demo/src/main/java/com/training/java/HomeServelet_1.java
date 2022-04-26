package com.training.java;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.service.HomeService;

/**
 * Servlet implementation class HomeServelet_1
 */
//@WebServlet("/HomeServelet_1")
@WebServlet("/home_1")
public class HomeServelet_1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con ;
    /**
     * @throws ClassNotFoundException 
     * @throws SQLException 
     * @see HttpServlet#HttpServlet()
     */
    public HomeServelet_1() throws ClassNotFoundException, SQLException {
        super();
        // TODO Auto-generated constructor stub
//        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
//		
//		String url = "jdbc:sqlserver://localhost:1433;"
//				+"databaseName=MarsLearning;"+
//				"encrypt=true;trustServerCertificate=true";
//		
//		String user = "sa";
//		
//		String password = "bigStrongPwd";
//		
//		con =DriverManager.getConnection(url,user,password);  
//		if(con!=null) {
//			System.out.println("Connection established Successfully!!");
//		}
//		else {
//			System.out.println("Connection Refused!!");
//		}
        
    }

    String name = null;
    public void init() {
    	name = "Mars Returnship";
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
//		response.setContentType("text/html");
//		PrintWriter out = response.getWriter();
//		out.println("<HTML>");
//		out.println("<HEAD>");
//		out.println("<TITLE>Servlet Page</TITLE>");
//		out.println("<HEAD>");
//		out.println("<BODY>");
//		out.println("<H1>"+name+"</h1><h2>This is my first servlet page</H2>");
//		String contextPath = request.getContextPath();
//		out.println("Context Path = "+contextPath);
//		out.println("</BODY>");
//		out.println("</HTML>");
		
		//System.out.println("Reached Servlet");
		//response.sendRedirect("home.jsp");
		
		//http://localhost:8080/servlet-demo/home.jsp
		//When we redirect the URL will show the html name and data being redirected.
		//Instead of redirecting I want to forward this request to some other component to handle
		//use request dispatcher. The URL will not show the redirection and data. this is more secure
		//http://localhost:8080/servlet-demo/home_1
		//request.setAttribute("userName", name);
		String userName = request.getParameter("uname");
		String password = request.getParameter("pwd");
		System.out.println("validating credentials..."+userName+"-"+password);
		
		HomeService service = new HomeService();
		
		try {
			if (service.validateUser(userName, password)) {
				request.setAttribute("userName", userName);
				RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
				rd.forward(request, response);
			}
			else {
				RequestDispatcher rd = request.getRequestDispatcher("InvalidAccess.jsp");
				rd.forward(request, response);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		if(con!=null) {
//			try {
//				String Query = "select * from mluser where name = ? and password = ?";
//				
//				PreparedStatement stmt =con.prepareStatement(Query);
//				
//				stmt.setString(1, userName);	
//				stmt.setString(2,password);
//				ResultSet rs = stmt.executeQuery();
//				
//				if(rs.next()) {
//					request.setAttribute("userName", userName);
//					RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
//					rd.forward(request, response);
//				}
//				else {
//					RequestDispatcher rd = request.getRequestDispatcher("InvalidAccess.jsp");
//					rd.forward(request, response);
//				}
//			}
//			catch (SQLException e) {
//				System.out.println("SQL exception occured");
//			}
//			
//		}
		
//		if(userName.equalsIgnoreCase("priya")&&
//				password.equalsIgnoreCase("password")) {
//			request.setAttribute("userName", userName);
//			RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
//			rd.forward(request, response);
//		}
//		else {
//			RequestDispatcher rd = request.getRequestDispatcher("InvalidAccess.jsp");
//			rd.forward(request, response);
//		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
