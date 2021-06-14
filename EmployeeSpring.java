package com.te.dao;

import com.te.bean.EmployeeData;

public class EmployeeSpring  implements EmployeeDao{

	@Override
	public EmployeeData getSingleRecord(int id) {
		System.out.println("spring");
		return null;
	}

	@Override
	public void getAllRecords() {
		System.out.println("spring");
		
	}

	@Override
	public void insertrecord(EmployeeData a) {
		System.out.println("spring");
	}

}
