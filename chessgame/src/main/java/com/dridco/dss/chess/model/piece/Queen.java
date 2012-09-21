package com.dridco.dss.chess.model.piece;

import com.dridco.dss.chess.model.coordinate.Coordinates;
import com.dridco.dss.chess.util.piece.ChessPieceUtil;

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
		return ChessPieceUtil.isMovedHorizontally(srcCord, destCord) || 
				ChessPieceUtil.isMovedVertically(srcCord, destCord) || 
				ChessPieceUtil.isMovedDiagonally(srcCord, destCord);
	}
	
}
