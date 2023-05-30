package com.wiley.springcore;

import java.util.Arrays;
import java.util.Set;
import java.util.Map;
import java.util.Properties;

public class Student {

	private int studentId;
	private String studentName;
	private Address studentAddress;
	private int[] studentList;
	private Set<Integer> studentSet;
	private Map<String,String> studentMap;
	private Properties prop;
	
	public Properties getProp() {
		return prop;
	}
	public void setProp(Properties prop) {
		this.prop = prop;
	}
	public Map<String, String> getStudentMap() {
		return studentMap;
	}
	public void setStudentMap(Map<String, String> studentMap) {
		this.studentMap = studentMap;
	}
	public Set<Integer> getStudentSet() {
		return studentSet;
	}
	public void setStudentSet(Set<Integer> studentSet) {
		this.studentSet = studentSet;
	}
	public int[] getStudentList() {
		return studentList;
	}
	public void setStudentList(int[] studentList) {
		this.studentList = studentList;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Address getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(Address studentAddress) {
		this.studentAddress = studentAddress;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ ", studentList=" + Arrays.toString(studentList) + ", studentSet=" + studentSet + ", studentMap="
				+ studentMap + ", prop=" + prop + "]";
	}
	
	
	
	
}
