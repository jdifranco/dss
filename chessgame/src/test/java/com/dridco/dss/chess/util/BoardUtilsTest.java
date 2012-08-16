package com.dridco.dss.chess.util;

import junit.framework.Assert;

import org.junit.Test;

/**
 * 
 * @author jdifranco
 *
 */
public class BoardUtilsTest {
	
	@Test
	public void testConvertIntegerToChar() {
		Assert.assertEquals('B' , BoardUtils.convertIntegerToChessColumnName(2));
	}
}
