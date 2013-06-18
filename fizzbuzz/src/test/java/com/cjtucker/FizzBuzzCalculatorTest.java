package com.cjtucker;

import org.junit.Before;
import org.junit.Test;

import static com.cjtucker.FizzBuzzCalculator.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class FizzBuzzCalculatorTest {

	private FizzBuzzCalculator fizzBuzzCalculator;

	@Before
	public void setUp() throws Exception {
		fizzBuzzCalculator = new FizzBuzzCalculator();
	}

	@Test
	public void shouldReturnFizzFor3() {
		assertThat(fizzBuzzCalculator.fizzBuzz(3), is(equalTo(FIZZ)));
	}

	@Test
	public void shouldReturn4For4() {
		assertThat(fizzBuzzCalculator.fizzBuzz(4), is(equalTo("4")));
	}

	@Test
	public void shouldReturnBuzzFor5() {
		assertThat(fizzBuzzCalculator.fizzBuzz(5), is(equalTo(BUZZ)));
	}

	@Test
	public void shouldReturnFizzForDifferentMultipleOf3() {
		assertThat(fizzBuzzCalculator.fizzBuzz(9), is(equalTo(FIZZ)));
	}

	@Test
	public void shouldReturnBuzzForDifferentMultipleOf5() {
		assertThat(fizzBuzzCalculator.fizzBuzz(20), is(equalTo(BUZZ)));
	}

	@Test
	public void shouldReturnFizzBuzzForMultipleOf3And5() {
		assertThat(fizzBuzzCalculator.fizzBuzz(15), is(equalTo(FIZZBUZZ)));
	}

	@Test
	public void shouldReturnFizzBuzzForDifferentMultipleOf3And5() {
		assertThat(fizzBuzzCalculator.fizzBuzz(90), is(equalTo(FIZZBUZZ)));
	}

}
