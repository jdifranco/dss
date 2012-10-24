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
public class KingTest {
	
	private ChessPiece whiteKingPiece;
	private ChessPiece blackKingPiece;
	
	@Before
	public void setUp() {
		this.whiteKingPiece = ChessPiecesFactory.newKing(ChessPieceColors.WHITE);
		this.blackKingPiece = ChessPiecesFactory.newKing(ChessPieceColors.BLACK);
	}

	@Test
	public void testIsMoveValid_HavingInvalidDestLocation_shouldReturnFalse() {
		Assert.assertFalse(whiteKingPiece.isMoveValid(Coordinates.E1, Coordinates.D3));
		Assert.assertFalse(blackKingPiece.isMoveValid(Coordinates.E8, Coordinates.A8));
	}
	
	@Test
	public void testIsMoveValid_HavingValidDestLocation_shouldReturnTrue() {
		Assert.assertTrue(whiteKingPiece.isMoveValid(Coordinates.E1, Coordinates.F1));
		Assert.assertTrue(whiteKingPiece.isMoveValid(Coordinates.E1, Coordinates.E2));
		Assert.assertTrue(blackKingPiece.isMoveValid(Coordinates.E8, Coordinates.D8));
		Assert.assertTrue(blackKingPiece.isMoveValid(Coordinates.E8, Coordinates.E7));
	}
	
}
