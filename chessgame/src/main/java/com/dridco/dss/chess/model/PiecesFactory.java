package com.dridco.dss.chess.model;

/**
 * 
 * @author jdifranco
 *
 */
public class PiecesFactory {
	
	private PiecesFactory () {
		
	}
	
	public static Pawn createPawn(PieceColor color, PiecePosition position) {
		return new Pawn(color, position);
	}
}
