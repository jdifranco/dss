package com.dridco.dss.chess.model.piece;

import com.dridco.dss.chess.model.Coordinates;

/**
 * 
 * @author jdifranco
 *
 */
public class Queen extends ChessPiece {

	public Queen(ChessPieceColors color) {
		super(color);
	}

	@Override
	public boolean isMoveValid(Coordinates srcCord,
			Coordinates destCord) {		
		return this.isMovedHorizontally(srcCord, destCord) || 
				this.isMovedVertically(srcCord, destCord) || 
				this.isMovedDiagonally(srcCord, destCord);
	}
	
}
