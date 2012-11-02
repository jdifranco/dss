package com.dridco.dss.chess.model.piece;

import com.dridco.dss.chess.model.move.ChessMove;

/**
 * 
 * @author jdifranco
 *
 */
public class Bishop extends ChessPiece {

	public Bishop(ChessPieceColors color) {
		super(color);
	}

	@Override
	public boolean isMoveValid(ChessMove move) {	
		return move.isDiagonal();
	}
	
}
