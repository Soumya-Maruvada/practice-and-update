package com.cg.practicetwo.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cg.practicetwo.dto.Employee;

@Repository("employeeDao")
public class EmployeeDaoImpl implements IEmployeeDao {

	@PersistenceContext
	EntityManager entitymanager;

	@Override
	public Employee searchEmployee(int id) {
		Employee employee = entitymanager.find(Employee.class, id);
		return employee;
	}

	@Override
	public boolean updateEmployee(Employee emp) {
		try{
			entitymanager.merge(emp);
			entitymanager.flush();
			return true;
		}catch(Exception e){
			return false;
		}
	}
	
}
