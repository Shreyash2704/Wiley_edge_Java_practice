package com.wiley.springcore.lifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LCMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/wiley/springcore/lifeCycle/config.xml");
       Pizza p = (Pizza) context.getBean("pizza");
       System.out.println(p);
       context.registerShutdownHook();
	}

}
