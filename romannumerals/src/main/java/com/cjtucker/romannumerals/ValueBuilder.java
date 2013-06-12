package com.cjtucker.romannumerals;

class ValueBuilder {
	private int fDecimalNumber;
	private final StringBuilder fResult;

	ValueBuilder(int decimalNumber) {
		fDecimalNumber = decimalNumber;
		fResult = new StringBuilder();
	}

	String asRomanNumerals() {
		for (RomanValue entry : RomanNumeralConverter.LETTER_VALUES) {
			addLettersWithValue(entry.getRoman(), entry.getDecimal());
		}
		return fResult.toString();
	}

	private void applySpecialCases(int letterValue) {
		RomanValue potentialSpecialCase = null;
		for (RomanValue entry : RomanNumeralConverter.SPECIAL_CASES) {
			if (entry.getDecimal() > letterValue) {
				potentialSpecialCase = entry;
			}
		}

		if (potentialSpecialCase != null && fDecimalNumber >= potentialSpecialCase.getDecimal()) {
			fResult.append(potentialSpecialCase.getRoman());
			fDecimalNumber -= potentialSpecialCase.getDecimal();
		}
	}

	private void addLettersWithValue(String letter, int letterValue) {
		applySpecialCases(letterValue);
		while (fDecimalNumber >= letterValue) {
			fResult.append(letter);
			fDecimalNumber = fDecimalNumber - letterValue;
		}
	}

}
