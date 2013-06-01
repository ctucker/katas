package com.cjtucker;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

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
		List<String> allLines = runAndCaptureOutputLines();
		assertThat(allLines.get(0), is(equalTo("1")));
	}

	@Test
	public void shouldPrintOneHundredTotalLines() {
		List<String> allLines = runAndCaptureOutputLines();
		assertThat(allLines, hasSize(100));
	}

	@Test
	public void shouldPrint100OnTheLastLine() {
		List<String> allLines = runAndCaptureOutputLines();
		assertThat(allLines.get(99), is(equalTo("100")));
	}

	private List<String> runAndCaptureOutputLines() {
		Main.main(new String[] {});
		String output = stdoutBuffer.toString();
		return Arrays.asList(output.split(System.getProperty("line.separator")));
	}

}
