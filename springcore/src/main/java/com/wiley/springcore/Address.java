package com.wiley.springcore;

public class Address {
	private String flat_no;
	private String city_name;
	private String state_name;
	private int pin_code;
	public String getFlat_no() {
		return flat_no;
	}
	public void setFlat_no(String flat_no) {
		this.flat_no = flat_no;
	}
	public String getCity_name() {
		return city_name;
	}
	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}
	public String getState_name() {
		return state_name;
	}
	
	
	public void setState_name(String state_name) {
		this.state_name = state_name;
	}
	public int getPin_code() {
		return pin_code;
	}
	public void setPin_code(int pin_code) {
		this.pin_code = pin_code;
	}

	@Override
	public String toString() {
		return "Address [flat_no=" + flat_no + ", city_name=" + city_name + ", state_name=" + state_name + ", pin_code="
				+ pin_code + "]";
	}
}
