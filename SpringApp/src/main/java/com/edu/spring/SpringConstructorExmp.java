package com.edu.spring;

public class SpringConstructorExmp {
	private int a;
	private int b;
	
	SpringConstructorExmp(int a, int b){
		this.a=a;
		this.b=b;
	}
	
	public void add() {
		System.out.println(a+b);
	}
	public void sub() {
		System.out.println(a-b);
	}
}
