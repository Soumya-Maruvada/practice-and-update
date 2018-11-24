package com.cg.practicetwo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.practicetwo.dto.Employee;
import com.cg.practicetwo.service.IEmployeeService;

@Controller
public class MyController {
	
	@Autowired
	IEmployeeService employeeservice;
	
	@RequestMapping(value = "all", method = RequestMethod.GET)
	public String getAll() {
		return "search";

	}
	@RequestMapping(value = "dosearch", method = RequestMethod.GET)
	public ModelAndView employeesearch(@RequestParam("eid") int id) {
		
		Employee employee = employeeservice.searchEmployee(id);
		return new ModelAndView("showemployee", "temp", employee);
		
		
	}
	
	@RequestMapping(value = "update")
	public ModelAndView updateEmployee(@Valid @ModelAttribute("emp") Employee employee, BindingResult result,
			Map<String, Object> model) {
		
		if (result.hasErrors()) {
			List<String> myDeg = new ArrayList<>();
			myDeg = new ArrayList<>();
			myDeg.add("SoftWare Engg");
			myDeg.add("Sr Consoltant");
			myDeg.add("Manager");
			model.put("deg", myDeg);
			return new ModelAndView("updateemployee","emp",employee);
		} 
		else
		{
			employeeservice.updateEmployee(employee);
			return new ModelAndView("updatesuccess", "emp", employee);
		}
	}

}
