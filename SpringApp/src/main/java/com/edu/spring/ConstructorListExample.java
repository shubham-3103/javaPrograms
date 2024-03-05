package com.edu.spring;

import java.util.ArrayList;
import java.util.List;

public class ConstructorListExample {
	private String fullname;
	private List ls;

	public ConstructorListExample() {

	}

	ConstructorListExample(String name, ArrayList m) {
		fullname = name;
		ls = m;
	}

	public void display() {
		System.out.println(fullname);
		System.out.println(ls);
	}
}
