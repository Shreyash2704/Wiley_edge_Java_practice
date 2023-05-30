package com.wiley.springcore.beanfactory;

//import javax.annotation.Resource;
import org.springframework.core.io.Resource;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class BeanFactoryMain {

	public static void main(String[] args) {
		Resource res = (Resource) new ClassPathResource("com\\wiley\\springcore\\beanfactory\\bfconfig.xml");
		BeanFactory factory = new XmlBeanFactory(res);
        Employee emp = (Employee) factory.getBean("employee");

        System.out.println(factory.isSingleton("employee"));
        System.out.println(factory.getBean("employee") instanceof Employee);
        System.out.println(factory.isTypeMatch("employee", Employee.class));
        System.out.println(factory.getAliases("employee").length > 0);
	}

}
