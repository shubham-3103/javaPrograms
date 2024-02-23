package com.hughes.exercises;
/*
 * i/p: Hyderabad
 * o/p: dabaredyH
 * */
/**
 * @author shubh
 *
 */
public class ReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String city = "Hyderabad";
		int size = city.length();
		String reverse = "";
		for(int i=size-1;i>=0;i--){
			reverse+=city.charAt(i);
		}
		System.out.println("Original: "+city);
		System.out.println("Reverse: "+reverse);
	}

}
