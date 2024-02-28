package com.edu.thread;
class Customer {
	int amount = 10000;
 
	synchronized void withdraw(int amount) {
		System.out.println("going to withdraw..."+this.amount);
 
		if (this.amount < amount) {
			System.out.println("Less balance; waiting for deposit..."+this.amount);
			try {
				wait();
			} catch (Exception e) {
			}
		}
		this.amount = this.amount - amount;
		System.out.println("withdraw completed..."+this.amount);
	}
 
	synchronized void deposit(int amount) {
		System.out.println("going to deposit..."+this.amount);
		this.amount = this.amount + amount;
		System.out.println("deposit completed... "+this.amount);
		notify();
	}
}
 
class WaitNotifyExample {
	public static void main(String args[]) {
		Customer c = new Customer();
 
		new Thread() {
			public void run() {
				c.withdraw(15000);
			}
		}.start();
 
		new Thread() {
			public void run() {
				c.deposit(10000);
			}
		}.start();
 
	}
 
}