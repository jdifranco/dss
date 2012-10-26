package com.dridco.dss.chess.util.board;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import com.dridco.dss.chess.model.board.ChessBoard;
import com.dridco.dss.chess.model.board.ChessBoardFactory;
import com.dridco.dss.chess.model.coordinate.Coordinates;

/**
 * 
 * @author jdifranco
 *
 */
public class ChessBoardUtilTest {
	
	private ChessBoard board;
	
	@Before
	public void setUp() {
		board = ChessBoardFactory.newBoard();
	}
	
	@Test
	public void testArePiecesBetweenSquares_HavingWhiteRookMovingVerticallyThroughOccupiedSquare() {
		Assert.assertTrue(ChessBoardUtil.arePiecesBetweenSquares(board, Coordinates.A1, Coordinates.A4));
	}
	
	@Test
	public void testArePiecesBetweenSquares_HavingBlackRookMovingVerticallyThroughOccupiedSquare() {
		Assert.assertTrue(ChessBoardUtil.arePiecesBetweenSquares(board, Coordinates.A8, Coordinates.A4));
	}
	
	@Test
	public void testArePiecesBetweenSquares_HavingWhiteRookMovingHorizontallyThroughOccupiedSquare() {
		Assert.assertTrue(ChessBoardUtil.arePiecesBetweenSquares(board, Coordinates.A1, Coordinates.B1));
	}
	
	@Test
	public void testArePiecesBetweenSquares_HavingBlackRookMovingHorizontallyThroughOccupiedSquare() {
		Assert.assertTrue(ChessBoardUtil.arePiecesBetweenSquares(board, Coordinates.H8, Coordinates.B8));
	}
	
}
