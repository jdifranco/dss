package com.dridco.dss.model;

/**
 * 
 * @author jdifranco
 *
 */
public abstract class Piece {
	
	private PieceColor color;
	private boolean captured;
	
	public Piece(PieceColor color) {
		
	}
	
	public PieceColor getColor() {
		return this.color;
	}
	
	public boolean isCaptured() {
		return this.captured;
	}
	
	public abstract boolean canMove();
	
}
