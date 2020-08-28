package com.capgemini.exception;

@SuppressWarnings("serial")
public class InvalidAmountException extends Exception {

	@Override
	public String getMessage() {
		return "Insufficient funds";
	}
}
