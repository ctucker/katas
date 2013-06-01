package com.cjtucker;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.startsWith;

public class MainTest {

	@Test
	public void shouldPrint1OnTheFirstLine() {
		ByteArrayOutputStream stdoutBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(stdoutBuffer));

		Main.main(new String[]{});

		String output = stdoutBuffer.toString();
		assertThat(output, startsWith("1\n"));
	}

}
