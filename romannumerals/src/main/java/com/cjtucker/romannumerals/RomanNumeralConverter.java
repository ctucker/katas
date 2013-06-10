package com.cjtucker.romannumerals;

import java.util.List;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;

public class RomanNumeralConverter {

	static final List<RomanValue> LETTER_VALUES = ImmutableList.of(
			RomanValue.of(1000, "M"),
			RomanValue.of(500, "D"),
			RomanValue.of(100, "C"),
			RomanValue.of(50, "L"),
			RomanValue.of(10, "X"),
			RomanValue.of(5, "V"),
			RomanValue.of(1, "I")
	);

	static final List<RomanValue> SPECIAL_CASES = ImmutableList.of(
			RomanValue.of(900, "CM"),
			RomanValue.of(400, "CD"),
			RomanValue.of(90, "XC"),
			RomanValue.of(40, "XL"),
			RomanValue.of(9, "IX"),
			RomanValue.of(4, "IV")
	);

	public String toRomanNumeral(int decimalNumber) {
		Preconditions.checkArgument(decimalNumber > 0);
		return new ValueBuilder(decimalNumber).asRomanNumerals();
	}

}
