package com.dridco.dss.chess.model.board;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import com.dridco.dss.chess.model.Coordinates;

/**
 * 
 * @author jdifranco
 *
 */
public class ChessBoardTest {
	
	private ChessBoard board;
	
	@Before
	public void setUp () {
		board = ChessBoardFactory.newBoard();
	}
	
	@Test
	public void testNewBoard_shouldHaveAllSquaresCreated() {
		Assert.assertFalse(board.isEmpty());
	}
	
	@Test
	public void testGetSquareAt_A5_shouldBeEmpty() {
		Assert.assertFalse(board.getSquareAt(Coordinates.A5).isOccupied());
	}
	
	@Test
	public void testGetSquareAt_A1_shouldBeOccupied() {
		Assert.assertTrue(board.getSquareAt(Coordinates.A1).isOccupied());
	}
	
	@Test(expected=RuntimeException.class)
	public void testMovePieceFrom_EmptySquare_shouldThrowException() {
		board.movePiece(Coordinates.A5, Coordinates.A6);
	}
	
	@Test
	public void testMovePieceFrom_OccupiedSquare_shouldMovePiece_toDestSquare_assumingDestSquareIsEmpty() {
		board.movePiece(Coordinates.A2, Coordinates.A4);
		Assert.assertFalse(board.getSquareAt(Coordinates.A2).isOccupied());
		Assert.assertTrue(board.getSquareAt(Coordinates.A4).isOccupied());
	}
	
}
