package com.cjtucker.romannumerals;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ValidConversionsTest {

	private final int decimalValue;
	private final String expectedRomanNumerals;

	@Parameters(name = "{index}: roman numerals of {0} should equal {1}")
	public static Iterable<Object[]> data() {
		return Arrays.asList(new Object[][] {
				{ 1   , "I"    },
				{ 2   , "II"   },
				{ 5   , "V"    },
				{ 6   , "VI"   },
				{ 4   , "IV"   },
				{ 10  , "X"    },
				{ 11  , "XI"   },
				{ 17  , "XVII" },
				{ 14  , "XIV"  },
				{ 20  , "XX"   },
				{ 29  , "XXIX" },
				{ 30  , "XXX"  },
				{ 50  , "L"    },
				{ 40  , "XL"   },
				{ 78  , "LXXVIII" },
				{ 100 , "C" },
				{ 90  , "XC" },
				{ 94  , "XCIV" },  // Two special cases in a row!
				{ 500 , "D" },
				{ 400 , "CD" },
				{ 444 , "CDXLIV" }, // Three special cases in a row!
				{ 446 , "CDXLVI" }, // Two special cases then a normal case
				{ 1000, "M" },
				{ 900 , "CM" },
				{ 1994, "MCMXCIV"}, // Normal, then three special cases
				{ 1996, "MCMXCVI"},  // Normal, two special cases, and normal
				{ 5000, "MMMMM" }, // No more letters this far up..
				// And include the examples from the readme, just to be sure. :-)
				{ 3572, "MMMDLXXII" },
				{ 52, "LII" },
				{ 3, "III" }
		});
	}

	public ValidConversionsTest(int decimalValue, String expectedRomanNumerals) {
		this.decimalValue = decimalValue;
		this.expectedRomanNumerals = expectedRomanNumerals;
	}

	@Test
	public void verifyConversion() {
		assertThat(new RomanNumeralConverter().toRomanNumeral(decimalValue), is(equalTo(expectedRomanNumerals)));
	}

}
