package com.hughes.exercises;

class Bank{
	public float getHomeLoanRate(float rate) {
		return 0f;
	}
}
class SBI extends Bank{
	public float getHomeLoanRate(float rate) {
		return 8f;
	}
}
class ICICI extends Bank{
	public float getHomeLoanRate(float rate) {
		return 9f;
	}
}
class HSBC extends Bank{
	public float getHomeLoanRate(float rate) {
		return 9.25f;
	}
}
class IDBI extends Bank{
	public float getHomeLoanRate(float rate) {
		return 9.75f;
	}
}

public class Btest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IDBI bank = new IDBI();
		System.out.println(bank.getHomeLoanRate(0));
	}

}
