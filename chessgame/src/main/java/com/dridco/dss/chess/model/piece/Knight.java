package com.dridco.dss.chess.model.piece;

import com.dridco.dss.chess.model.Coordinates;

/**
 * 
 * @author jdifranco
 *
 */
public class Knight extends ChessPiece {

	private static int VALID_SQUARES_DELTA = 3;
	
	public Knight(ChessPieceColors color) {
		super(color);
	}

	@Override
	public boolean canMoveTo(Coordinates srcCord,
			Coordinates destCord) {
		int colsDelta = Math.abs(destCord.getCol() - srcCord.getCol());
		int rowsDelta = Math.abs(destCord.getRow() - srcCord.getRow());
		
		return colsDelta > 0 && rowsDelta > 0 && colsDelta + rowsDelta == VALID_SQUARES_DELTA;
	}
	
}
