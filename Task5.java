package com.hughes.exercises;
/*
 * i/p: vasu34k@gmail.com
 * o/p: valid email
 * 
 * i/p: bob34kgmail.com
 * o/p: Invalid email
 * */
public class Task5 {
	public static void main(String[] args) {
		String email1 = "vasu34k@gmail.com";
		if(email1.indexOf('@')!=-1 && email1.indexOf('.')!=-1)	System.out.println("Valid email");
		else System.out.println("Not valid");
	}
}
