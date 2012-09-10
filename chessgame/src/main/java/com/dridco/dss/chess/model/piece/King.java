package com.dridco.dss.chess.model.piece;

import com.dridco.dss.chess.model.Coordinates;

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
	public boolean isMoveValid(Coordinates srcCord,
			Coordinates destCord) {
		int squareMovesDelta = Math.abs(destCord.getCol() - srcCord.getCol()) + Math.abs(destCord.getRow() - srcCord.getRow());
		boolean isMovePatternValid = this.isMovedHorizontally(srcCord, destCord) || this.isMovedVertically(srcCord, destCord) || 
				this.isMovedDiagonally(srcCord, destCord);
		return  isMovePatternValid && squareMovesDelta == 1;
	}
	
}
