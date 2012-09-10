package com.dridco.dss.chess.model.piece;

import com.dridco.dss.chess.model.Coordinates;

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
	public boolean isMoveValid(Coordinates srcCord,
			Coordinates destCord) {
		return this.isMovedHorizontally(srcCord, destCord) || 
				this.isMovedVertically(srcCord, destCord);
	}
	
}
