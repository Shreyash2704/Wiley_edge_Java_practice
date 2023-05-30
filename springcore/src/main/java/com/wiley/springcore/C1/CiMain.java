package com.wiley.springcore.C1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wiley.springcore.Reftype.WileyA;

public class CiMain {

	public static void main(String[] args) {
		ApplicationContext context = 
	    		   new ClassPathXmlApplicationContext("com/wiley/springcore/C1/config.xml");
	      Person wts1 = (Person) context.getBean("p1");
	      System.out.println(wts1);

	}

}
