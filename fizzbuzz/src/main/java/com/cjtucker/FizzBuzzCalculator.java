package com.cjtucker;

public class FizzBuzzCalculator {

	public String fizzBuzz(int i) {
		String output = String.valueOf(i);
		if (i % 3 == 0) {
			output = "FIZZ";
		}
		if (i % 5 == 0) {
			output = "BUZZ";
		}
		if (i % (3 * 5) == 0) {
			output = "FIZZBUZZ";
		}
		return output;
	}

}
