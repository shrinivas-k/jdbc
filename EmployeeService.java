package com.te.EmployeeServices;

import com.te.bean.EmployeeData;

public interface EmployeeService {
	public EmployeeData getSingleRecord(int id);
	 public void getAllRecords();
	 public void insertrecord(EmployeeData a);
}
