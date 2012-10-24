package com.dridco.dss.chess.model.piece;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import com.dridco.dss.chess.model.coordinate.Coordinates;

/**
 * 
 * @author jdifranco
 *
 */
public class BishopTest {
	
	private ChessPiece whiteBishopPiece;
	private ChessPiece blackBishopPiece;
	
	@Before
	public void setUp() {
		this.whiteBishopPiece = ChessPiecesFactory.newBishop(ChessPieceColors.WHITE);
		this.blackBishopPiece = ChessPiecesFactory.newBishop(ChessPieceColors.BLACK);
	}

	@Test
	public void testIsMoveValid_HavingInvalidDestLocation_shouldReturnFalse() {
		Assert.assertFalse(whiteBishopPiece.isMoveValid(Coordinates.C1, Coordinates.C4));
		Assert.assertFalse(blackBishopPiece.isMoveValid(Coordinates.C8, Coordinates.C4));
	}
	
	@Test
	public void testIsMoveValid_HavingValidDestLocation_shouldReturnTrue() {
		Assert.assertTrue(whiteBishopPiece.isMoveValid(Coordinates.C1, Coordinates.A3));
		Assert.assertTrue(whiteBishopPiece.isMoveValid(Coordinates.C1, Coordinates.H6));
		Assert.assertTrue(blackBishopPiece.isMoveValid(Coordinates.C8, Coordinates.A6));
		Assert.assertTrue(blackBishopPiece.isMoveValid(Coordinates.C8, Coordinates.H3));
	}
	
	
	
}
