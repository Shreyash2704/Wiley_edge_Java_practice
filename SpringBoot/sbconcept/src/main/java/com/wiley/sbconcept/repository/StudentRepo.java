package com.wiley.sbconcept.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wiley.sbconcept.model.Student;

@Repository
public interface StudentRepo extends  JpaRepository<Student, Long> {
    
	List<Student> findByNameContaining(String name);
}
