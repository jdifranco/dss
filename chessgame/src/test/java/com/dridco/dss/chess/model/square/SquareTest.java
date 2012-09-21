package com.dridco.dss.chess.model.square;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import com.dridco.dss.chess.model.coordinate.Coordinates;
import com.dridco.dss.chess.model.piece.ChessPiece;
import com.dridco.dss.chess.model.piece.ChessPieceColors;
import com.dridco.dss.chess.model.piece.ChessPiecesFactory;

/**
 * 
 * @author jdifranco
 *
 */
public class SquareTest {
	
	private ChessPiece testPawn = ChessPiecesFactory.newPawn(ChessPieceColors.WHITE);
	private Square emptySquare;
	private Square occupiedSquare;
	
	@Before
	public void setUp() {
		emptySquare = SquaresFactory.newEmptySquareContainer(Coordinates.H2);
		occupiedSquare = SquaresFactory.newOccupiedSquareContainer(Coordinates.H1, testPawn);
	}
			
	@Test
	public void testIsOccupied_shouldReturnFalse_whenSquareHasNothingOnIt() {
		Assert.assertFalse(emptySquare.isOccupied());
	}
	
	@Test
	public void testIsOccupied_shouldReturnTrue_whenHavingPieceOnIt() {
		Assert.assertTrue(occupiedSquare.isOccupied());
	}
	
	@Test(expected=RuntimeException.class)
	public void testMovePieceFrom_EmptySquare_shouldThrowException() {
		emptySquare.movePiece(SquaresFactory.newEmptySquareContainer(Coordinates.H7));
	}
	
	@Test
	public void testMovePieceFrom_OccupiedSquare_shouldMovePiece_toDestSquare_assumingDestSquareIsEmpty() {
		occupiedSquare.movePiece(emptySquare);
		Assert.assertFalse(occupiedSquare.isOccupied());
		Assert.assertTrue(emptySquare.isOccupied());
	}
	
}
