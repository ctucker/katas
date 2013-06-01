package com.cjtucker;

public class Main {
	public static void main(String[] strings) {
		for (int i = 1; i <= 100; i++) {
			String output = fizzBuzz(i);
			System.out.println(output);
		}
	}

	private static String fizzBuzz(int i) {
		String output = String.valueOf(i);
		if (i == 3) {
			output = "FIZZ";
		}
		return output;
	}
}
