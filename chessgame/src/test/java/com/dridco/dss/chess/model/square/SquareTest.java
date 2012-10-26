package com.dridco.dss.chess.model.square;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import com.dridco.dss.chess.model.coordinate.Coordinates;
import com.dridco.dss.chess.model.piece.ChessPieceColors;
import com.dridco.dss.chess.model.piece.ChessPiecesFactory;

/**
 * 
 * @author jdifranco
 *
 */
public class SquareTest {
	
	private Square emptySquare;
	private Square occupiedSquare1;
	private Square occupiedSquare2;
	
	@Before
	public void setUp() {
		emptySquare = SquaresFactory.newEmptySquare(Coordinates.H2);
		occupiedSquare1 = SquaresFactory.newOccupiedSquare(Coordinates.H1, ChessPiecesFactory.newPawn(ChessPieceColors.WHITE));
		occupiedSquare2 = SquaresFactory.newOccupiedSquare(Coordinates.H8, ChessPiecesFactory.newRook(ChessPieceColors.WHITE));
	}
			
	@Test
	public void testIsOccupied_WhenSquareHasNothingOnIt_shouldReturnFalse() {
		Assert.assertFalse(emptySquare.isOccupied());
	}
	
	@Test
	public void testIsOccupied_WhenHavingPieceOnIt_shouldReturnTrue() {
		Assert.assertTrue(occupiedSquare1.isOccupied());
	}
		
	@Test
	public void testMovePiece_HavingOccupiedSquare_shouldMovePieceToDestSquare() {
		occupiedSquare1.movePiece(emptySquare);
		Assert.assertFalse(occupiedSquare1.isOccupied());
		Assert.assertTrue(emptySquare.isOccupied());
	}
	
	@Test(expected=RuntimeException.class)
	public void testMovePiece_ToSameColorPieceSquare_shouldThrowException() {
		occupiedSquare1.movePiece(occupiedSquare2);
	}
	
}
