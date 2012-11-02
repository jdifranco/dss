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
public class KnightTest {
	
	private ChessPiece whiteKnightPiece;
	private ChessPiece blackKnightPiece;
	
	@Before
	public void setUp() {
		this.whiteKnightPiece = ChessPiecesFactory.newKnight(ChessPieceColors.WHITE);
		this.blackKnightPiece = ChessPiecesFactory.newKnight(ChessPieceColors.BLACK);
	}

	@Test
	public void testIsMoveValid_HavingInvalidDestLocation_shouldReturnFalse() {
		Assert.assertFalse(whiteKnightPiece.isMoveValid(ChessMovesFactory.newChessMove(Coordinates.B1, Coordinates.B4, whiteKnightPiece)));
		Assert.assertFalse(blackKnightPiece.isMoveValid(ChessMovesFactory.newChessMove(Coordinates.B8, Coordinates.B4, blackKnightPiece)));
	}
	
	@Test
	public void testIsMoveValid_HavingValidDestLocation_shouldReturnTrue() {
		Assert.assertTrue(whiteKnightPiece.isMoveValid(ChessMovesFactory.newChessMove(Coordinates.B1, Coordinates.A3, whiteKnightPiece)));
		Assert.assertTrue(whiteKnightPiece.isMoveValid(ChessMovesFactory.newChessMove(Coordinates.B1, Coordinates.C3, whiteKnightPiece)));
		Assert.assertTrue(blackKnightPiece.isMoveValid(ChessMovesFactory.newChessMove(Coordinates.B8, Coordinates.A6, blackKnightPiece)));
		Assert.assertTrue(blackKnightPiece.isMoveValid(ChessMovesFactory.newChessMove(Coordinates.B8, Coordinates.C6, blackKnightPiece)));
	}
	
}
