package com.wiley.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("obj")
public class Student {
	
	@Value("Shreyash")
	private String studentName;
	
	@Value("Airoli")
	private String city;
	
	@Value("${mycities}")
	private List<String> cities;
	
	
	public Student(String studentName, String city, List<String> cities) {
		super();
		this.studentName = studentName;
		this.city = city;
		this.cities = cities;
	}
	public List<String> getCities() {
		return cities;
	}
	public void setCities(List<String> cities) {
		this.cities = cities;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + ", cities=" + cities + "]";
	}
	
}
