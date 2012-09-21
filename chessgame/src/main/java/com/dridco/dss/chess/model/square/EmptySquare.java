package com.dridco.dss.chess.model.square;

import com.dridco.dss.chess.model.coordinate.Coordinates;
import com.dridco.dss.chess.model.piece.ChessPiece;

/**
 * 
 * @author jdifranco
 * 
 */
public class EmptySquare extends SquareState {

	public EmptySquare(Coordinates cords) {
		super(cords);
	}

	@Override
	public boolean isOccupied() {
		return false;
	}

	@Override
	public boolean hasSameColorPiece(ChessPiece pieceToCompare) {
		return false;
	}
	
	@Override
	public void movePiece(Square srcSquare, Square destSquare) {
		throw new RuntimeException("This square is empty");
	}

	@Override
	public String toString() {
		return "  ";
	}

}
