package com.dridco.dss.chess.model.square;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import com.dridco.dss.chess.model.piece.ChessPieceColors;
import com.dridco.dss.chess.model.piece.ChessPiecesFactory;

/**
 * 
 * @author jdifranco
 *
 */
public class SquareTest {
	
	private Square emptySquare;
	private Square occupiedSquare;
	
	@Before
	public void setUp() {
		emptySquare = SquaresFactory.newEmptySquare();
		occupiedSquare = SquaresFactory.newOccupiedSquare(ChessPiecesFactory.newPawn(ChessPieceColors.WHITE));
	}
	
	@Test(expected=RuntimeException.class)
	public void testGetPiece_WhenSquareHasNothingOnIt_shouldThrowException() {
		emptySquare.getPiece();
	}
	
	@Test
	public void testGetPiece_WhenHavingPieceOnIt_shouldReturnThePiece() {
		Assert.assertNotNull(occupiedSquare.getPiece());
	}
	
	@Test
	public void testIsOccupied_WhenSquareHasNothingOnIt_shouldReturnFalse() {
		Assert.assertFalse(emptySquare.isOccupied());
	}
	
	@Test
	public void testIsOccupied_WhenHavingPieceOnIt_shouldReturnTrue() {
		Assert.assertTrue(occupiedSquare.isOccupied());
	}
	
	@Test
	public void testHasSameColorPiece() {
		Assert.assertFalse(emptySquare.hasSameColorPiece(ChessPieceColors.WHITE));
		Assert.assertFalse(emptySquare.hasSameColorPiece(ChessPieceColors.BLACK));
		Assert.assertFalse(occupiedSquare.hasSameColorPiece(ChessPieceColors.BLACK));
		Assert.assertTrue(occupiedSquare.hasSameColorPiece(ChessPieceColors.WHITE));
	}
	
	@Test
	public void testUupdateSquareState_HavingOccupiedSquareToEmpty_shouldCleanSquare() {
		occupiedSquare.updateSquareState(SquaresFactory.newEmptySquareState());
		Assert.assertFalse(occupiedSquare.isOccupied());
	}
	
}
