package com.dridco.dss.chess.model.move;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.dridco.dss.chess.model.board.ChessBoard;
import com.dridco.dss.chess.model.board.ChessBoardFactory;
import com.dridco.dss.chess.model.coordinate.Coordinates;
import com.dridco.dss.chess.model.piece.ChessPiece;
import com.dridco.dss.chess.model.piece.ChessPieceColors;
import com.dridco.dss.chess.model.piece.ChessPiecesFactory;

/**
 * 
 * @author jdifranco
 * 
 */
public class ChessMoveTest {

	private ChessBoard board;
	private ChessPiece whitePawn;
	private ChessPiece blackPawn;
	private ChessPiece whiteRook;
	private ChessPiece blackRook;

	@Before
	public void setUp() {
		this.board = ChessBoardFactory.newBoard();
		this.whitePawn = ChessPiecesFactory.newPawn(ChessPieceColors.WHITE);
		this.blackPawn = ChessPiecesFactory.newPawn(ChessPieceColors.BLACK);
		this.whiteRook = ChessPiecesFactory.newRook(ChessPieceColors.WHITE);
		this.blackRook = ChessPiecesFactory.newRook(ChessPieceColors.BLACK);
	}

	@Test
	public void testIsCapture() {
		Assert.assertFalse(ChessMovesFactory.newChessMove(Coordinates.A1, Coordinates.A1, whitePawn).isCapture());
		Assert.assertTrue(ChessMovesFactory.newChessCaptureMove(Coordinates.A1, Coordinates.A1, whitePawn, blackPawn).isCapture());
	}

	@Test
	public void testMoveDirections_havingWhitePieces() {
		ChessMove northMove = ChessMovesFactory.newChessMove(Coordinates.A1, Coordinates.A2, this.whitePawn);
		ChessMove southMove = ChessMovesFactory.newChessMove(Coordinates.A8, Coordinates.A7, this.whitePawn);
		ChessMove westMove = ChessMovesFactory.newChessMove(Coordinates.H1, Coordinates.A1, this.whitePawn);
		ChessMove eastMove = ChessMovesFactory.newChessMove(Coordinates.A1, Coordinates.H1, this.whitePawn);
		ChessMove northWestMove = ChessMovesFactory.newChessMove(Coordinates.C1, Coordinates.B2, this.whitePawn);
		ChessMove northEastMove = ChessMovesFactory.newChessMove(Coordinates.C1, Coordinates.D2, this.whitePawn);
		ChessMove southWestMove = ChessMovesFactory.newChessMove(Coordinates.C4, Coordinates.B3, this.whitePawn);
		ChessMove southEastMove = ChessMovesFactory.newChessMove(Coordinates.C4, Coordinates.D3, this.whitePawn);
			
		Assert.assertFalse(northMove.isBackward());
		Assert.assertFalse(northMove.isDiagonal());
		Assert.assertTrue(northMove.isVertical());
		Assert.assertFalse(northMove.isHorizontal());
		
		Assert.assertTrue(southMove.isBackward());
		Assert.assertFalse(southMove.isDiagonal());
		Assert.assertTrue(southMove.isVertical());
		Assert.assertFalse(southMove.isHorizontal());
		
		Assert.assertFalse(westMove.isBackward());
		Assert.assertFalse(westMove.isDiagonal());
		Assert.assertFalse(westMove.isVertical());
		Assert.assertTrue(westMove.isHorizontal());
		
		Assert.assertFalse(eastMove.isBackward());
		Assert.assertFalse(eastMove.isDiagonal());
		Assert.assertFalse(eastMove.isVertical());
		Assert.assertTrue(eastMove.isHorizontal());
		
		Assert.assertFalse(northWestMove.isBackward());
		Assert.assertTrue(northWestMove.isDiagonal());
		Assert.assertFalse(northWestMove.isVertical());
		Assert.assertFalse(northWestMove.isHorizontal());
		
		Assert.assertFalse(northEastMove.isBackward());
		Assert.assertTrue(northEastMove.isDiagonal());
		Assert.assertFalse(northEastMove.isVertical());
		Assert.assertFalse(northEastMove.isHorizontal());
		
		Assert.assertTrue(southWestMove.isBackward());
		Assert.assertTrue(southWestMove.isDiagonal());
		Assert.assertFalse(southWestMove.isVertical());
		Assert.assertFalse(southWestMove.isHorizontal());
		
		Assert.assertTrue(southEastMove.isBackward());
		Assert.assertTrue(southEastMove.isDiagonal());
		Assert.assertFalse(southEastMove.isVertical());
		Assert.assertFalse(southEastMove.isHorizontal());
	}
	
	@Test
	public void testMoveDirections_havingBlackPieces() {
		ChessMove northMove = ChessMovesFactory.newChessMove(Coordinates.A1, Coordinates.A2, this.blackPawn);
		ChessMove southMove = ChessMovesFactory.newChessMove(Coordinates.A8, Coordinates.A7, this.blackPawn);
		ChessMove westMove = ChessMovesFactory.newChessMove(Coordinates.H1, Coordinates.A1, this.blackPawn);
		ChessMove eastMove = ChessMovesFactory.newChessMove(Coordinates.A1, Coordinates.H1, this.blackPawn);
		ChessMove northWestMove = ChessMovesFactory.newChessMove(Coordinates.C1, Coordinates.B2, this.blackPawn);
		ChessMove northEastMove = ChessMovesFactory.newChessMove(Coordinates.C1, Coordinates.D2, this.blackPawn);
		ChessMove southWestMove = ChessMovesFactory.newChessMove(Coordinates.C4, Coordinates.B3, this.blackPawn);
		ChessMove southEastMove = ChessMovesFactory.newChessMove(Coordinates.C4, Coordinates.D3, this.blackPawn);
		
		Assert.assertTrue(northMove.isBackward());
		Assert.assertFalse(northMove.isDiagonal());
		Assert.assertTrue(northMove.isVertical());
		Assert.assertFalse(northMove.isHorizontal());
		
		Assert.assertFalse(southMove.isBackward());
		Assert.assertFalse(southMove.isDiagonal());
		Assert.assertTrue(southMove.isVertical());
		Assert.assertFalse(southMove.isHorizontal());
		
		Assert.assertFalse(westMove.isBackward());
		Assert.assertFalse(westMove.isDiagonal());
		Assert.assertFalse(westMove.isVertical());
		Assert.assertTrue(westMove.isHorizontal());
		
		Assert.assertFalse(eastMove.isBackward());
		Assert.assertFalse(eastMove.isDiagonal());
		Assert.assertFalse(eastMove.isVertical());
		Assert.assertTrue(eastMove.isHorizontal());
		
		Assert.assertTrue(northWestMove.isBackward());
		Assert.assertTrue(northWestMove.isDiagonal());
		Assert.assertFalse(northWestMove.isVertical());
		Assert.assertFalse(northWestMove.isHorizontal());
		
		Assert.assertTrue(northEastMove.isBackward());
		Assert.assertTrue(northEastMove.isDiagonal());
		Assert.assertFalse(northEastMove.isVertical());
		Assert.assertFalse(northEastMove.isHorizontal());
		
		Assert.assertFalse(southWestMove.isBackward());
		Assert.assertTrue(southWestMove.isDiagonal());
		Assert.assertFalse(southWestMove.isVertical());
		Assert.assertFalse(southWestMove.isHorizontal());
		
		Assert.assertFalse(southEastMove.isBackward());
		Assert.assertTrue(southEastMove.isDiagonal());
		Assert.assertFalse(southEastMove.isVertical());
		Assert.assertFalse(southEastMove.isHorizontal());
	}

	@Test
	public void testArePiecesBetweenSquares_HavingRookMovingVerticallyThroughOccupiedSquare() {
		ChessMove whiteRookMove = ChessMovesFactory.newChessMove(Coordinates.A1, Coordinates.A4, this.whiteRook);
		Assert.assertTrue(whiteRookMove.arePiecesBetween(board));
		ChessMove blackRookMove = ChessMovesFactory.newChessMove(Coordinates.A8, Coordinates.A4, this.blackRook);
		Assert.assertTrue(blackRookMove.arePiecesBetween(board));
	}
	
	@Test
	public void testArePiecesBetweenSquares_HavingRookMovingHorizontallyThroughOccupiedSquare() {
		ChessMove whiteRookMove = ChessMovesFactory.newChessMove(Coordinates.A1, Coordinates.B1, this.whiteRook);
		Assert.assertTrue(whiteRookMove.arePiecesBetween(board));
		ChessMove blackRookMove = ChessMovesFactory.newChessMove(Coordinates.H8, Coordinates.B8, this.blackRook);
		Assert.assertTrue(blackRookMove.arePiecesBetween(board));
	}

	@Test
	public void testArePiecesBetweenSquares_HavingRookMovingHorizontallyThroughEmptySquare() {
		board.doMove(ChessMovesFactory.newChessMove(Coordinates.A2, Coordinates.A4, board.getSquareAt(Coordinates.A2).getPiece()));
		board.doMove(ChessMovesFactory.newChessMove(Coordinates.A4, Coordinates.A5, board.getSquareAt(Coordinates.A4).getPiece()));
		ChessMove whiteRookMove1 = ChessMovesFactory.newChessMove(Coordinates.A1, Coordinates.A2, this.whiteRook);
		Assert.assertFalse(whiteRookMove1.arePiecesBetween(board));
		ChessMove whiteRookMove2 = ChessMovesFactory.newChessMove(Coordinates.A1, Coordinates.A4, this.whiteRook);
		Assert.assertFalse(whiteRookMove2.arePiecesBetween(board));
		
	}

}
