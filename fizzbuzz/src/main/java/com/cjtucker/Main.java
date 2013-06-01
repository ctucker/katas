package com.cjtucker;

public class Main {
	public static void main(String[] strings) {
		FizzBuzzCalculator fizzBuzzCalculator = new FizzBuzzCalculator();
		for (int i = 1; i <= 100; i++) {
			String output = fizzBuzzCalculator.fizzBuzz(i);
			System.out.println(output);
		}
	}

}
