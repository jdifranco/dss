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
	
	public static SquareContext newEmptySquare() {
		return new SquareContext(Squares.EMPTY);
	}

	public static SquareContext newOccupiedSquare(ChessPiece piece) {
		SquareContext ctx = new SquareContext(Squares.OCCUPIED);
		ctx.piece = piece;
		return ctx;
	}
	
}
