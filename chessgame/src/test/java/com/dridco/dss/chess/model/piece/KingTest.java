package com.dridco.dss.chess.model.piece;

import static com.dridco.dss.chess.model.coordinate.Coordinates.A8;
import static com.dridco.dss.chess.model.coordinate.Coordinates.D3;
import static com.dridco.dss.chess.model.coordinate.Coordinates.C3;
import static com.dridco.dss.chess.model.coordinate.Coordinates.D8;
import static com.dridco.dss.chess.model.coordinate.Coordinates.E1;
import static com.dridco.dss.chess.model.coordinate.Coordinates.E2;
import static com.dridco.dss.chess.model.coordinate.Coordinates.E7;
import static com.dridco.dss.chess.model.coordinate.Coordinates.D7;
import static com.dridco.dss.chess.model.coordinate.Coordinates.E8;
import static com.dridco.dss.chess.model.coordinate.Coordinates.F1;
import static com.dridco.dss.chess.model.piece.ChessPieceColors.BLACK;
import static com.dridco.dss.chess.model.piece.ChessPieceColors.WHITE;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import com.dridco.dss.chess.model.move.ChessMovesFactory;

/**
 * 
 * @author jdifranco
 *
 */
public class KingTest {
	
	private ChessPiece whiteKingPiece;
	private ChessPiece blackKingPiece;
	
	@Before
	public void setUp() {
		this.whiteKingPiece = ChessPiecesFactory.newKing(WHITE);
		this.blackKingPiece = ChessPiecesFactory.newKing(BLACK);
	}

	@Test
	public void testIsMoveValid_HavingInvalidDestLocation_shouldReturnFalse() {
		Assert.assertFalse(this.whiteKingPiece.isMoveValid(ChessMovesFactory.newChessMove(E1, D3, whiteKingPiece)));
		Assert.assertFalse(this.whiteKingPiece.isMoveValid(ChessMovesFactory.newChessMove(E1, C3, whiteKingPiece)));
		Assert.assertFalse(this.blackKingPiece.isMoveValid(ChessMovesFactory.newChessMove(E8, A8, blackKingPiece)));
	}
	
	@Test
	public void testIsMoveValid_HavingValidDestLocation_shouldReturnTrue() {
		Assert.assertTrue(this.whiteKingPiece.isMoveValid(ChessMovesFactory.newChessMove(E1, F1, whiteKingPiece)));
		Assert.assertTrue(this.whiteKingPiece.isMoveValid(ChessMovesFactory.newChessMove(E1, E2, whiteKingPiece)));
		Assert.assertTrue(this.blackKingPiece.isMoveValid(ChessMovesFactory.newChessMove(E8, D8, blackKingPiece)));
		Assert.assertTrue(this.blackKingPiece.isMoveValid(ChessMovesFactory.newChessMove(E8, E7, blackKingPiece)));
		Assert.assertTrue(this.blackKingPiece.isMoveValid(ChessMovesFactory.newChessMove(E8, D7, blackKingPiece)));
	}
	
}
