package com.wiley.springcore.autowired.Annotation;

import java.util.ArrayList;
import java.util.List;

public class Phone {
	private ArrayList<Integer> phones;

	public ArrayList<Integer> getPhones() {
		return phones;
	}

	public void setPhones(ArrayList<Integer> phones) {
		this.phones = phones;
	}

	@Override
	public String toString() {
		return "Phone [phones=" + phones + "]";
	}

	public Phone(ArrayList<Integer> phones) {
		super();
		this.phones = phones;
	}

	public Phone() {
		super();
	}
}
