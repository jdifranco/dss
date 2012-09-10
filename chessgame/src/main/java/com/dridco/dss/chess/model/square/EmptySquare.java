package com.dridco.dss.chess.model.square;

/**
 * 
 * @author jdifranco
 * 
 */
public class EmptySquare extends Square {

	@Override
	public boolean isOccupied() {
		return false;
	}

	@Override
	public void movePiece(SquareContext srcSquare, SquareContext destSquare) {
		throw new RuntimeException("This square is empty");
	}

	@Override
	public String toString(SquareContext square) {
		return "  ";
	}

}
