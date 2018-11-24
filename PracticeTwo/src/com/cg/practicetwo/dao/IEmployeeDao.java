package com.cg.practicetwo.dao;

import com.cg.practicetwo.dto.Employee;

public interface IEmployeeDao {

	Employee searchEmployee(int id);

	boolean updateEmployee(Employee emp);

}
