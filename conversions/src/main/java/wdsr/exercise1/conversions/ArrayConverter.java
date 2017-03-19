package wdsr.exercise1.conversions;

import java.util.Arrays;

/**
 * Created by Marek on 14.02.2016.
 */
public class ArrayConverter {
	/**
	 * Converts an array of strings to an array of integers.
	 * @param strings to be converted to integers.
	 * @return array of integers corresponding to the provided strings. Never null.
	 * @throws NullPointerException if the argument is null.
	 * @throws NumberFormatException if any of the strings does not represent an integer value.
	 */
    public int[] convertToInts(String[] strings) {
    	if (strings == null || strings.length == 0) {
        	throw new IllegalArgumentException("Null or empty argument: "+strings);
        };

        return Arrays.stream(strings).mapToInt(Integer::valueOf).toArray();
    }
}
