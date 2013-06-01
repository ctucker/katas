package com.cjtucker;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.startsWith;

public class MainTest {

	private ByteArrayOutputStream stdoutBuffer;
	private PrintStream originalStdout;

	@Before
	public void setUp() throws Exception {
		stdoutBuffer = new ByteArrayOutputStream();
		originalStdout = System.out;
		System.setOut(new PrintStream(stdoutBuffer));
	}

	@After
	public void tearDown() throws Exception {
		System.setOut(originalStdout);
	}

	@Test
	public void shouldPrint1OnTheFirstLine() {

		Main.main(new String[] {});

		String output = stdoutBuffer.toString();
		assertThat(output, startsWith("1\n"));
	}

	@Test
	public void shouldPrintOneHundredTotalLines() {
		Main.main(new String[] {});

		String output = stdoutBuffer.toString();
		String[] allLines = output.split(System.getProperty("line.separator"));
		assertThat(Arrays.asList(allLines), hasSize(100));
	}

}
