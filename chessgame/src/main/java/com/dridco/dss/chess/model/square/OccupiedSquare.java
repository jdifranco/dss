package com.dridco.dss.chess.model.square;

import com.dridco.dss.chess.model.coordinate.Coordinates;
import com.dridco.dss.chess.model.piece.ChessPiece;

/**
 * 
 * @author jdifranco
 * 
 */
public class OccupiedSquare extends SquareState {

	public OccupiedSquare(Coordinates cords) {
		super(cords);
	}
	
	public OccupiedSquare(Coordinates cords, ChessPiece piece) {
		super(cords);
		this.piece = piece;
	}

	@Override
	public boolean isOccupied() {
		return true;
	}

	@Override
	public boolean hasSameColorPiece(ChessPiece pieceToCompare) {
		return this.piece.getColor() == pieceToCompare.getColor();
	}
	
	@Override
	public void movePiece(Square srcSquare, Square destSquare) {
		this.piece.moveTo(srcSquare, destSquare);
	}

	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append(piece.getColor().name().charAt(0));
		result.append(piece.getClass().getSimpleName().charAt(0));
		return result.toString();
	}

}
