package com.hughes.exercises;

public class ConstructorExample {
	private String firstName;
	public ConstructorExample() {
		System.out.println("Unarametrised Constructor");
	}
	ConstructorExample(String first){
		firstName=first;
		System.out.println("Paraeterised Constructor: " + first);
	}
	public void display() {
		System.out.println("Function overloaded");
	}
	public void display(long mobile) {
		System.out.println("Function overloaded: " + mobile);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorExample p = new ConstructorExample();
		p.display(7854122356l);
	}

}
