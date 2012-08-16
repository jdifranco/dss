package com.dridco.dss.chess.model;

/**
 * 
 * @author jdifranco
 *
 */
public class ChessGame {
	
	private Board board;
		
	public ChessGame() {
		this.initBoard();
		this.createAndPutPieces();
	}
	
	private void initBoard() {
		board = new Board();
	}	
	
	private void createAndPutPieces() {
		board.putPiece(Coordinate.at(1, 1), Pieces.newRook(PieceColor.WHITE));
		board.putPiece(Coordinate.at(1, 2), Pieces.newKnight(PieceColor.WHITE));
		board.putPiece(Coordinate.at(1, 3), Pieces.newBishop(PieceColor.WHITE));
		board.putPiece(Coordinate.at(1, 4), Pieces.newQueen(PieceColor.WHITE));
		board.putPiece(Coordinate.at(1, 5), Pieces.newKing(PieceColor.WHITE));
		board.putPiece(Coordinate.at(1, 6), Pieces.newBishop(PieceColor.WHITE));
		board.putPiece(Coordinate.at(1, 7), Pieces.newKnight(PieceColor.WHITE));
		board.putPiece(Coordinate.at(1, 8), Pieces.newRook(PieceColor.WHITE));
		
		board.putPiece(Coordinate.at(8, 1), Pieces.newRook(PieceColor.BLACK));
		board.putPiece(Coordinate.at(8, 2), Pieces.newKnight(PieceColor.BLACK));
		board.putPiece(Coordinate.at(8, 3), Pieces.newBishop(PieceColor.BLACK));
		board.putPiece(Coordinate.at(8, 4), Pieces.newQueen(PieceColor.BLACK));
		board.putPiece(Coordinate.at(8, 5), Pieces.newKing(PieceColor.BLACK));
		board.putPiece(Coordinate.at(8, 6), Pieces.newBishop(PieceColor.BLACK));
		board.putPiece(Coordinate.at(8, 7), Pieces.newKnight(PieceColor.BLACK));
		board.putPiece(Coordinate.at(8, 8), Pieces.newRook(PieceColor.BLACK));
		
		for (int i = 1; i <= Board.BOARD_MAX_WIDTH; i++) {
			board.putPiece(Coordinate.at(2, i), Pieces.newPawn(PieceColor.WHITE));
			board.putPiece(Coordinate.at(7, i), Pieces.newPawn(PieceColor.BLACK));
		}
				
	}
	
	public Board getBoard() {
		return board;
	}
	
}
