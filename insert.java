package com.te.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;

public class insert {
	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		student s=new student();
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			String dburl="jdbc:mysql://localhost:3306/employee_info";
			con=DriverManager.getConnection(dburl,"root","root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			 String query = "update student1 set rollno=?,name =?,marks=?";
		      PreparedStatement preparedStmt =(PreparedStatement) con.prepareStatement(query);
		      stmt=con.createStatement();
		    s.setRollno(6);
		    s.setName("shrini");
		    s.setMarks(30);
				int n=stmt.executeUpdate(query);
				System.out.println(n+"number of rows affected");stmt=con.createStatement();


			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
}
