package com.dridco.dss.chess.model.piece;

import com.dridco.dss.chess.model.Coordinates;

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
	public boolean isMoveValid(Coordinates srcCord,
			Coordinates destCord) {
		if(!this.isMovedHorizontally(srcCord, destCord) && this.isMovedVertically(srcCord, destCord)) {
			boolean isMovingBackWards = destCord.getRow() * this.getColor().getMovePattern() < 
				srcCord.getRow() * this.getColor().getMovePattern();
			int movesDelta = Math.abs(destCord.getRow() - srcCord.getRow());
			return !isMovingBackWards && (movesDelta == 1 || (!this.hasBeenMoved && movesDelta <= 2)); 
		}
		return false;
	}
	
}
