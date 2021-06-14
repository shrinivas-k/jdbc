package com.te.EmployeeServices;

import com.te.bean.EmployeeData;

public class MainClass {
public static void main(String[] args) {
	EmployeeServicesImpl esi=new EmployeeServicesImpl();
	EmployeeData emp=esi.getSingleRecord(3);
	System.out.println(emp.getEmpid());
	System.out.println(emp.getName());
	System.out.println(emp.getSalary());
	System.out.println(emp.getDoj());
}
}
