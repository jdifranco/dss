package com.dridco.dss.chess.model.piece;

import com.dridco.dss.chess.model.move.ChessMove;

/**
 * 
 * @author jdifranco
 *
 */
public class King extends ChessPiece {

	public King(ChessPieceColors color) {
		super(color);
	}

	@Override
	public boolean isMoveValid(ChessMove move) {
		int squareMovesDelta = Math.abs(move.getDest().getCol() - move.getSrc().getCol()) + 
				Math.abs(move.getDest().getRow() - move.getSrc().getRow());
		
		boolean isStraightMoveValid = (move.isHorizontal() || move.isVertical()) && squareMovesDelta == 1;
		
		boolean isDiagonalMoveValid = move.isDiagonal() && squareMovesDelta == 2;
				
		return  isStraightMoveValid || isDiagonalMoveValid;
	}
	
}
