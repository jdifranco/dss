package com.dridco.dss.chess.model;

/**
 * Pieces factory.
 * 
 * @author jdifranco
 *
 */
public class Pieces {
	
	private Pieces () {
		// Dont want an instance of the factory.
	}
	
	public static Piece newRook(PieceColor color) {
		return new Rook(color);
	}
	
	public static Piece newKnight(PieceColor color) {
		return new Knight(color);
	}
	
	public static Piece newBishop(PieceColor color) {
		return new Bishop(color);
	}
	
	public static Piece newQueen(PieceColor color) {
		return new Queen(color);
	}
	
	public static Piece newKing(PieceColor color) {
		return new King(color);
	}
	
	public static Piece newPawn(PieceColor color) {
		return new Pawn(color);
	}
}
