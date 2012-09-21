package com.dridco.dss.chess.model.piece;

import com.dridco.dss.chess.model.coordinate.Coordinates;
import com.dridco.dss.chess.util.piece.ChessPieceUtil;

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
		if(!ChessPieceUtil.isMovedHorizontally(srcCord, destCord) && ChessPieceUtil.isMovedVertically(srcCord, destCord)) {
			int movesDelta = Math.abs(destCord.getRow() - srcCord.getRow());
			return !ChessPieceUtil.isMovedBackward(this, srcCord, destCord) &&
					(movesDelta == 1 || (!this.hasBeenMoved && movesDelta <= 2)); 
		}
		return false;
	}
	
}
