package com.cjtucker;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class FizzBuzzCalculatorTest {

	public static final String BUZZ = "BUZZ";
	private static final String FIZZ = "FIZZ";

	private FizzBuzzCalculator fizzBuzzCalculator;

	@Before
	public void setUp() throws Exception {
		fizzBuzzCalculator = new FizzBuzzCalculator();
	}

	@Test
	public void fizzBuzzOf3IsFizz() {
		assertThat(fizzBuzzCalculator.fizzBuzz(3), is(equalTo(FIZZ)));
	}

	@Test
	public void fizzBuzzOf4Is4() {
		assertThat(fizzBuzzCalculator.fizzBuzz(4), is(equalTo("4")));
	}

	@Test
	public void fizzBuzzOf5IsBuzz() {
		assertThat(fizzBuzzCalculator.fizzBuzz(5), is(equalTo(BUZZ)));
	}

	@Test
	public void fizzBuzzOfDifferentMultipleOf3IsFizz() {
		assertThat(fizzBuzzCalculator.fizzBuzz(9), is(equalTo(FIZZ)));
	}


}
