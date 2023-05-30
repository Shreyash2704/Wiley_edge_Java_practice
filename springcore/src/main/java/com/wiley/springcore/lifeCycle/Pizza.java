package com.wiley.springcore.lifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.InitializingBean;

public class Pizza {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
	public Pizza(double price) {
		super();
		this.price = price;
	}

	public Pizza() {
		super();
	}

	@Override
	public String toString() {
		return "Pizza [price=" + price + "]";
	}
	@PostConstruct
	public void start() {
		System.out.println("Creation of bean");
	}
	@PreDestroy
	public void end() {
		System.out.println("Destroy of bean");
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Before Creation");
	}
	
}
