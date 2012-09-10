package com.dridco.dss.chess.model.piece;

import com.dridco.dss.chess.model.Coordinates;
import com.dridco.dss.chess.model.square.SquareContainer;
import com.dridco.dss.chess.model.square.SquaresFactory;

/**
 * 
 * @author jdifranco
 *
 */
public abstract class ChessPiece {
	
	private ChessPieceColors color;
	private boolean captured;
	protected boolean hasBeenMoved;
	
	public ChessPiece(ChessPieceColors color) {
		super();
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

	public void moveTo(SquareContainer srcSqCont, SquareContainer destSqCont) {
		destSqCont.updateSquare(SquaresFactory.newOccupiedSquare(destSqCont.getCoordinates(), this));
		srcSqCont.updateSquare(SquaresFactory.newEmptySquare(srcSqCont.getCoordinates()));
		
		if(!this.hasBeenMoved) {
			this.hasBeenMoved = true;
		}
	}
	
}
