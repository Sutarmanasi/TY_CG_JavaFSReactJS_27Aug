package com.capgemini.multithreading;

public class ExtendingThreadExample extends Thread {

	@Override
	public void run() {
		System.out.println("Thread is running...");
	}

	public static void main(String[] args) {

		ExtendingThreadExample thread = new ExtendingThreadExample();
		thread.start();
	}
}
