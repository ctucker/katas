package com.cjtucker.romannumerals;

class RomanValue {
	private int decimal;
	private String roman;

	private RomanValue(int decimal, String roman) {
		this.decimal = decimal;
		this.roman = roman;
	}

	static RomanValue of(int decimal, String roman) {
		return new RomanValue(decimal, roman);
	}

	int getDecimal() {
		return decimal;
	}

	String getRoman() {
		return roman;
	}
}
