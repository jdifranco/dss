package com.dridco.dss.chess.model;

/**
 * Pieces factory.
 * 
 * @author jdifranco
 *
 */
public class Pieces {
	
	private Pieces () {
		// Dont want an instance of this factory.
	}
	
	public static Piece createRook(PieceColor color) {
		return new Rook(color);
	}
	
	public static Piece createKnight(PieceColor color) {
		return new Knight(color);
	}
	
	public static Piece createBishop(PieceColor color) {
		return new Bishop(color);
	}
	
	public static Piece createQueen(PieceColor color) {
		return new Queen(color);
	}
	
	public static Piece createKing(PieceColor color) {
		return new King(color);
	}
	
	public static Piece createPawn(PieceColor color) {
		return new Pawn(color);
	}
}
