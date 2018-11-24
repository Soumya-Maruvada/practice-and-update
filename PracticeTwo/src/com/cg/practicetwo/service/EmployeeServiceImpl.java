package com.cg.practicetwo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.practicetwo.dao.IEmployeeDao;
import com.cg.practicetwo.dto.Employee;

@Service("employeeService")
@Transactional
public class EmployeeServiceImpl implements IEmployeeService {
	
	@Autowired
	IEmployeeDao employeeDao;
	
	@Override
	public Employee searchEmployee(int id) {
		// TODO Auto-generated method stub
		return employeeDao.searchEmployee(id);
	}

	@Override
	public boolean updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return employeeDao.updateEmployee(emp);
	}

}
