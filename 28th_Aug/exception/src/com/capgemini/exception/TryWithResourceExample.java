package com.capgemini.exception;

import java.util.Scanner;

public class TryWithResourceExample {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Try With Resource");
		}
	}
}
