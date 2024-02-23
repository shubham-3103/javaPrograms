package com.hughes.exercises;
/*
 * i/p: a b c d e f
 * o/p: f1 e2 d3 c4 b5 a6
 * */
public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "abcdef";
		String output = "";
		int count = 1;
		for(int i=input.length()-1;i>=0;i--) {
			output+=String.valueOf(input.charAt(i))+count+" ";
			count++;
		}
		System.out.println(output);
	}

}
