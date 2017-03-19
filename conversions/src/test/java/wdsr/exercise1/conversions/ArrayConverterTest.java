package wdsr.exercise1.conversions;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Before;
import org.junit.Test;

import wdsr.exercise1.conversions.ArrayConverter;

public class ArrayConverterTest {
	private ArrayConverter arrayConverter;

	@Before
	public void setup() {
		arrayConverter = new ArrayConverter();
	}

	@Test(expected=IllegalArgumentException.class)
	public void testConvertToInts_shouldRaiseAnExceptionForNullArgument() {
		// given
		String[] args = null;
		
		// when
		arrayConverter.convertToInts(args);
		
		// then
		// empty
	}

	@Test(expected=IllegalArgumentException.class)
	public void testConvertToInts_shouldRaiseAnExceptionForEmptyArgument() {
		// given
		String[] args = {};
		
		// when
		arrayConverter.convertToInts(args);
		
		// then
		// empty
	}

	@Test
	public void testConvertToInts_shouldReturnTheOnlyValue() {
		// given
		String[] args = { "2" };
		
		// when
		int[] result = arrayConverter.convertToInts(args);;
		
		// then
		assertThat(2, is(equalTo(result[0])));
	}

	@Test
	public void testConvertToInts_shouldReturnComparisonBetweenTablesOfStrings() {
		// given
		String[] args = { "2", "-1", "0", "2", "9", "-6" };
		
		// when
		int[] result = arrayConverter.convertToInts(args);
		int[] expected = {2,-1,0,2,9,-6};
		
		// then
		for(int i=0; i<expected.length; ++i){
			assertThat(expected[i], is(equalTo(result[i])));
		}
	}

	@Test(expected=NumberFormatException.class)
	public void testConvertToInts_shouldRaiseAnExceptionForLetterArgument() {
		// given
		String[] arg = { "a" };
		
		// when
		arrayConverter.convertToInts(arg);
		
		// then
		// empty
	}

	@Test(expected=NumberFormatException.class)
	public void testConvertToInts_shouldRaiseAnExceptionForCharacterArgument() {
		// given
		String[] arg = { "+" };
		
		// when
		arrayConverter.convertToInts(arg);
		
		// then
		// empty
	}
}
