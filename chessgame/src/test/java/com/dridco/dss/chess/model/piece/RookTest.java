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
public class RookTest {
	
	private ChessPiece whiteRookPiece;
	private ChessPiece blackRookPiece;
	
	@Before
	public void setUp() {
		this.whiteRookPiece = ChessPiecesFactory.newRook(ChessPieceColors.WHITE);
		this.blackRookPiece = ChessPiecesFactory.newRook(ChessPieceColors.BLACK);
	}

	@Test
	public void testCanMoveTo_HavingInvalid_DestLocation_shouldReturn_false() {
		Assert.assertFalse(whiteRookPiece.isMoveValid(Coordinates.A1, Coordinates.B2));
		Assert.assertFalse(blackRookPiece.isMoveValid(Coordinates.H8, Coordinates.F6));
	}
	
	@Test
	public void testCanMoveTo_HavingValid_DestLocation_shouldReturn_true() {
		Assert.assertTrue(whiteRookPiece.isMoveValid(Coordinates.A1, Coordinates.A3));
		Assert.assertTrue(whiteRookPiece.isMoveValid(Coordinates.A1, Coordinates.C1));
		Assert.assertTrue(blackRookPiece.isMoveValid(Coordinates.H8, Coordinates.A8));
		Assert.assertTrue(blackRookPiece.isMoveValid(Coordinates.A8, Coordinates.A4));
	}
	
}
