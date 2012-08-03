package com.dridco.dss.chess.model;

/**
 * 
 * @author jdifranco
 * 
 */
public final class Square {
	
	private SquarePosition position;
	private boolean occupied;
	private Piece piece;
	
	public Square(SquarePosition position) {
		this(position, null);
	}
	
	public Square(SquarePosition position, Piece piece) {
		this.position = position;
		this.occupied = piece == null;
		this.piece = piece;
	}
	
	public SquarePosition getPosition() {
		return position;
	}
	
	public boolean isOccupied() {
		return occupied;
	}
	
	public Piece getPiece() {
		return piece;
	}

}
