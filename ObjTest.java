package com.hughes.exercises;

class Obj{

}

public class ObjTest {
	{
		System.out.println("Object from unnamed block");
	}
	static {
		System.out.println("HEllo");
		display();
	}
	public static void display() {
		System.out.println("Display....");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Obj test = new Obj();
//		test.display();
	}

}
