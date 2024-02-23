package com.hughes.exercises;

import java.util.Scanner;

/*
 * i/p: 3
 * o/p: +++
 * 
 * i/p: 4
 * o/p: ++++
 * */
public class Task4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.print("+");
		}
	}
}
