package com.wiley.springcore.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AWMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com\\wiley\\springcore\\autowired\\autowiredconfig.xml"); 
	    Emp emp1 = (Emp) context.getBean("emp1");
	    System.out.println(emp1);
	}

}
