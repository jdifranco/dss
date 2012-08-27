package com.dridco.dss.chess.model.piece;

import com.dridco.dss.chess.model.Coordinates;

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
	public boolean canMoveTo(Coordinates srcCord,
			Coordinates destCord) {
		return true;
	}
	
}
