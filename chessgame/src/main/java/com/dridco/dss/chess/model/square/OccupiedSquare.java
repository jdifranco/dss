package com.dridco.dss.chess.model.square;

import com.dridco.dss.chess.model.piece.ChessPiece;
import com.dridco.dss.chess.model.piece.ChessPieceColors;

/**
 * 
 * @author jdifranco
 * 
 */
public class OccupiedSquare extends SquareState {

	public OccupiedSquare(ChessPiece piece) {
		super();
		this.piece = piece;
	}

	@Override
	public ChessPiece getPiece() {
		return this.piece;
	}
	
	@Override
	public boolean isOccupied() {
		return true;
	}

	@Override
	public boolean hasSameColorPiece(ChessPieceColors color) {
		return this.piece.getColor() == color;
	}
	
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append(piece.getColor().name().charAt(0));
		result.append(piece.getClass().getSimpleName().charAt(0));
		return result.toString();
	}

}
