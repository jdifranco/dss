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
	
	public static SquareContext newEmptySquare(Coordinates cords) {
		return new SquareContext(cords, new EmptySquare());
	}

	public static SquareContext newOccupiedSquare(Coordinates cords, ChessPiece piece) {
		SquareContext ctx = new SquareContext(cords, new OccupiedSquare());
		ctx.piece = piece;
		return ctx;
	}
	
}
