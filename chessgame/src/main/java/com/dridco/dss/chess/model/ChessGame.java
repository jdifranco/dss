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
		board.putPiece(Coordinate.at(1, 1), Pieces.createRook(PieceColor.WHITE_PIECE));
		board.putPiece(Coordinate.at(1, 2), Pieces.createKnight(PieceColor.WHITE_PIECE));
		board.putPiece(Coordinate.at(1, 3), Pieces.createBishop(PieceColor.WHITE_PIECE));
		board.putPiece(Coordinate.at(1, 4), Pieces.createQueen(PieceColor.WHITE_PIECE));
		board.putPiece(Coordinate.at(1, 5), Pieces.createKing(PieceColor.WHITE_PIECE));
		board.putPiece(Coordinate.at(1, 6), Pieces.createBishop(PieceColor.WHITE_PIECE));
		board.putPiece(Coordinate.at(1, 7), Pieces.createKnight(PieceColor.WHITE_PIECE));
		board.putPiece(Coordinate.at(1, 8), Pieces.createRook(PieceColor.WHITE_PIECE));
		
		board.putPiece(Coordinate.at(8, 1), Pieces.createRook(PieceColor.BLACK_PIECE));
		board.putPiece(Coordinate.at(8, 2), Pieces.createKnight(PieceColor.BLACK_PIECE));
		board.putPiece(Coordinate.at(8, 3), Pieces.createBishop(PieceColor.BLACK_PIECE));
		board.putPiece(Coordinate.at(8, 4), Pieces.createQueen(PieceColor.BLACK_PIECE));
		board.putPiece(Coordinate.at(8, 5), Pieces.createKing(PieceColor.BLACK_PIECE));
		board.putPiece(Coordinate.at(8, 6), Pieces.createBishop(PieceColor.BLACK_PIECE));
		board.putPiece(Coordinate.at(8, 7), Pieces.createKnight(PieceColor.BLACK_PIECE));
		board.putPiece(Coordinate.at(8, 8), Pieces.createRook(PieceColor.BLACK_PIECE));
		
		for (int i = 1; i <= Board.BOARD_MAX_WIDTH; i++) {
			board.putPiece(Coordinate.at(2, i), Pieces.createPawn(PieceColor.WHITE_PIECE));
			board.putPiece(Coordinate.at(7, i), Pieces.createPawn(PieceColor.BLACK_PIECE));
		}
				
	}
	
	public Board getBoard() {
		return board;
	}
	
}
