package com.wiley.springcore.Reftype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wiley.springcore.Student;

public class RefMain {

	public static void main(String[] args) {
		ApplicationContext context = 
	    		   new ClassPathXmlApplicationContext("com/wiley/springcore/Reftype/config.xml");
	       WileyA wts1 = (WileyA) context.getBean("waref");
	       WileyB wts2 = (WileyB) context.getBean("wbref");
	       
	       System.out.println(wts1);
	       System.out.println(wts2);

	}

}
