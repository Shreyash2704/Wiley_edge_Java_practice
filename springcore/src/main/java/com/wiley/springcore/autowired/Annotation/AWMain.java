package com.wiley.springcore.autowired.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wiley.springcore.autowired.Annotation.Emp;

public class AWMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com\\wiley\\springcore\\autowired\\Annotation\\autowiredconfig.xml"); 
	    Emp emp1 = (Emp) context.getBean("emp1");
	    System.out.println(emp1);
	    System.out.println(emp1.getPhones().getClass().getName());

	}

}
