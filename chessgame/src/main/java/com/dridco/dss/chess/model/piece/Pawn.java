package com.dridco.dss.chess.model.piece;

import com.dridco.dss.chess.model.Coordinates;

/**
 * 
 * @author jdifranco
 *
 */
public class Pawn extends ChessPiece {
	
	private boolean firstMove;
	
	public Pawn(ChessPieceColors color) {
		super(color);
		this.firstMove = false;
	}

	@Override
	public boolean isMoveValid(Coordinates srcCord,
			Coordinates destCord) {
		return true;
	}
	
}
