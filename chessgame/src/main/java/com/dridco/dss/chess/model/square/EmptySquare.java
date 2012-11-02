package com.dridco.dss.chess.model.square;

import com.dridco.dss.chess.model.piece.ChessPiece;
import com.dridco.dss.chess.model.piece.ChessPieceColors;

/**
 * 
 * @author jdifranco
 * 
 */
public class EmptySquare extends SquareState {

	public EmptySquare() {
		super();
	}

	@Override
	public ChessPiece getPiece() {
		throw new RuntimeException("This square is empty");
	}
	
	@Override
	public boolean isOccupied() {
		return false;
	}
	
	@Override
	public boolean hasSameColorPiece(ChessPieceColors color) {
		return false;
	}
	
	@Override
	public String toString() {
		return "  ";
	}
	
}
