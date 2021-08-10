package com.example.devmaster.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.devmaster.dao.StudentDao;
import com.example.devmaster.entity.Student;

@Service
public class DemoService {

	@Autowired
	private StudentDao studentDao;
	
	
	public void printToConsole() {
		System.out.println("================= một method của service =================");
	}
	
	public List<Student> getStudentList(){
		return studentDao.getStudents();
	}
}
