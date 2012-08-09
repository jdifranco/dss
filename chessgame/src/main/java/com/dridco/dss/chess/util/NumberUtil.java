package com.dridco.dss.chess.util;

/**
 * 
 * @author jdifranco
 *
 */
public class NumberUtil {
	
	private static int firstLetterPosition = 64;
	
	private NumberUtil() {
		
	}
	
	public static char convertIntegerToChar(Integer number) {	
		return (char) (firstLetterPosition + number);
	}
}
