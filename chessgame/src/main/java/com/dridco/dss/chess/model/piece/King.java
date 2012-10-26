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
		
		boolean isStraightMoveValid = 
				(ChessPieceUtil.isMovedHorizontally(srcCord, destCord) || ChessPieceUtil.isMovedVertically(srcCord, destCord)) && squareMovesDelta == 1;
		
		boolean isDiagonalMoveValid = ChessPieceUtil.isMovedDiagonally(srcCord, destCord) && squareMovesDelta == 2;
				
		return  isStraightMoveValid || isDiagonalMoveValid;
	}
	
}
