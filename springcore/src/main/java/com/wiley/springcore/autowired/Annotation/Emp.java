package com.wiley.springcore.autowired.Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	@Autowired
	@Qualifier("address")
	private Address address;
	
	@Autowired
	@Qualifier("phones")
	private Phone phones;

	@Autowired
	@Qualifier("courses")
	private Course courses;
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + ", phones=" + phones + ", courses=" + courses + "]";
	}

	public Emp(Address address) {
		super();
		this.address = address;
	}

	public Emp(Address address, Phone phones, Course courses) {
		super();
		this.address = address;
		this.phones = phones;
		this.courses = courses;
	}

	public Phone getPhones() {
		return phones;
	}

	public void setPhones(Phone phones) {
		this.phones = phones;
	}

	public Course getCourses() {
		return courses;
	}

	public void setCourses(Course courses) {
		this.courses = courses;
	}

	public Emp() {
		super();
	}
	
	
}
