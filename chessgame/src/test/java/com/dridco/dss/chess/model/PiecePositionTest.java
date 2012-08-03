package com.dridco.dss.chess.model;

import junit.framework.Assert;

import org.junit.Test;

import com.dridco.dss.chess.model.SquarePosition;

/**
 * 
 * @author jdifranco
 *
 */
public class PiecePositionTest {
	
	SquarePosition position1 = new SquarePosition(2, 2);
	SquarePosition position2 = new SquarePosition(3, 3);
			
	@Test
	public void testEquals() {
		// Null compare
		Assert.assertFalse("PiecePosition is not null", position1.equals(null));
		
		// Diferent position
		Assert.assertFalse("PiecePosition1 is different from PiecePosition2", position1.equals(position2));
		
		// Same position
		Assert.assertTrue("PiecePosition1 is the same having the same position", position1.equals(new SquarePosition(2, 2)));
	}
	
}
