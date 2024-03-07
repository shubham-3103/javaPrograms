package com.hughes.exercises;

import java.util.Scanner;

/*
 * Till six digit
 * i/p: 34567
 * o/p: THirty four THousand Five Hundred and Sixty Seven Only
 * 
 * i/p: 345
 * o/p: Three Hundred and Fourty Four only
 * */
public class Task3 {

	private static String numToWords(int num) {

		if (num == 0) {
			return "Zero";
		}

		String[] units = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };
		String[] teens = { "", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
				"Eighteen", "Nineteen" };
		String[] tens = { "", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };
		String words = "";

		if (num / 100000 > 0) {
			words += numToWords(num / 100000) + " Lakh ";
			num = num % 100000;
		}

		if (num / 1000 > 0) {
			words += numToWords(num / 1000) + " Thousand ";
			num = num % 1000;
		}

		if (num / 100 > 0) {
			words += numToWords(num / 100) + " Hundred ";
			num = num % 100;
		}

		if (num > 0) {
			if (num < 10) {
				words += units[num];
			} else if (num < 20) {
				words += teens[num - 10];
			} else {
				words += tens[num / 10] + " " + units[num % 10];
			}
		}
		return (words);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number (up to 6 digits): ");
		int number = sc.nextInt();

		System.out.println(numToWords(number) + " Only");

	}

}
