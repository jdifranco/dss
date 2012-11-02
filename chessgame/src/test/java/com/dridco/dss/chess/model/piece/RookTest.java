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
public class RookTest {
	
	private ChessPiece whiteRookPiece;
	private ChessPiece blackRookPiece;
	
	@Before
	public void setUp() {
		this.whiteRookPiece = ChessPiecesFactory.newRook(ChessPieceColors.WHITE);
		this.blackRookPiece = ChessPiecesFactory.newRook(ChessPieceColors.BLACK);
	}

	@Test
	public void testIsMoveValid_HavingInvalidDestLocation_shouldReturnFalse() {
		Assert.assertFalse(whiteRookPiece.isMoveValid(ChessMovesFactory.newChessMove(Coordinates.A1, Coordinates.B2, whiteRookPiece)));
		Assert.assertFalse(blackRookPiece.isMoveValid(ChessMovesFactory.newChessMove(Coordinates.H8, Coordinates.F6, blackRookPiece)));
	}
	
	@Test
	public void testIsMoveValid_HavingValidDestLocation_shouldReturnTrue() {
		Assert.assertTrue(whiteRookPiece.isMoveValid(ChessMovesFactory.newChessMove(Coordinates.A1, Coordinates.A3, whiteRookPiece)));
		Assert.assertTrue(whiteRookPiece.isMoveValid(ChessMovesFactory.newChessMove(Coordinates.A1, Coordinates.C1, whiteRookPiece)));
		Assert.assertTrue(blackRookPiece.isMoveValid(ChessMovesFactory.newChessMove(Coordinates.H8, Coordinates.A8, blackRookPiece)));
		Assert.assertTrue(blackRookPiece.isMoveValid(ChessMovesFactory.newChessMove(Coordinates.A8, Coordinates.A4, blackRookPiece)));
	}
	
}
