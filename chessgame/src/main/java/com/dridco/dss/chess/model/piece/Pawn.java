package com.dridco.dss.chess.model.piece;

import com.dridco.dss.chess.model.move.ChessMove;

/**
 * 
 * @author jdifranco
 *
 */
public class Pawn extends ChessPiece {
		
	public Pawn(ChessPieceColors color) {
		super(color);
	}

	@Override
	public boolean isMoveValid(ChessMove move) {
		if(!move.isBackward()) {
			int rowsDelta = Math.abs(move.getDest().getRow() - move.getSrc().getRow());
			int colsDelta = Math.abs(move.getDest().getCol() - move.getSrc().getCol());
			
			if(move.isCapture()) {
				return move.isDiagonal() && rowsDelta + colsDelta == 2 ;
			} else if(move.isVertical()) {
				return rowsDelta == 1 || (!this.hasBeenMoved && rowsDelta <= 2); 
			}			
		}
		
		return false;
	}
	
}
