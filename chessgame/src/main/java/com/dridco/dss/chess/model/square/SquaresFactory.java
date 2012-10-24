package com.dridco.dss.chess.model.square;

import com.dridco.dss.chess.model.coordinate.Coordinates;
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
	
	public static SquareState newEmptySquareState(Coordinates cords) {
		return new EmptySquare(cords);
	}
	
	public static SquareState newOccupiedSquareState(Coordinates cords, ChessPiece piece) {
		return new OccupiedSquare(cords, piece);
	}
	
	public static Square newEmptySquare(Coordinates cords) {
		return new Square(newEmptySquareState(cords));
	}
	
	public static Square newOccupiedSquare(Coordinates cords, ChessPiece piece) {
		return new Square(newOccupiedSquareState(cords, piece));
	}
}
