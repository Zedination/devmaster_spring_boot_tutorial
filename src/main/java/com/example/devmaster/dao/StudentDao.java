package com.example.devmaster.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.devmaster.entity.Student;

@Repository
public class StudentDao {

	@Autowired
	private EntityManager entityManager;
	
	public List<Student> getStudents() {
		String hql = "select st from Student st";
		TypedQuery<Student> query = entityManager.createQuery(hql, Student.class);
		return query.getResultList();
	}
}
