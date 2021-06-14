package com.te.dao;

import com.te.bean.EmployeeData;

public class EmployeeHibernet implements EmployeeDao {

	@Override
	public EmployeeData getSingleRecord(int id) {
		System.out.println("this is hibernet");
		return null;
	}

	@Override
	public void getAllRecords() {
		System.out.println("hibernet");
		
	}

	@Override
	public void insertrecord(EmployeeData a) {
		System.out.println("hibernet");
		
	}

}
