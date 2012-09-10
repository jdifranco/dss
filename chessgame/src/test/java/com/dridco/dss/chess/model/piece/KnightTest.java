package com.dridco.dss.chess.model.piece;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import com.dridco.dss.chess.model.Coordinates;

/**
 * 
 * @author jdifranco
 *
 */
public class KnightTest extends ChessPieceTest {
	
	private ChessPiece whiteKnightPiece;
	private ChessPiece blackKnightPiece;
	
	@Before
	public void setUp() {
		this.whiteKnightPiece = ChessPiecesFactory.newKnight(ChessPieceColors.WHITE);
		this.blackKnightPiece = ChessPiecesFactory.newKnight(ChessPieceColors.BLACK);
	}

	@Test
	public void testCanMoveTo_HavingInvalid_DestLocation_shouldReturn_false() {
		Assert.assertFalse(whiteKnightPiece.isMoveValid(Coordinates.B1, Coordinates.B4));
		Assert.assertFalse(blackKnightPiece.isMoveValid(Coordinates.B8, Coordinates.B4));
	}
	
	@Test
	public void testCanMoveTo_HavingValid_DestLocation_shouldReturn_true() {
		Assert.assertTrue(whiteKnightPiece.isMoveValid(Coordinates.B1, Coordinates.A3));
		Assert.assertTrue(whiteKnightPiece.isMoveValid(Coordinates.B1, Coordinates.C3));
		Assert.assertTrue(blackKnightPiece.isMoveValid(Coordinates.B8, Coordinates.A6));
		Assert.assertTrue(blackKnightPiece.isMoveValid(Coordinates.B8, Coordinates.C6));
	}
	
}
