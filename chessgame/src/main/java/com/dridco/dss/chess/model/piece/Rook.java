package com.dridco.dss.chess.model.piece;

import com.dridco.dss.chess.model.move.ChessMove;

/**
 * 
 * @author jdifranco
 *
 */
public class Rook extends ChessPiece {

	public Rook(ChessPieceColors color) {
		super(color);
	}

	@Override
	public boolean isMoveValid(ChessMove move) {
		return move.isHorizontal() || move.isVertical();
	}
	
}
