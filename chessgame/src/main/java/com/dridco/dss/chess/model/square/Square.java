package com.dridco.dss.chess.model.square;



/**
 * 
 * @author jdifranco
 * 
 */
public abstract class Square {
	
	public abstract boolean isOccupied();
	
	public abstract void movePiece(SquareContext srcSquare, SquareContext destSquare);
	
	public abstract String toString(SquareContext square);	
	
}
