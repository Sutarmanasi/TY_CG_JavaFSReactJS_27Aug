package com.capgemini.exception;

public class TestAmount {

	public static void main(String[] args) {

		ValidateAmount validateAmount = new ValidateAmount();
		try {
			validateAmount.validateAmount(40000);
		} catch (InvalidAmountException e) {
			String string = e.getMessage();
			System.err.println(string);
		}
	}
}
