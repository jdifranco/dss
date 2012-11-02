package com.dridco.dss.chess.model.piece;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import com.dridco.dss.chess.model.coordinate.Coordinates;
import com.dridco.dss.chess.model.move.ChessMovesFactory;

/**
 * 
 * @author jdifranco
 *
 */
public class QueenTest {
	
	private ChessPiece whiteQueenPiece;
	private ChessPiece blackQueenPiece;
	
	@Before
	public void setUp() {
		this.whiteQueenPiece = ChessPiecesFactory.newQueen(ChessPieceColors.WHITE);
		this.blackQueenPiece = ChessPiecesFactory.newQueen(ChessPieceColors.BLACK);
	}

	@Test
	public void testIsMoveValid_HavingInvalidDestLocation_shouldReturnFalse() {
		Assert.assertFalse(whiteQueenPiece.isMoveValid(ChessMovesFactory.newChessMove(Coordinates.D1, Coordinates.E4, whiteQueenPiece)));
		Assert.assertFalse(blackQueenPiece.isMoveValid(ChessMovesFactory.newChessMove(Coordinates.D8, Coordinates.F7, blackQueenPiece)));
	}
	
	@Test
	public void testIsMoveValid_HavingValidDestLocation_shouldReturnTrue() {
		Assert.assertTrue(whiteQueenPiece.isMoveValid(ChessMovesFactory.newChessMove(Coordinates.D1, Coordinates.D6, whiteQueenPiece)));
		Assert.assertTrue(whiteQueenPiece.isMoveValid(ChessMovesFactory.newChessMove(Coordinates.D1, Coordinates.A4, whiteQueenPiece)));
		Assert.assertTrue(blackQueenPiece.isMoveValid(ChessMovesFactory.newChessMove(Coordinates.D8, Coordinates.G5, blackQueenPiece)));
		Assert.assertTrue(blackQueenPiece.isMoveValid(ChessMovesFactory.newChessMove(Coordinates.D8, Coordinates.A8, blackQueenPiece)));
	}
	
}
