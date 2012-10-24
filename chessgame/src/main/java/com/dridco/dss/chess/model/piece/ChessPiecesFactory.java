package com.dridco.dss.chess.model.piece;



/**
 * Pieces factory.
 * 
 * @author jdifranco
 *
 */
public class ChessPiecesFactory {
	
	private ChessPiecesFactory () {
		// Dont want an instance of the factory.
	}
	
	public static ChessPiece newRook(ChessPieceColors color) {
		return new Rook(color);
	}
	
	public static ChessPiece newKnight(ChessPieceColors color) {
		return new Knight(color);
	}
	
	public static ChessPiece newBishop(ChessPieceColors color) {
		return new Bishop(color);
	}
	
	public static ChessPiece newQueen(ChessPieceColors color) {
		return new Queen(color);
	}
	
	public static ChessPiece newKing(ChessPieceColors color) {
		return new King(color);
	}
	
	public static ChessPiece newPawn(ChessPieceColors color) {
		return new Pawn(color);
	}
}
