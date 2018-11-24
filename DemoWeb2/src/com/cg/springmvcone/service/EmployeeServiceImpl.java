package com.cg.springmvcone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.springmvcone.dao.IEmployeeDao;
import com.cg.springmvcone.dto.copy.Employee;

@Service("employeeService")
@Transactional
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	IEmployeeDao employeeDao;

	@Override
	public int addEmployeeData(Employee emp) {

		return employeeDao.addEmployeeData(emp);
	}

	@Override
	public List<Employee> showAllEmployee() {

		return employeeDao.showAllEmployee();
	}

	@Override
	public void deleteEmployee(int empId) {

		employeeDao.deleteEmployee(empId);
	}

	@Override
	public boolean updateEmployee(Employee emp) {
		
		return employeeDao.updateEmployee(emp);
	}

	@Override
	public Employee searchEmployee(int id) {

		return employeeDao.searchEmployee(id);
	}


	
	

}
