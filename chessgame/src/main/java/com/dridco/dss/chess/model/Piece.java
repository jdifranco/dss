package com.dridco.dss.chess.model;

/**
 * 
 * @author jdifranco
 *
 */
public abstract class Piece {
	
	private PieceColor color;
	private boolean captured;
	
	public Piece(PieceColor color) {
		this.color = color;
	}
	
	public PieceColor getColor() {
		return this.color;
	}
	
	public boolean isCaptured() {
		return this.captured;
	}
	
	public abstract boolean move(Square position);
	
}
