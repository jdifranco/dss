package com.dridco.dss.chess.model.square;

import com.dridco.dss.chess.model.Coordinates;
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
	
	public static Square newEmptySquare(Coordinates cords) {
		return new EmptySquare(cords);
	}
	
	public static Square newOccupiedSquare(Coordinates cords, ChessPiece piece) {
		return new OccupiedSquare(cords, piece);
	}
	
	public static SquareContainer newEmptySquareContainer(Coordinates cords) {
		return new SquareContainer(newEmptySquare(cords));
	}
	
	public static SquareContainer newOccupiedSquareContainer(Coordinates cords, ChessPiece piece) {
		return new SquareContainer(newOccupiedSquare(cords, piece));
	}
}
