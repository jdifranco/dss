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
public class QueenTest {
	
	private ChessPiece whiteQueenPiece;
	private ChessPiece blackQueenPiece;
	
	@Before
	public void setUp() {
		this.whiteQueenPiece = ChessPiecesFactory.newQueen(ChessPieceColors.WHITE);
		this.blackQueenPiece = ChessPiecesFactory.newQueen(ChessPieceColors.BLACK);
	}

	@Test
	public void testCanMoveTo_HavingInvalid_DestLocation_shouldReturn_false() {
		Assert.assertFalse(whiteQueenPiece.isMoveValid(Coordinates.D1, Coordinates.E4));
		Assert.assertFalse(blackQueenPiece.isMoveValid(Coordinates.D8, Coordinates.F7));
	}
	
	@Test
	public void testCanMoveTo_HavingValid_DestLocation_shouldReturn_true() {
		Assert.assertTrue(whiteQueenPiece.isMoveValid(Coordinates.D1, Coordinates.D6));
		Assert.assertTrue(whiteQueenPiece.isMoveValid(Coordinates.D1, Coordinates.A4));
		Assert.assertTrue(blackQueenPiece.isMoveValid(Coordinates.D8, Coordinates.G5));
		Assert.assertTrue(blackQueenPiece.isMoveValid(Coordinates.D8, Coordinates.A8));
	}
	
}
