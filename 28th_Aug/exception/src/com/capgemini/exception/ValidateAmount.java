package com.capgemini.exception;

public class ValidateAmount {

	void validateAmount(int amount) throws InvalidAmountException {
		int balance = 50000;
		if (amount > balance) {
			throw new InvalidAmountException();
		} else {
			System.out.println("Withdrow your cash and collect card");
		}
	}
}
