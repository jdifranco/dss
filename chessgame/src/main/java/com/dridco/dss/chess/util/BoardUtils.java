package com.dridco.dss.chess.util;

/**
 * 
 * @author jdifranco
 *
 */
public class BoardUtils {
	
	private static int firstLetterPosition = 64;
	
	private BoardUtils() {
		
	}
	
	public static char convertIntegerToChessColumnName(Integer number) {	
		return (char) (firstLetterPosition + number);
	}
}
