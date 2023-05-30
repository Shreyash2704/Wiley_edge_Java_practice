package com.wiley.springcore.C1;

public class Cert {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Cert [name=" + name + "]";
	}

	public Cert(String name) {
		super();
		this.name = name;
	}
	
}
