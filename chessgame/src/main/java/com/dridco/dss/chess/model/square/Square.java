package com.dridco.dss.chess.model.square;

import com.dridco.dss.chess.model.coordinate.Coordinates;
import com.dridco.dss.chess.model.piece.ChessPieceColors;


/**
 * 
 * @author jdifranco
 * 
 */
public class Square {

	protected SquareState state;

	public Square(SquareState square) {
		super();
		this.state = square;
	}
	
	public Coordinates getCoordinates() {
		return this.state.coordinates;
	}
	
	public boolean isOccupied() {
		return this.state.isOccupied();
	}
		
	public boolean hasSameColorPiece(ChessPieceColors color) {
		return this.state.hasSameColorPiece(color);
	}
	
	public void updateSquareState(SquareState state) {
		this.state = state;
	}
	
	public void movePiece(Square destSquare){
		state.movePiece(this, destSquare);
	}
	
	@Override
	public String toString() {
		return state.toString();
	}

}
