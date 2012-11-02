package com.dridco.dss.chess.model.square;

import com.dridco.dss.chess.model.piece.ChessPiece;
import com.dridco.dss.chess.model.piece.ChessPieceColors;

/**
 * 
 * @author jdifranco
 * 
 */
public abstract class SquareState {
	
	
	protected ChessPiece piece;
	
	public SquareState() {
		super();
	}
		
	public abstract boolean isOccupied();
		
	public abstract boolean hasSameColorPiece(ChessPieceColors color);
	
	public abstract String toString();

	public abstract ChessPiece getPiece();
	
}
