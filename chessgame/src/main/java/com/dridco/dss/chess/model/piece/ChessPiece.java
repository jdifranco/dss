package com.dridco.dss.chess.model.piece;

import com.dridco.dss.chess.model.move.ChessMove;

/**
 * 
 * @author jdifranco
 *
 */
public abstract class ChessPiece {
	
	private ChessPieceColors color;
	private boolean captured;
	protected boolean hasBeenMoved;
	
	public ChessPiece(ChessPieceColors color) {
		super();
		this.color = color;
	}
	
	public ChessPieceColors getColor() {
		return this.color;
	}
	
	public boolean isCaptured() {
		return this.captured;
	}
		
	public abstract boolean isMoveValid(ChessMove move);
	
}
