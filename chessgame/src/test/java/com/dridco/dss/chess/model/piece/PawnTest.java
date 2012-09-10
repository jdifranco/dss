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
public class PawnTest extends ChessPieceTest {
	
	private ChessPiece whitePawnPiece;
	private ChessPiece blackPawnPiece;
	
	@Before
	public void setUp() {
		this.whitePawnPiece = ChessPiecesFactory.newPawn(ChessPieceColors.WHITE);
		this.blackPawnPiece = ChessPiecesFactory.newPawn(ChessPieceColors.BLACK);
	}

	@Test
	public void testCanMoveTo_TryingToMoveBackWards_shouldReturn_false() {
		Assert.assertFalse(whitePawnPiece.isMoveValid(Coordinates.C2, Coordinates.C1));
		Assert.assertFalse(blackPawnPiece.isMoveValid(Coordinates.C7, Coordinates.C8));
	}
	
	@Test
	public void testCanMoveTo_HavingInvalid_DestLocation_shouldReturn_false() {
		Assert.assertFalse(whitePawnPiece.isMoveValid(Coordinates.C2, Coordinates.D4));
		Assert.assertFalse(blackPawnPiece.isMoveValid(Coordinates.C7, Coordinates.C2));
	}
	
	@Test
	public void testCanMoveTo_HavingValid_DestLocation_shouldReturn_true() {
		Assert.assertTrue(whitePawnPiece.isMoveValid(Coordinates.C2, Coordinates.C4));
		this.whitePawnPiece.hasBeenMoved = true;
		Assert.assertFalse(whitePawnPiece.isMoveValid(Coordinates.C4, Coordinates.C6));
		Assert.assertTrue(blackPawnPiece.isMoveValid(Coordinates.C7, Coordinates.C6));
		this.blackPawnPiece.hasBeenMoved = true;
		Assert.assertTrue(blackPawnPiece.isMoveValid(Coordinates.C6, Coordinates.C5));
	}
	
}
