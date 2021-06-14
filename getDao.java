package com.te.dao;

public class getDao {
String type="jdbc";
public EmployeeDao getDaoImpl() {
	if(type.equalsIgnoreCase("jdbc")) {
		return new EmployeeDaoImpl();
		
	}else if (type.equalsIgnoreCase("hibernet")) {
		return new EmployeeHibernet();
	}else if (type.equalsIgnoreCase("spring")) {
		return new EmployeeSpring();
	}
	return null;
}
}
