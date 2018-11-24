package com.cg.practicetwo.service;

import com.cg.practicetwo.dto.Employee;

public interface IEmployeeService {

	Employee searchEmployee(int id);

	boolean updateEmployee(Employee emp);

}
