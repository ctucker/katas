package com.cjtucker;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.Matchers.equalTo;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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
	
	@Test
	public void shouldPrint1OnFirstLine() {
		Main.main(new String[] {});
		
		String output = stdoutBuffer.toString();
		String[] allLines = output.split(System.getProperty("line.separator"));
		
		assertThat(allLines[1 - 1], equalTo("1"));
	}
	
	@Test
	public void shouldPrint2OnSecondLine() {
		Main.main(new String[] {});
		
		String output = stdoutBuffer.toString();
		String[] allLines = output.split(System.getProperty("line.separator"));
		
		assertThat(allLines[2 - 1], equalTo("2"));
	}
	
	@Test
	public void shouldPrintFizzOnThirdLine() {
		Main.main(new String[] {});

		String output = stdoutBuffer.toString();
		String[] allLines = output.split(System.getProperty("line.separator"));

		assertThat(allLines[3 - 1], equalTo("FIZZ"));
	}

	@Test
	public void shouldPrint4OnForthLine() {
		Main.main(new String[] {});
		
		String output = stdoutBuffer.toString();
		String[] allLines = output.split(System.getProperty("line.separator"));
		
		assertThat(allLines[4 - 1], equalTo("4"));
	}
	
	@Test
	public void shouldPrintBuzzOnFifthLine() {
		Main.main(new String[] {});

		String output = stdoutBuffer.toString();
		String[] allLines = output.split(System.getProperty("line.separator"));

		assertThat(allLines[5 - 1], equalTo("BUZZ"));
	}
	
	@Test
	public void shouldPrintFizzBuzzOnFifteenthLine() {
		Main.main(new String[] {});
		
		String output = stdoutBuffer.toString();
		String[] allLines = output.split(System.getProperty("line.separator"));
		
		assertThat(allLines[15 - 1], equalTo("FIZZBUZZ"));
	}
	
}
