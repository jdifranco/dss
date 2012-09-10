package com.dridco.dss.chess.model.square;

import com.dridco.dss.chess.model.Coordinates;

/**
 * 
 * @author jdifranco
 * 
 */
public class EmptySquare extends Square {

	public EmptySquare(Coordinates cords) {
		super(cords);
	}

	@Override
	public boolean isOccupied() {
		return false;
	}

	@Override
	public void movePiece(SquareContainer srcSquare, SquareContainer destSquare) {
		throw new RuntimeException("This square is empty");
	}

	@Override
	public String toString() {
		return "  ";
	}

}
