package com.dridco.dss.chess.model.board;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import com.dridco.dss.chess.model.coordinate.Coordinates;
import com.dridco.dss.chess.model.move.ChessMove;
import com.dridco.dss.chess.model.move.ChessMovesFactory;

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
	public void testGetSquare_At_A5_shouldBeEmpty() {
		Assert.assertFalse(board.getSquareAt(Coordinates.A5).isOccupied());
	}
	
	@Test
	public void testGetSquare_At_A1_shouldBeOccupied() {
		Assert.assertTrue(board.getSquareAt(Coordinates.A1).isOccupied());
	}
	
	@Test
	public void testMovePiece_HavingOccupiedSquare_shouldMovePieceToDestSquare() {
		ChessMove move = ChessMovesFactory.newChessMove(Coordinates.A2, Coordinates.A4, board.getSquareAt(Coordinates.A2).getPiece());
		board.doMove(move);
		Assert.assertFalse(board.getSquareAt(Coordinates.A2).isOccupied());
		Assert.assertTrue(board.getSquareAt(Coordinates.A4).isOccupied());
	}
	
}
