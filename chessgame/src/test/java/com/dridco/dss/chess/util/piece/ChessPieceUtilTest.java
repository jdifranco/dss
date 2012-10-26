package com.dridco.dss.chess.util.piece;

import junit.framework.Assert;

import org.junit.Test;

import com.dridco.dss.chess.model.coordinate.Coordinates;

/**
 * 
 * @author jdifranco
 * 
 */
public class ChessPieceUtilTest {

	@Test
	public void testIsMovedVertically() {
		Assert.assertTrue(ChessPieceUtil.isMovedVertically(Coordinates.A1, Coordinates.A2));
		Assert.assertFalse(ChessPieceUtil.isMovedVertically(Coordinates.A1, Coordinates.A1));
		Assert.assertFalse(ChessPieceUtil.isMovedVertically(Coordinates.A1, Coordinates.B1));
	}
	
	@Test
	public void testIsMovedHorizontally() {
		Assert.assertTrue(ChessPieceUtil.isMovedHorizontally(Coordinates.A1, Coordinates.B1));
		Assert.assertFalse(ChessPieceUtil.isMovedHorizontally(Coordinates.A1, Coordinates.A1));
		Assert.assertFalse(ChessPieceUtil.isMovedHorizontally(Coordinates.A1, Coordinates.A2));
	}
}
