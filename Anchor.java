package com.hughes.exercises;

public class Anchor {

	private boolean status;
	public void callfunction(boolean stat) {
		status = stat;
		if(status) System.out.println("Switch is ON");
		else	System.out.println("Switch is OFF");
	}

}
