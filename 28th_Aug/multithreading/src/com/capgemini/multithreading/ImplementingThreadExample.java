package com.capgemini.multithreading;

public class ImplementingThreadExample implements Runnable {

	public void run() {
		System.out.println("Thread is running...");
	}

	public static void main(String[] args) {

		ImplementingThreadExample implemetingThread = new ImplementingThreadExample();
		Thread thread = new Thread(implemetingThread);
		thread.start();
	}
}
