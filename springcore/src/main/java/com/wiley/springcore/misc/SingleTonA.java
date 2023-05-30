package com.wiley.springcore.misc;

public class SingleTonA {
	private static final SingleTonA obj = new SingleTonA();
	
	public SingleTonA() {
		System.out.println("Single Ton Object s created");
	}
	
	public static SingleTonA getSingleTon() {
		return obj;
	}
	public void sayHello() {
		System.out.println("Say hello to the employeee");
	}
}
