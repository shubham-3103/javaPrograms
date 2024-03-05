package com.edu.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class TestConstructor {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource r = new ClassPathResource("utils.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		ConstructorListExample s = (ConstructorListExample) factory.getBean("ls");
		s.display();
	}
}
