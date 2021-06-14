package com.te.jdbc;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class SelectStatic {

	public static void main(String[] args) {
		Connection con =null;
		ResultSet rs =null;
		Statement stmt=null;
		Employee emp=new Employee();
		try {
			FileInputStream fis=new FileInputStream("properties.properties");
			Properties p=new Properties();
			p.load(fis);
			con=DriverManager.getConnection(p.getProperty("dburl"),p.getProperty("user"),p.getProperty("pw"));
			
			
			String dburl="jdbc:mysql://localhost:3306/employee_info?user=root&password=root";
			con=DriverManager.getConnection(dburl);
			String query="select * from employeedata where empid=?;";
			
			stmt=con.createStatement();
			rs =stmt.executeQuery(query);
			while(rs.next()) {
				((Employee) emp).setEmpid(rs.getInt("empid"));
				((Employee) emp).setName(rs.getString("name"));
				((Employee) emp).setSalary(rs.getInt("salary"));
				((Employee) emp).setDoj(rs.getDate("date"));
			}
		}
			catch (Exception e) {
				e.printStackTrace();
			}
		System.out.println(emp.empid +" "+emp.name+""+emp.salary+""+emp.doj);
	}
}
