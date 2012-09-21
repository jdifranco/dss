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
	private static String VALID_CORD_STRING = "A5";
	
	@Test(expected=RuntimeException.class)
	public void testAt_InvalidCordString_should_ThrowException() {
		Coordinates.at(INVALID_CORD_STRING);
	}
	
	@Test
	public void testAt_ValidCordString_should_ReturnRightCoordinate() {
		Assert.assertNotNull(Coordinates.at(VALID_CORD_STRING));
		Assert.assertEquals(Coordinates.at(VALID_CORD_STRING), Coordinates.A5);
	}
	
	@Test(expected=RuntimeException.class)
	public void testAt_InvalidCordPair_should_ThrowException() {
		Coordinates.at('H', 9);
	}
	
	@Test
	public void testAt_ValidCordPair_should_ReturnRightCoordinate() {
		Assert.assertNotNull(Coordinates.at('A', 5));
		Assert.assertEquals(Coordinates.at('A', 5), Coordinates.A5);
	}
	
}
