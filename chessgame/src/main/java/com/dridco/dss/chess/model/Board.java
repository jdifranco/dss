package com.dridco.dss.chess.model;

import java.util.Map;

/**
 * 
 * @author jdifranco
 *
 */
public class Board {
	
	private Map<PiecePosition, Piece> squares;
	
	public Board(Map<PiecePosition, Piece> squares) {
		this.squares = squares;
	}
	
	public Piece getSquareContentAtPosition(PiecePosition position) {
		return squares.get(position);
	}
	
}
