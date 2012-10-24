package com.dridco.dss.chess.model.square;

import com.dridco.dss.chess.model.coordinate.Coordinates;
import com.dridco.dss.chess.model.piece.ChessPiece;
import com.dridco.dss.chess.model.piece.ChessPieceColors;

/**
 * 
 * @author jdifranco
 * 
 */
public abstract class SquareState {
	
	protected Coordinates coordinates;
	protected ChessPiece piece;
	
	public SquareState(Coordinates cords) {
		super();
		this.coordinates = cords;
	}
		
	public abstract boolean isOccupied();
		
	public abstract boolean hasSameColorPiece(ChessPieceColors color);
		
	public abstract void movePiece(Square srcSquare, Square destSquare);
	
	public abstract String toString();	
	
}
