package com.dridco.dss.chess.model.square;

import com.dridco.dss.chess.model.piece.ChessPiece;
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
	
	public ChessPiece getPiece() {
		return this.state.getPiece();
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
		
	@Override
	public String toString() {
		return state.toString();
	}

}
