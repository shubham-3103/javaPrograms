package com.edu.thread;

class UserThread1 extends Thread {
	public void run() {
		try {
			for (int i = 0; i < 3; i++) {
				Thread.sleep(400);
				System.out.println(this.getName() + " " + i);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 
		// System.out.println("Thread Started="+this.getName()+this.getId());
	}
}
 
public class ThreadExample {
 
	public static void main(String[] args) {
 
		UserThread1 tobj = new UserThread1();
		UserThread1 tobj1 = new UserThread1();
		tobj.setName("Srinivas");
		tobj1.setName("Hughes");
		//start
		tobj1.start();//until we want start thread will not run at all.
		try {
			tobj1.join();
			tobj.start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

 
	}
 
}