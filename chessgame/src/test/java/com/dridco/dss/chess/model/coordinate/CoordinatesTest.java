package com.dridco.dss.chess.model.coordinate;

import junit.framework.Assert;

import org.junit.Test;

/**
 * 
 * @author jdifranco
 *
 */
public class CoordinatesTest {
	
	private static String INVALID_CORD_STRING = "H9";
	private static String INVALID_CORD_STRING2 = "H99";
	private static String VALID_CORD_STRING = "A5";
	
	@Test(expected=RuntimeException.class)
	public void testAt_InvalidCordString_shouldThrowException() {
		Coordinates.at(INVALID_CORD_STRING);
	}
	
	@Test(expected=RuntimeException.class)
	public void testAt_InvalidCordStringMoreCharacters_shouldThrowException() {
		Coordinates.at(INVALID_CORD_STRING2);
	}
	
	@Test
	public void testAt_ValidCordString_shouldReturnRightCoordinate() {
		Assert.assertNotNull(Coordinates.at(VALID_CORD_STRING));
		Assert.assertEquals(Coordinates.A5, Coordinates.at(VALID_CORD_STRING));
		Assert.assertEquals(Coordinates.A5.toString(), Coordinates.at(VALID_CORD_STRING).toString());
	}
	
	@Test(expected=RuntimeException.class)
	public void testAt_InvalidCordPair_shouldThrowException() {
		Coordinates.at('H', 9);
	}
	
	@Test
	public void testAt_ValidCordPair_shouldThrowException() {
		Assert.assertEquals(Coordinates.H8, Coordinates.at('H', 8));
	}
	
	@Test
	public void testAt_ValidCordPair_shouldReturnRightCoordinate() {
		Assert.assertNotNull(Coordinates.at('A', 5));
		Assert.assertEquals(Coordinates.at('A', 5), Coordinates.A5);
	}
	
}
