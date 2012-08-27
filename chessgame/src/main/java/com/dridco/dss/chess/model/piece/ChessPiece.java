package com.dridco.dss.chess.model.piece;

import com.dridco.dss.chess.model.square.SquareContext;

/**
 * 
 * @author jdifranco
 *
 */
public abstract class ChessPiece {
	
	private ChessPieceColors color;
	private boolean captured;
	
	public ChessPiece(ChessPieceColors color) {
		this.color = color;
	}
	
	public ChessPieceColors getColor() {
		return this.color;
	}
	
	public boolean isCaptured() {
		return this.captured;
	}
	
	public abstract boolean move(SquareContext position);
	
}
