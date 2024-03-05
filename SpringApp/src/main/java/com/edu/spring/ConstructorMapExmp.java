package com.edu.spring;

import java.util.Map;

public class ConstructorMapExmp {
	private String fullname;
	private Map ls;

	public ConstructorMapExmp() {

	}

	ConstructorMapExmp(String name, Map m) {
		fullname = name;
		ls = m;
	}

	public void display() {
		System.out.println(fullname);
		System.out.println(ls);
	}
}
