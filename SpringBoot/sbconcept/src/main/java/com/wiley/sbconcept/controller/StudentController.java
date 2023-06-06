package com.wiley.sbconcept.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wiley.sbconcept.model.Course;
import com.wiley.sbconcept.model.Student;
import com.wiley.sbconcept.repository.CoursesRepo;
import com.wiley.sbconcept.repository.StudentRepo;

@RestController
@RequestMapping(value="/api/student/course",consumes="application/json")
public class StudentController {

	@Autowired
    private StudentRepo studentRepo;

	@Autowired
    private CoursesRepo courseRepo;

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentRepo.save(student);
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return studentRepo.findAll();
    }

    @GetMapping("/{studentId}")
    public Student getStudent(@PathVariable Long studentId) {
        return studentRepo.findById(studentId).orElseThrow(() -> new RuntimeException("Student not found"));
    }

    @GetMapping("/findByName/{name}")
    public List<Student> findStudentsByName(@PathVariable String name) {
        return studentRepo.findByName(name);
    }
    @GetMapping("/search/{price}")
    public List<Course> findCourseLessThan(@PathVariable double price) {
        return courseRepo.findByFeeLessThan(price);
    }

}