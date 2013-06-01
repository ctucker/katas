package com.cjtucker;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class FizzBuzzCalculatorTest {

	@Test
	public void fizzBuzzOf4Is4() {
		FizzBuzzCalculator fizzBuzzCalculator = new FizzBuzzCalculator();
		assertThat(fizzBuzzCalculator.fizzBuzz(4), is(equalTo("4")));
	}

}
