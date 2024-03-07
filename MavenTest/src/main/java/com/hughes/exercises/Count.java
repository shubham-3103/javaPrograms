package com.hughes.exercises;

/*
 * Count number of alphabet, number and total number of string
 * 
 * */

/**
 * @author shubh
 *
 */
public class Count {
	public static void main(String[] args) {
		String Data = "aksajd5676@$%^";
		int Alpha = 0;
		int Number = 0;
		int Total = 0;
		for(int i=0;i<Data.length();i++) {
			if(Data.charAt(i)>='a' && Data.charAt(i)<='z' || Data.charAt(i)>='A' && Data.charAt(i)<='Z' )	Alpha++;
			else if(Data.charAt(i)>='0' && Data.charAt(i)<='9')	Number++;
			Total++;
		}
		System.out.println("Alpha: "+Alpha+" "+"Number: "+Number+" "+"Total: "+Total);
	}
}
