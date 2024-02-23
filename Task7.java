package com.hughes.exercises;
/*
 * 1) Display Alphabet reverse order using do while
 * 2) Display the given string as below: ----------Already Done in Task 6---------------
 * i/p: computer
 * o/p: c
 * o
 * m
 * p
 * u
 * t
 * e
 * r
 * 
 * 3) Start number : 9
 * Ending number: 26 
 * o/p: display values between start and ending number
 * 
 * 4) Based on the input , you need to display whether it is integer or float or character or string. 
 * 5) add values from 239 till 699 using for loop.
 * 		Eg: 2 till 8 
 *  	2+3+4+5+6+7+8=?
 * */
public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//---------------(1)--------------------------
		int count = 'z';
		do {
			System.out.print((char) count+" ");
			count--;
		}while(count>='a');
		System.out.println();
		//---------------(2)--------------------------
		int start = 9;
		int ending = 26;
		while(start<ending-1) {
			start++;
			System.out.print(start+" ");
		}
		System.out.println();
		//---------------(3)--------------------------
		String str = "Hi";
		int num = 5;
		float num2 = 5.2f;
		System.out.println(((Object)str).getClass().getSimpleName());
		System.out.println(((Object)num).getClass().getSimpleName());
		System.out.println(((Object)num2).getClass().getSimpleName());
		//---------------(3)--------------------------
		int sum = 0;
		int num3 = 239;
		while(num3<=699) {
			sum+=num3;
			num3++;
		}
		System.out.println("Sum: "+sum);
	}
}
