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
	
	public static SquareState newEmptySquare(Coordinates cords) {
		return new EmptySquare(cords);
	}
	
	public static SquareState newOccupiedSquare(Coordinates cords, ChessPiece piece) {
		return new OccupiedSquare(cords, piece);
	}
	
	public static Square newEmptySquareContainer(Coordinates cords) {
		return new Square(newEmptySquare(cords));
	}
	
	public static Square newOccupiedSquareContainer(Coordinates cords, ChessPiece piece) {
		return new Square(newOccupiedSquare(cords, piece));
	}
}
