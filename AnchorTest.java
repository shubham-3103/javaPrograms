package com.hughes.exercises;


abstract class DataTransfer{
	public abstract void sendSms();
	public abstract void sendEmail();
	public abstract void sendPushNotification();
	public void display() {
		System.out.println("Message delivered....");
	}
}

public class AnchorTest extends DataTransfer{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnchorTest obj = new AnchorTest();
		obj.sendSms();
		obj.sendEmail();
	}

	public void sendSms() {
		// TODO Auto-generated method stub
		System.out.println("Sending SMS....");
	}

	public void sendEmail() {
		// TODO Auto-generated method stub
		System.out.println("Sending Email....");
	}

	public void sendPushNotification() {
		// TODO Auto-generated method stub
		System.out.println("Sending Push Notification....");
	}

}
