package com.cg.springmvcone.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import oracle.net.aso.d;

import org.springframework.stereotype.Repository;

import com.cg.springmvcone.dto.copy.Employee;

@Repository("employeeDao")
public class EmployeeDaoImpl implements IEmployeeDao {
	@PersistenceContext
	EntityManager entitymanager;
	
	@Override
	public int addEmployeeData(Employee emp) {
		entitymanager.persist(emp);
		entitymanager.flush();
		return emp.getEmpId();
	}

	@Override
	public List<Employee> showAllEmployee() {
		Query queryone = entitymanager.createQuery("FROM Employee");
		List<Employee> myList = queryone.getResultList();
		return myList;
	}

	@Override
	public void deleteEmployee(int empId) {
		Query querytwo = entitymanager.createQuery("DELETE FROM Employee WHERE empId=:eid");
		querytwo.setParameter("eid", empId);
		querytwo.executeUpdate();

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

	@Override
	public Employee searchEmployee(int id) {
		Employee employee = entitymanager.find(Employee.class, id);
		return employee;
	}

	/*Query queryfive = entitymanager.createQuery("FROM Employee WHERE empId = :eid");
	queryfive.setParameter("eid",id);
	Employee employee = (Employee) queryfive.getSingleResult();*/

}
