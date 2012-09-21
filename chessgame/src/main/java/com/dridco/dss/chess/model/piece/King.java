package com.dridco.dss.chess.model.piece;

import com.dridco.dss.chess.model.coordinate.Coordinates;
import com.dridco.dss.chess.util.piece.ChessPieceUtil;

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
		boolean isMovePatternValid = ChessPieceUtil.isMovedHorizontally(srcCord, destCord) 
				|| ChessPieceUtil.isMovedVertically(srcCord, destCord) 
				|| ChessPieceUtil.isMovedDiagonally(srcCord, destCord);
		return  isMovePatternValid && squareMovesDelta == 1;
	}
	
}
