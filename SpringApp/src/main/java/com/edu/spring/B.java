package com.edu.spring;

public class B {

	A a = null;
	B(){
		a=new A();
	}
	public static void main(String args []) {
		new B().a.display();
	}

}
