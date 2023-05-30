package com.wiley.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = 
    		   new ClassPathXmlApplicationContext("config.xml");
       Student wts1 = (Student) context.getBean("wileyStudent1");
       Student wts2 = (Student) context.getBean("wileyStudent2");
       
       //Student wts4 = (Student) context.getBean("wileyList");
       System.out.println(wts1.toString());
       System.out.println(wts2.toString());
      
    }
}
