package com.dridco.dss.chess.model;

/**
 * 
 * @author jdifranco
 *
 */
public abstract class Piece {
	
	private PieceColor color;
	private PiecePosition position;
	private boolean captured;
	
	public Piece(PieceColor color, PiecePosition position) {
		this.color = color;
		this.position = position;
	}
	
	public PieceColor getColor() {
		return this.color;
	}
	
	public PiecePosition getPosition() {
		return position;
	}
	
	public boolean isCaptured() {
		return this.captured;
	}
	
	public abstract boolean move(PiecePosition position);
	
}
