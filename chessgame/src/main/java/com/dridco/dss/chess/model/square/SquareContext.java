package com.dridco.dss.chess.model.square;

import com.dridco.dss.chess.model.Coordinates;
import com.dridco.dss.chess.model.piece.ChessPiece;

/**
 * 
 * @author jdifranco
 * 
 */
public class SquareContext {
	
	protected Coordinates coordinates;
	protected ChessPiece piece;
	protected Squares square;

	public SquareContext(Coordinates cords, Squares state) {
		super();
		this.coordinates = cords;
		this.square = state;
	}
	
	public boolean isOccupied() {
		return this.square.isOccupied();
	}

	public void movePiece(SquareContext destSquare){
		square.movePiece(this, destSquare);
	}
	
	@Override
	public String toString() {
		return square.toString(this);
	}

}
