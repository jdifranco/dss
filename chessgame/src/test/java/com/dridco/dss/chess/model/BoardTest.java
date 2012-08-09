package com.dridco.dss.chess.model;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author jdifranco
 *
 */
public class BoardTest {
	
	private static int MAX_SQUARES_SIZE_IN_BOARD = Board.BOARD_MAX_HEIGHT * Board.BOARD_MAX_WIDTH;
	private Board board;
	
	@Before
	public void setUp () {
		board = new Board();
	}
	
	@Test
	public void testNewBoard_shouldHaveAllSquaresCreated() {
		Assert.assertFalse(board.getSquares().isEmpty());
		Assert.assertEquals(MAX_SQUARES_SIZE_IN_BOARD, board.getSquares().size());
	}
	
	@Test
	public void testNewBoard_allSquaresAreEmpty() {
		Assert.assertFalse(board.getSquares().isEmpty());
		for(Square square : board.getSquares().values()) {
			Assert.assertFalse(square.isOccupied());
		}
	}
	
	@Test(expected=RuntimeException.class)
	public void testPutPiece_onInvalidSquare_ShouldThrowException() {
		board.putPiece(Coordinate.at(9, 9), Pieces.createPawn(PieceColor.WHITE));
	}
	
	@Test
	public void testPutPiece_onValidSquare_ShouldAllowToGetThisPieceAfter() {
		Coordinate destCord = Coordinate.at(1, 1);
		board.putPiece(destCord, Pieces.createPawn(PieceColor.WHITE));
		Assert.assertTrue(board.getSquareAt(destCord).isOccupied());		
	}
	
	@Test
	public void testToString() {
		Assert.assertFalse(board.toString().isEmpty());
	}
	
}
