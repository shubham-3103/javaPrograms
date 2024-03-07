package com.hughes.exercises;

public class WrapperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y=90; //Primitive
		Integer z = Integer.valueOf(y); //Wrapper Class
		System.out.println(z); //z is wrapper
		System.out.println(z.intValue()); // here z is primitive
		
		long a = 50; //Primitive
		Long b = Long.valueOf(a); //Wrapper Class
		System.out.println(b); //b is wrapper
		System.out.println(b.longValue()); //here b is primitive
	}

}
