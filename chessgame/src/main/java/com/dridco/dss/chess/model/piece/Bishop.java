package com.dridco.dss.chess.model.piece;

import com.dridco.dss.chess.model.coordinate.Coordinates;
import com.dridco.dss.chess.util.piece.ChessPieceUtil;

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
	public boolean isMoveValid(Coordinates srcCord,
			Coordinates destCord) {	
		return ChessPieceUtil.isMovedDiagonally(srcCord, destCord);
	}
	
}
