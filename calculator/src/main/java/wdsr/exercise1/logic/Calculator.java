package wdsr.exercise1.logic;

import org.apache.commons.lang3.math.NumberUtils;

/**
 * Created by Marek on 14.02.2016.
 */
public class Calculator {
    public int min(int... values) {
        return NumberUtils.min(values);
    }

    public int max(int... values) {
        if (values == null || values.length == 0) {
        	throw new IllegalArgumentException("Null or empty argument: "+values);
        };

        int result = values[0];
        for (int i = 1; i < values.length; ++i) {
        	if (values[i] > result) {
        		result = values[i];
        	}
        }
        return result;
    }
}
