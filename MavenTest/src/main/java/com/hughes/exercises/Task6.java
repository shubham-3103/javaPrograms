package com.hughes.exercises;
/*
 * String a = "Computer"
 * o/p: r e t u p m o C   //reverse it with spaces
 * */
public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Computer";
		String output = "";
		for(int i=a.length()-1;i>=0;i--) {
			output+=String.valueOf(a.charAt(i)+" ");
		}
		System.out.println(output.trim());
	}

}
