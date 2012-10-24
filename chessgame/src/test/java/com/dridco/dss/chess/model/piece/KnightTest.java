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
public class KnightTest {
	
	private ChessPiece whiteKnightPiece;
	private ChessPiece blackKnightPiece;
	
	@Before
	public void setUp() {
		this.whiteKnightPiece = ChessPiecesFactory.newKnight(ChessPieceColors.WHITE);
		this.blackKnightPiece = ChessPiecesFactory.newKnight(ChessPieceColors.BLACK);
	}

	@Test
	public void testIsMoveValid_HavingInvalidDestLocation_shouldReturnFalse() {
		Assert.assertFalse(whiteKnightPiece.isMoveValid(Coordinates.B1, Coordinates.B4));
		Assert.assertFalse(blackKnightPiece.isMoveValid(Coordinates.B8, Coordinates.B4));
	}
	
	@Test
	public void testIsMoveValid_HavingValidDestLocation_shouldReturnTrue() {
		Assert.assertTrue(whiteKnightPiece.isMoveValid(Coordinates.B1, Coordinates.A3));
		Assert.assertTrue(whiteKnightPiece.isMoveValid(Coordinates.B1, Coordinates.C3));
		Assert.assertTrue(blackKnightPiece.isMoveValid(Coordinates.B8, Coordinates.A6));
		Assert.assertTrue(blackKnightPiece.isMoveValid(Coordinates.B8, Coordinates.C6));
	}
	
}
