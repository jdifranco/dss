package com.dridco.dss.model;

/**
 * Representa un Peon.
 * 
 * @author jdifranco
 *
 */
public class Pawn extends Piece {

	public Pawn(PieceColor color) {
		super(color);
	}

	@Override
	public boolean canMove() {
		// TODO Not yet implemented
		return false;
	}
		
}
