package com.example.devmaster.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.devmaster.entity.Student;
import com.example.devmaster.service.DemoService;

@Controller
public class BaseController {

	@Autowired
	private DemoService demoService;
	
	@Autowired
	@Qualifier("beanDemo")
	private String demoBean;
	
	
	@GetMapping("/")
	public String helloWorld() {
		return "helloPage";
	}
	
	@ResponseBody
	@GetMapping("/test")
	public void testMethod() {
//		demoService.printToConsole();
		System.out.println(demoBean);
	}
	
	@ResponseBody
	@GetMapping("/student-list")
	public List<Student> getStudentList(){
		return demoService.getStudentList();
	}
}
