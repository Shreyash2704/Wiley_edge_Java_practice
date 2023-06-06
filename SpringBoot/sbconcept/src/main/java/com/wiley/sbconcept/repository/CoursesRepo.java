package com.wiley.sbconcept.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wiley.sbconcept.model.Course;
import com.wiley.sbconcept.model.Student;

@Repository
public interface CoursesRepo extends JpaRepository<Course, Long> {
	 List<Course> findByFeeLessThan(double fee);
}
