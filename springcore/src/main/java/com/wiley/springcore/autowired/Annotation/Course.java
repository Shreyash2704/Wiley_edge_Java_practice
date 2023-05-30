package com.wiley.springcore.autowired.Annotation;

import java.util.Map;

public class Course {
	private Map course;

	public Map getCourse() {
		return course;
	}

	public void setCourse(Map course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Course [course=" + course + "]";
	}

	public Course(Map course) {
		super();
		this.course = course;
	}

	public Course() {
		super();
	}
	
}
