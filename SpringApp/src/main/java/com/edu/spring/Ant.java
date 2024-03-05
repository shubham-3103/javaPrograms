package com.edu.spring;

public class Ant {
	private String firstName;
	private String lastname;
	Ant(){
		
	}
	Ant(String a, String b){
		firstName=a;
		lastname=b;
	}
	public void display() {
		System.out.println(firstName+" "+lastname);
	}
}
