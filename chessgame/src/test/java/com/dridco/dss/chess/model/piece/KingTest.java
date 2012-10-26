package com.dridco.dss.chess.model.piece;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import com.dridco.dss.chess.model.coordinate.Coordinates;
import com.dridco.dss.chess.model.square.SquaresFactory;

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
		Assert.assertFalse(this.whiteKingPiece.isMoveValid(Coordinates.E1, Coordinates.D3));
		Assert.assertFalse(this.blackKingPiece.isMoveValid(Coordinates.E8, Coordinates.A8));
	}
	
	@Test
	public void testIsMoveValid_HavingValidDestLocation_shouldReturnTrue() {
		Assert.assertTrue(this.whiteKingPiece.isMoveValid(Coordinates.E1, Coordinates.F1));
		Assert.assertTrue(this.whiteKingPiece.isMoveValid(Coordinates.E1, Coordinates.E2));
		Assert.assertTrue(this.blackKingPiece.isMoveValid(Coordinates.E8, Coordinates.D8));
		Assert.assertTrue(this.blackKingPiece.isMoveValid(Coordinates.E8, Coordinates.E7));
	}
	
	@Test
	public void testMoveTo_HavingValidDestLocation_shouldReturnTrue() {
		Assert.assertFalse(this.whiteKingPiece.hasBeenMoved);
		this.whiteKingPiece.moveTo(SquaresFactory.newOccupiedSquare(Coordinates.E1 ,
				this.whiteKingPiece), SquaresFactory.newEmptySquare(Coordinates.E2));
		Assert.assertTrue(this.whiteKingPiece.hasBeenMoved);
		this.whiteKingPiece.moveTo(SquaresFactory.newOccupiedSquare(Coordinates.E2 ,
				this.whiteKingPiece), SquaresFactory.newEmptySquare(Coordinates.F1));
		Assert.assertTrue(this.whiteKingPiece.hasBeenMoved);
	}
	
	@Test(expected=RuntimeException.class)
	public void testMoveTo_HavingInvalidDestLocation_shoulThrowException() {
		this.whiteKingPiece.moveTo(SquaresFactory.newOccupiedSquare(Coordinates.C1 ,
				this.whiteKingPiece), SquaresFactory.newEmptySquare(Coordinates.C3));
	}
	
}
