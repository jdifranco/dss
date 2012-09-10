package com.dridco.dss.chess.model.piece;

/**
 * 
 * @author jdifranco
 *
 */
public enum ChessPieceColors {
	WHITE(1), BLACK(-1);
	
	private int movePattern;
	
	private ChessPieceColors(int movePattern) {
		this.movePattern = movePattern;
	}
	
	public int getMovePattern() {
		return movePattern;
	}
}
