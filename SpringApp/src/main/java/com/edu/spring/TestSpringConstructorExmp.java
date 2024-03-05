package com.edu.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestSpringConstructorExmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource r = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		SpringConstructorExmp s = (SpringConstructorExmp) factory.getBean("second");
		System.out.print("Addition: ");
		s.add();
		System.out.print("Substraction: ");
		s.sub();
		
	}

}
