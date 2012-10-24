package com.dridco.dss.chess.model.piece;

import com.dridco.dss.chess.model.coordinate.Coordinates;
import com.dridco.dss.chess.model.square.Square;
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
	
	public void moveTo(Square srcSq, Square destSq) {
			
		if(destSq.hasSameColorPiece(this.color)) {
			throw new RuntimeException("The dest Square is occupied with same color piece.");
		}
		
		if (!this.isMoveValid(srcSq.getCoordinates(),
				destSq.getCoordinates())) {
			throw new RuntimeException("Piece move is invalid.");
		}		
		
		destSq.updateSquareState(SquaresFactory.newOccupiedSquareState(destSq.getCoordinates(), this));
		srcSq.updateSquareState(SquaresFactory.newEmptySquareState(srcSq.getCoordinates()));
		
		if(!this.hasBeenMoved) {
			this.hasBeenMoved = true;
		}
	}
	
	protected abstract boolean isMoveValid(Coordinates srcCord, Coordinates destCord);
	
}
