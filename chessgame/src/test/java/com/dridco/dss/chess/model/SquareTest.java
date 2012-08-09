package com.dridco.dss.chess.model;

import junit.framework.Assert;

import org.junit.Test;

import com.dridco.dss.chess.model.Square;

/**
 * 
 * @author jdifranco
 *
 */
public class SquareTest {
	
	private Piece testPawn = Pieces.createPawn(PieceColor.WHITE_PIECE);
	private Square emptySquare1 = new Square(Coordinate.at(2, 2));
	private Square emptySquare2 = new Square(Coordinate.at(2, 2));
	private Square completedSquare1 = new Square(Coordinate.at(3, 3), testPawn);
			
	@Test
	public void testEquals() {
		Assert.assertFalse("Square is not null", emptySquare1.equals(null));
		Assert.assertFalse("Square1 is different from Square2", emptySquare1.equals(completedSquare1));
		Assert.assertTrue("Square1 is the same having the same position", emptySquare1.equals(emptySquare2));
	}
	
	@Test
	public void testIsOccupied_shouldReturnFalse_whenSquareHasNothingOnIt() {
		Assert.assertFalse(emptySquare1.isOccupied());
	}
	
	@Test
	public void testIsOccupied_shouldReturnTrue_whenHavingPieceOnIt() {
		Assert.assertTrue(completedSquare1.isOccupied());
	}
	
	@Test(expected=RuntimeException.class)
	public void testPutPiece_OnOccupiedSquare_shouldThrowException() {
		completedSquare1.putPiece(testPawn);
	}
	
	@Test
	public void testPutPiece_OnFreeSquare_shouldBeOccupiedAfter() {
		Assert.assertFalse(emptySquare2.isOccupied());
		emptySquare2.putPiece(testPawn);
		Assert.assertTrue(emptySquare2.isOccupied());
	}
	
}
