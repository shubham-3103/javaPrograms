package com.edu.thread;

import java.io.*;

import java.util.*;

public class LockingExample {

	// Main driver method

	public static void main(String[] args)

	{

		// Creating object(thread) of class 2

		Thread2 objB = new Thread2();

		objB.start();

		synchronized (objB)

		{

			try {

				// Display message only

				System.out.println(

						"Waiting for Thread 2 to complete...");

				objB.wait();

			}

			catch (InterruptedException e) {

				e.printStackTrace();

			}

			System.out.println("Total is: " + objB.total);

		}

	}

}

class Thread2 extends Thread {

	int total;

	public void run()

	{

		synchronized (this)

		{

			for (int i = 0; i < 10; i++) {

				total += i;

			}

			notify();

		}

	}

}
