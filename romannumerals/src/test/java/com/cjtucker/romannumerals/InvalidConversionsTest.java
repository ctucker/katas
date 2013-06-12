package com.cjtucker.romannumerals;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;

public class InvalidConversionsTest {

	@Test(expected = IllegalArgumentException.class)
	public void shouldRaiseAnExceptionForZero() {
		assertThat(new RomanNumeralConverter().toRomanNumeral(0), is(nullValue()));
	}

	@Test(expected = IllegalArgumentException.class)
	public void shouldRaiseAnExceptionForNegativeNumbers() {
		assertThat(new RomanNumeralConverter().toRomanNumeral(-1), is(nullValue()));
	}

}
