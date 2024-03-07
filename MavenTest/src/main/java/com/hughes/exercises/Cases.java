package com.hughes.exercises;
import java.util.*;
/*
 * i/p: FirstCase
 * o/p: fIRSTcASE
 * */
/**
 * @author shubh
 *
 */
public class Cases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "FirstCase";
		String output = "";
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)>='a' && input.charAt(i)<='z')	output+=String.valueOf(input.charAt(i)).toUpperCase();
			else	output+=String.valueOf(input.charAt(i)).toLowerCase();
		}
		System.out.println(output);
	}

}
