package com.dridco.dss.chess.model.square;

import com.dridco.dss.chess.model.piece.ChessPiece;

/**
 * 
 * @author jdifranco
 *
 */
public class SquaresFactory {
	
	private SquaresFactory () {
		// Dont want an instance of the factory.
	}
	
	public static SquareState newEmptySquareState() {
		return new EmptySquare();
	}
	
	public static SquareState newOccupiedSquareState(ChessPiece piece) {
		return new OccupiedSquare(piece);
	}
	
	public static Square newEmptySquare() {
		return new Square(newEmptySquareState());
	}
	
	public static Square newOccupiedSquare(ChessPiece piece) {
		return new Square(newOccupiedSquareState(piece));
	}
}
