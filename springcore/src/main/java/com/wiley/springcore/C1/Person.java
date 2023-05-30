package com.wiley.springcore.C1;

public class Person {
	private int count;
	private String name;
	private Cert certificate;
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Cert getCertificate() {
		return certificate;
	}
	public void setCertificate(Cert certificate) {
		this.certificate = certificate;
	}
	@Override
	public String toString() {
		return "Person [count=" + count + ", name=" + name + ", certificate=" + certificate + "]";
	}
	public Person(int count, String name, Cert certificate) {
		super();
		this.count = count;
		this.name = name;
		this.certificate = certificate;
	}
	
	
}
