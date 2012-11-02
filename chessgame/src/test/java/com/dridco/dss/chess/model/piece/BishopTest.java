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
public class BishopTest {
	
	private ChessPiece whiteBishopPiece;
	private ChessPiece blackBishopPiece;
	
	@Before
	public void setUp() {
		this.whiteBishopPiece = ChessPiecesFactory.newBishop(ChessPieceColors.WHITE);
		this.blackBishopPiece = ChessPiecesFactory.newBishop(ChessPieceColors.BLACK);
	}

	@Test
	public void testIsMoveValid_HavingInvalidDestLocation_shouldReturnFalse() {
		Assert.assertFalse(whiteBishopPiece.isMoveValid(ChessMovesFactory.newChessMove(Coordinates.C1, Coordinates.C4, whiteBishopPiece)));
		Assert.assertFalse(blackBishopPiece.isMoveValid(ChessMovesFactory.newChessMove(Coordinates.C8, Coordinates.C4, blackBishopPiece)));
	}
	
	@Test
	public void testIsMoveValid_HavingValidDestLocation_shouldReturnTrue() {
		Assert.assertTrue(whiteBishopPiece.isMoveValid(ChessMovesFactory.newChessMove(Coordinates.C1, Coordinates.A3, whiteBishopPiece)));
		Assert.assertTrue(whiteBishopPiece.isMoveValid(ChessMovesFactory.newChessMove(Coordinates.C1, Coordinates.H6, whiteBishopPiece)));
		Assert.assertTrue(blackBishopPiece.isMoveValid(ChessMovesFactory.newChessMove(Coordinates.C8, Coordinates.A6, blackBishopPiece)));
		Assert.assertTrue(blackBishopPiece.isMoveValid(ChessMovesFactory.newChessMove(Coordinates.C8, Coordinates.H3, blackBishopPiece)));
	}
	
}
