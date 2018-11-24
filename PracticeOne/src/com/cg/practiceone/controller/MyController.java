package com.cg.practiceone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cg.practiceone.dto.CourseDetails;
import com.cg.practiceone.service.ICourseService;



@Controller
public class MyController {

	@Autowired
	ICourseService courseservice;
	
	@RequestMapping(value = "all", method = RequestMethod.GET)
	public String getAll() {
		return "home";

	}
	
	@RequestMapping(value = "showcourse", method = RequestMethod.GET)
	public ModelAndView showCourse() {
		List<CourseDetails> myAllData = courseservice.showCources();
		return new ModelAndView("showcourse", "temp", myAllData);
	}
	
	@RequestMapping(value = "enroll", method = RequestMethod.GET)
	public ModelAndView enroll() {
		List<CourseDetails> myAllData = courseservice.showCources();
		return new ModelAndView("enroll", "temp", myAllData);
	}
	
}
