package com.dridco.dss.chess.model.piece;

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
public class PawnTest {
	
	private ChessPiece whitePawnPiece;
	private ChessPiece blackPawnPiece;
	
	@Before
	public void setUp() {
		this.whitePawnPiece = ChessPiecesFactory.newPawn(ChessPieceColors.WHITE);
		this.blackPawnPiece = ChessPiecesFactory.newPawn(ChessPieceColors.BLACK);
	}

	@Test
	public void testIsMoveValid_TryingToMoveBackWards_shouldReturnFalse() {
		Assert.assertFalse(whitePawnPiece.isMoveValid(ChessMovesFactory.newChessMove(Coordinates.C2, Coordinates.C1, whitePawnPiece)));
		Assert.assertFalse(blackPawnPiece.isMoveValid(ChessMovesFactory.newChessMove(Coordinates.C7, Coordinates.C8, blackPawnPiece)));
	}
	
	@Test
	public void testIsMoveValid_HavingInvalidDestLocation_shouldReturnFalse() {
		Assert.assertFalse(whitePawnPiece.isMoveValid(ChessMovesFactory.newChessMove(Coordinates.C2, Coordinates.D4, whitePawnPiece)));
		Assert.assertFalse(blackPawnPiece.isMoveValid(ChessMovesFactory.newChessMove(Coordinates.C7, Coordinates.C2, blackPawnPiece)));
	}
	
	@Test
	public void testIsMoveValid_HavingValidDestLocation_shouldReturnTrue() {
		Assert.assertTrue(whitePawnPiece.isMoveValid(ChessMovesFactory.newChessMove(Coordinates.C2, Coordinates.C4, whitePawnPiece)));
		Assert.assertTrue(blackPawnPiece.isMoveValid(ChessMovesFactory.newChessMove(Coordinates.C7, Coordinates.C6, blackPawnPiece)));
	}
	
	@Test
	public void testIsMoveValid_MovingMovedPawnsTwoSpaces_shouldReturnFalse() {
		this.whitePawnPiece.hasBeenMoved = true;
		Assert.assertFalse(whitePawnPiece.isMoveValid(ChessMovesFactory.newChessMove(Coordinates.C4, Coordinates.C6, whitePawnPiece)));
		
		this.blackPawnPiece.hasBeenMoved = true;
		Assert.assertTrue(blackPawnPiece.isMoveValid(ChessMovesFactory.newChessMove(Coordinates.C6, Coordinates.C5, blackPawnPiece)));
	}
	
	@Test
	public void testIsMoveValid_TryingToCapturePieceStraightWay_shouldReturnFalse() {
		ChessMove move = ChessMovesFactory.newChessCaptureMove(Coordinates.C4, Coordinates.C5, whitePawnPiece, blackPawnPiece);
		Assert.assertFalse(whitePawnPiece.isMoveValid(move));
	}
	
	@Test
	public void testIsMoveValid_TryingToCapturePieceDiagonalWay() {
		ChessMove validPawnCapture = ChessMovesFactory.newChessCaptureMove(Coordinates.C4, Coordinates.D5, whitePawnPiece, blackPawnPiece);
		ChessMove invalidPawnCapture = ChessMovesFactory.newChessCaptureMove(Coordinates.C4, Coordinates.E6, whitePawnPiece, blackPawnPiece);
		Assert.assertTrue(whitePawnPiece.isMoveValid(validPawnCapture));
		Assert.assertFalse(whitePawnPiece.isMoveValid(invalidPawnCapture));
	}
	
}
