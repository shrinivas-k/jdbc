package com.te.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.te.bean.EmployeeData;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public EmployeeData getSingleRecord(int id) {
		EmployeeData empData=new EmployeeData();
	    try {
	    	String dburl="jdbc:mysql://localhost:3306/employee_info";
	    	Connection con=DriverManager.getConnection(dburl,"root","root");
	    	Statement stmt=con.createStatement();
	    	String query="select * from employeedata where empid="+id+";";
	    	ResultSet rs= stmt.executeQuery(query);
	    	while(rs.next()) {
	    		empData.setEmpid(rs.getInt("empid"));
	    		empData.setName(rs.getString("name"));
	    		empData.setSalary(rs.getInt("salary"));
	    		empData.setDoj(rs.getDate("doj"));
	    	}
	    }catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
		return empData;
	}

	@Override
	public void getAllRecords() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertrecord(EmployeeData a) {
		// TODO Auto-generated method stub
		
	}

}
