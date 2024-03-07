package com.hughes.exercises;

class Vehicle{
	public void move() {
		System.out.println("Vehicle is moving");
	}
}

public class BikeClass extends Vehicle{
	
	public void move() {
		System.out.println("Bike is moving");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BikeClass obj = new BikeClass();
		obj.move();
	}

}
