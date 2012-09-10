package com.dridco.dss.chess.model.piece;

import com.dridco.dss.chess.model.Coordinates;

/**
 * 
 * @author jdifranco
 *
 */
public abstract class ChessPiece {
	
	private ChessPieceColors color;
	private boolean captured;
	
	public ChessPiece(ChessPieceColors color) {
		this.color = color;
	}
	
	public ChessPieceColors getColor() {
		return this.color;
	}
	
	public boolean isCaptured() {
		return this.captured;
	}
	
	public boolean isMovedVertically(Coordinates srcCord, Coordinates destCord) {
		return destCord.getCol() == srcCord.getCol() && destCord.getRow() != srcCord.getRow();
		
	}
	
	public boolean isMovedHorizontally(Coordinates srcCord, Coordinates destCord) {
		return destCord.getCol() != srcCord.getCol() && destCord.getRow() == srcCord.getRow();
	}
	
	public boolean isMovedDiagonally(Coordinates srcCord, Coordinates destCord) {
		int colsDelta = destCord.getCol() - srcCord.getCol();
		int rowsDelta = destCord.getRow() - srcCord.getRow();
		return Math.abs(colsDelta) == Math.abs(rowsDelta);
	}
	
	public abstract boolean isMoveValid(Coordinates srcCord, Coordinates destCord);
	
}
