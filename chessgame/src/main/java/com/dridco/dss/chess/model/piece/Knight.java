package com.dridco.dss.chess.model.piece;

import com.dridco.dss.chess.model.move.ChessMove;

/**
 * 
 * @author jdifranco
 *
 */
public class Knight extends ChessPiece {

	private static int VALID_SQUARES_DELTA = 3;
	
	public Knight(ChessPieceColors color) {
		super(color);
	}

	@Override
	public boolean isMoveValid(ChessMove move) {
		int colsDelta = Math.abs(move.getDest().getCol() - move.getSrc().getCol());
		int rowsDelta = Math.abs(move.getDest().getRow() - move.getSrc().getRow());
		
		return colsDelta > 0 && rowsDelta > 0 && colsDelta + rowsDelta == VALID_SQUARES_DELTA;
	}
	
}
