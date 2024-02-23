package com.hughes.exercises;

public class StaticExample {
	
	private static void display() {
		System.out.println("Display activated");
	}
	private void email() {
		System.out.println("Email activated");
		return; //It just returning control back to main
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display();
		StaticExample obj = new StaticExample();
		obj.email();
	}

}
