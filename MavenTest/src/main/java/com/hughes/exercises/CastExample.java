package com.hughes.exercises;
/*
 * i/p: "2345"
 * o/p: 2345
 * */
public class CastExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char w = '8';
		int r = Character.getNumericValue(w);
		System.out.println(r);
		
		String str = "2345";
		System.out.println(Integer.parseInt(str));
	}

}
