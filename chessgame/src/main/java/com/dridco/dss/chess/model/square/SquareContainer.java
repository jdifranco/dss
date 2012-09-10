package com.dridco.dss.chess.model.square;

import com.dridco.dss.chess.model.Coordinates;


/**
 * 
 * @author jdifranco
 * 
 */
public class SquareContainer {

	protected Square square;

	public SquareContainer(Square square) {
		super();
		this.square = square;
	}
	
	public Coordinates getCoordinates() {
		return this.square.coordinates;
	}
	
	public boolean isOccupied() {
		return this.square.isOccupied();
	}
	
	public void updateSquare(Square square) {
		this.square = square;
	}
	
	public void movePiece(SquareContainer destSquare){
		square.movePiece(this, destSquare);
	}
	
	@Override
	public String toString() {
		return square.toString();
	}

}
