package com.cjtucker;

public class FizzBuzzCalculator {

	public String fizzBuzz(int i) {
		String output = String.valueOf(i);
		if (i == 3) {
			output = "FIZZ";
		}
		return output;
	}

}
