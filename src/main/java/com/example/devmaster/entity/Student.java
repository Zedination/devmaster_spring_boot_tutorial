package com.example.devmaster.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "student")
@Data
public class Student {

	@Id
	private String studentId;
	
	private String studentName;
	
	private String clazz;
	
	private String gender;
}
