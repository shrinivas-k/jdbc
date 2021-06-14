package com.te.EmployeeServices;

import com.te.bean.EmployeeData;
import com.te.dao.EmployeeDao;
import com.te.dao.getDao;

public class EmployeeServicesImpl implements EmployeeService {
    getDao daoImpl=new getDao();
    EmployeeDao dao=daoImpl.getDaoImpl();
	@Override
	public EmployeeData getSingleRecord(int id) {
		// TODO Auto-generated method stub
		if(id<0) {
			return null;
		}else {
			System.out.println("employee service layer");
			return dao.getSingleRecord(id);
		}
	}

	@Override
	public void getAllRecords() {
		System.out.println("fetchin all data");
		
	}

	@Override
	public void insertrecord(EmployeeData a) {
		System.out.println("Inserted");
		
	}

}
