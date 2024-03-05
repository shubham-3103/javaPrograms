package com.edu.testwiring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestWiring {
	public static void main(String[] args) {
		Resource r = new ClassPathResource("wiring.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		Base2 s = (Base2) factory.getBean("base2");
		s.base2display();
	}
}
	
