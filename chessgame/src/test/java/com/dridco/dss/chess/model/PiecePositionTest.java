package com.dridco.dss.chess.model;

import junit.framework.Assert;

import org.junit.Test;

import com.dridco.dss.chess.model.PiecePosition;

/**
 * 
 * @author jdifranco
 *
 */
public class PiecePositionTest {
	
	PiecePosition position1 = new PiecePosition(2, 2);
	PiecePosition position2 = new PiecePosition(3, 3);
			
	@Test
	public void testEquals() {
		// Null compare
		Assert.assertFalse("PiecePosition is not null", position1.equals(null));
		
		// Diferent position
		Assert.assertFalse("PiecePosition1 is different from PiecePosition2", position1.equals(position2));
		
		// Same position
		Assert.assertTrue("PiecePosition1 is the same having the same position", position1.equals(new PiecePosition(2, 2)));
	}
	
}
