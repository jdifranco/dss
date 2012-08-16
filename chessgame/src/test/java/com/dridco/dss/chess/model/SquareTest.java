package com.dridco.dss.chess.model;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import com.dridco.dss.chess.model.Square;

/**
 * 
 * @author jdifranco
 *
 */
public class SquareTest {
	
	private Piece testPawn = Pieces.newPawn(PieceColor.WHITE);
	private Square emptySquare1;
	private Square emptySquare2;
	private Square completedSquare1;
	
	@Before
	public void setUp() {
		emptySquare1 = new Square();
		emptySquare2 = new Square();
		completedSquare1 = new Square();
		completedSquare1.putPiece(testPawn);
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
