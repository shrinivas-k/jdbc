package com.te.dao;

import com.te.bean.EmployeeData;

public interface EmployeeDao {
 public EmployeeData getSingleRecord(int id);
 public void getAllRecords();
 public void insertrecord(EmployeeData a);
}
