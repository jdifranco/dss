package com.dridco.dss.model;

/**
 * 
 * @author jdifranco
 *
 */
public class PiecesFactory {
	
	private PiecesFactory () {
		
	}
	
	public static Pawn createPawn(PieceColor color) {
		return new Pawn(color);
	}
}
