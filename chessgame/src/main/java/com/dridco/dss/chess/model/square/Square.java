package com.dridco.dss.chess.model.square;

import com.dridco.dss.chess.model.Coordinates;
import com.dridco.dss.chess.model.piece.ChessPiece;

/**
 * 
 * @author jdifranco
 * 
 */
public abstract class Square {
	
	protected Coordinates coordinates;
	protected ChessPiece piece;
	
	public Square(Coordinates cords) {
		super();
		this.coordinates = cords;
	}
		
	public abstract boolean isOccupied();
	
	public abstract void movePiece(SquareContainer srcSquare, SquareContainer destSquare);
	
	public abstract String toString();	
	
}
